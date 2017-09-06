package org.bbaw.bts.core.services.impl.services;

import java.io.IOException;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import javax.inject.Inject;

import org.apache.commons.net.ntp.NTPUDPClient;
import org.apache.commons.net.ntp.NtpV3Packet;
import org.apache.commons.net.ntp.TimeInfo;
import org.apache.commons.net.ntp.TimeStamp;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.services.SystemTimeService;
import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.e4.core.services.log.Logger;
import org.osgi.service.prefs.BackingStoreException;

public class SystemTimeServiceImpl implements SystemTimeService {


	private static final long TIME_CHECK_INTERVAL = 30000000; // 8 hours

	// configurationscope preferences
	private IEclipsePreferences prefs = ConfigurationScope.INSTANCE.getNode("org.bbaw.bts.app");

	private long systemClockDifference = 0;

	private long lastTimeCheck = 1;

	@Inject
	private Logger logger;

	public SystemTimeServiceImpl() {
		System.out.println("init system time service");

		lastTimeCheck = prefs.getLong(BTSConstants.PREF_NTP_LATEST, 0);
		systemClockDifference = prefs.getLong(BTSConstants.PREF_SYSTEM_CLOCK_DIFFERENCE, 0);
		
		System.out.println("ntp latest check: "+lastTimeCheck);
		System.out.println("ntp clock diff: "+systemClockDifference);
		
		//getSystemClockDifference(Calendar.getInstance(TimeZone.getTimeZone("UTC")).getTime());

	}

	@Override
	public Date getAdjustedTime() {
		Date local = Calendar.getInstance(TimeZone.getTimeZone("UTC")).getTime(); // XXX shit
		Long difference = getSystemClockDifference(local);
		long system = local.getTime();
		return new Date(system + difference);
	}

	@Override
	public Long getSystemClockDifference(Date local) {
		if (lastTimeCheck < 0 || (local.getTime() > lastTimeCheck + TIME_CHECK_INTERVAL))
		{
			systemClockDifference = checkAndCalculateClockDifference();
			lastTimeCheck = local.getTime();
			prefs.putLong(BTSConstants.PREF_NTP_LATEST, lastTimeCheck);
			prefs.putLong(BTSConstants.PREF_SYSTEM_CLOCK_DIFFERENCE, systemClockDifference);
			try {
				prefs.flush();
			} catch (BackingStoreException e) {
				System.out.println("error saving preferences.");
				e.printStackTrace();
			}
		}
		return systemClockDifference;
	}

	private Long checkAndCalculateClockDifference() {
		long ntp = 0;
		String servers = prefs.get(BTSConstants.PREF_NTP_SERVERS,
						BTSConstants.DEFAULT_NTP_SERVERS);
		System.out.println("NTP servers: " + servers);
		if (servers == null) {
			return ntp;
		}
		String[] serverArray = servers.split(BTSCoreConstants.SPLIT_PATTERN);
		NTPUDPClient client = new NTPUDPClient();
		// We want to timeout if a response takes longer than 7 seconds
		client.setDefaultTimeout(7000);
		TimeInfo info = null;
		try {
			client.open();
			for (String arg : serverArray) {
				InetAddress hostAddr = null;
				try {
					hostAddr = InetAddress.getByName(arg);
					System.out.println("> " + hostAddr.getHostName() + "/"
							+ hostAddr.getHostAddress());
					info = client.getTime(hostAddr);
					break;
				} catch (IOException ioe) {
					logger.error(ioe, "Inaccessable host address: " + arg);
				}
			}
		} catch (SocketException e) {
			logger.error(e);
		}
		client.close();

		if (info == null)
		{
			return ntp;
		}
        NtpV3Packet message = info.getMessage();

		 // Transmit time is time reply sent by server (t3)
        TimeStamp xmitNtpTime = message.getTransmitTimeStamp();
        logger.info(" Transmit Timestamp:\t" + xmitNtpTime + "  " + xmitNtpTime.toDateString());

        info.computeDetails(); // compute offset/delay if not already done
        Long offsetValue = info.getOffset();
        Long delayValue = info.getDelay();
        String delay = (delayValue == null) ? "N/A" : delayValue.toString();
        String offset = (offsetValue == null) ? "N/A" : offsetValue.toString();

        logger.info(" Roundtrip delay(ms)=" + delay
                + ", clock offset(ms)=" + offset); // offset in ms
        ntp = xmitNtpTime.getTime();
		logger.info("NTP: " + ntp);

		return offsetValue;
	}

}

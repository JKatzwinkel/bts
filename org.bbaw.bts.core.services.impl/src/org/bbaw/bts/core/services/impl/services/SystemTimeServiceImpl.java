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
import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.services.SystemTimeService;
import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.e4.core.services.log.Logger;

public class SystemTimeServiceImpl implements SystemTimeService {


	private static final long TIME_CHECK_INTERVAL = 3000000;

	// configurationscope preferences
	private IEclipsePreferences prefs = ConfigurationScope.INSTANCE.getNode("org.bbaw.bts.app");

	@Inject
	@Optional
	@Preference(value = BTSConstants.PREF_SYSTEM_CLOCK_DIFFERENCE, nodePath = "org.bbaw.bts.app")
	private Long systemClockDifference;

	@Inject
	@Preference(value = BTSConstants.PREF_NTP_LATEST, nodePath = "org.bbaw.bts.app")
	private Long lastTimeCheck;

	@Inject
	private Logger logger;

	public SystemTimeServiceImpl() {
		System.out.println("init system time service");


	}

	@Override
	public Long getSystemClockDifference(Date local) {
		if (lastTimeCheck == null || (local.getTime() > lastTimeCheck + TIME_CHECK_INTERVAL))
		{
			systemClockDifference = checkAndCalculateClockDifference();
		}
		return systemClockDifference;
	}

	private Long checkAndCalculateClockDifference() {
		long ntp = 0;
		String servers = prefs.get(BTSConstants.PREF_NTP_SERVERS,
						BTSConstants.DEFAULT_NTP_SERVERS);
		logger.info("NTP servers: " + servers);
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
					logger.info("> " + hostAddr.getHostName() + "/"
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
		Date d = Calendar.getInstance(TimeZone.getTimeZone("UTC")).getTime();
		lastTimeCheck = d.getTime();
		long system = d.getTime();
		long diff = ntp - system;
		logger.info("Difference NTP - system: " + diff);

		return offsetValue;
	}

}

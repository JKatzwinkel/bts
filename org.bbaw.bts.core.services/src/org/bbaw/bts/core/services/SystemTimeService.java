package org.bbaw.bts.core.services;

import java.util.Date;

public interface SystemTimeService {

	Long getSystemClockDifference(Date local);
}

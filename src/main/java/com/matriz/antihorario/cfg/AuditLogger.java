package com.matriz.antihorario.cfg;

import org.slf4j.Logger;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

public final class AuditLogger {

	private static final Marker AUDIT_MARKER = MarkerFactory.getMarker("AUDIT");

	public static void log(Logger logger, final String message) {
		logger.error(AUDIT_MARKER, message);
	}

}

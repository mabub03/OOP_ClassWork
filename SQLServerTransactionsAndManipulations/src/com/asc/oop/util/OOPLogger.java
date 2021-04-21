package com.asc.oop.util;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.*;

public class OOPLogger {
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	public void makeAnInfoLog() {
		
	LOGGER.log(Level.INFO, "Our first Log at the INFO Level!!");
	}
	public void makeAnInfoLog(String classStr) {
		LOGGER.log(Level.INFO, classStr);
	}
	public void logSumin(Level hotErNot, String ThisIsWhatchaWatchasWant) {
		LOGGER.log(hotErNot, ThisIsWhatchaWatchasWant);
	}
}

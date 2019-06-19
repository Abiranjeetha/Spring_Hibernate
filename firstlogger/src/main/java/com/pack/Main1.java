package com.pack;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Main1 {
	static final Logger logger=Logger.getLogger(Main1.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PropertyConfigurator.configure("log4j.properties");
		logger.debug("sample debug message");
		logger.error("sample error message");
		logger.fatal("sample fatal message");
		logger.info("sample info message");
		logger.warn("sample warn message");
	}
}

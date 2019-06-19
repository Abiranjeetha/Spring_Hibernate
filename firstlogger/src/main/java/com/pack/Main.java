package com.pack;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Main {
	static final Logger logger=Logger.getLogger(Main.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicConfigurator.configure();//log all messges on the console,,default consoleappender, patternlayout
		logger.debug("sample debug message");
		logger.error("sample error message");
		logger.fatal("sample fatal message");
		logger.info("sample info message");
		logger.warn("sample warn message");
	}

}

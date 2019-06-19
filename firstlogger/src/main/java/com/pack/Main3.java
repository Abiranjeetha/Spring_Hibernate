package com.pack;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Main3 {
	static final Logger logger=Logger.getLogger(Main2.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DOMConfigurator.configure("log4j.xml");
		logger.debug("sample debug message");
		logger.error("sample error message");
		logger.fatal("sample fatal message");
		logger.info("sample info message");
		logger.warn("sample warn message");
	}

}

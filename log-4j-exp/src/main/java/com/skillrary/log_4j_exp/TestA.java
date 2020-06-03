package com.skillrary.log_4j_exp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestA {

	
	static Logger ref= LogManager.getLogger("myLogger");
			
			
	public static void main(String[] args) {
		
		
		ref.error("I am error log message");
		ref.debug("I am error log message");
		ref.warn("I am error log message");
		ref.fatal("I am error log message");
		ref.info("I am error log message");
	}
}

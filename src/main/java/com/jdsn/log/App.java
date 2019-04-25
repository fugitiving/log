package com.jdsn.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.jdsn.loggertest.LoggerTest;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Logger logger = LogManager.getLogger(App.class);
    	LoggerTest lt = new LoggerTest();
    	
    	for(int i = 0; i <5000; ++i) {
    		logger.info(i);	
    		lt.printLog(i);
    	}
    }
}

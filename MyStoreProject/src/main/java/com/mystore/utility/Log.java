package com.mystore.utility;

import org.apache.log4j.Logger;

public class Log {
	
	// Initialize Log4j logs
	public static Logger Log = Logger.getLogger(Log.class.getName());

	public static void startTestCase(String sTestCaseName){		  
		 Log.info("====================================="+sTestCaseName+" TEST START=========================================");
		 }
	
	public static void endTestCase(String sTestCaseName){
		Log.info("====================================="+sTestCaseName+" TEST END=========================================");
		 }
	
	
}

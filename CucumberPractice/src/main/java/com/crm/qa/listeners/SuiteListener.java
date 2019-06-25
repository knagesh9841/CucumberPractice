package com.crm.qa.listeners;

import org.apache.log4j.Logger;
import org.testng.ISuite;
import org.testng.ISuiteListener;

import com.crm.qa.loggerHelp.LoggerHelper;

public class SuiteListener implements ISuiteListener{
	
	
	Logger Log = LoggerHelper.getLogger(SuiteListener.class.getName());

	@Override
	public void onStart(ISuite suite) {
		Log.info("-----------About to begin executing Suite "+suite.getName()+".-----------");
	}

	@Override
	public void onFinish(ISuite suite) {
		Log.info("-----------About to end executing Suite "+suite.getName()+".-----------");
	}

}

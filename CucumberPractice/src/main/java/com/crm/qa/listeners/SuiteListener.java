package com.crm.qa.listeners;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.ISuite;
import org.testng.ISuiteListener;

import com.aventstack.extentreports.ExtentReports;
import com.crm.qa.loggerHelp.LoggerHelper;
import com.crm.qa.util.ExtentManager;

public class SuiteListener implements ISuiteListener{
	
	
	private static ExtentReports extent = ExtentManager.createInstance();
	Logger Log = LoggerHelper.getLogger(SuiteListener.class.getName());

	@Override
	public void onStart(ISuite suite) {
		
		extent = ExtentManager.getInstance();
		Log.info("-----------About to begin executing Suite "+suite.getName()+".-----------");
	}

	@Override
	public void onFinish(ISuite suite) {
		
		extent.flush();
		try {
			ExtentManager.copyLatestExtentReport();
		} catch (IOException e) {
			
		}
		Log.info("-----------About to end executing Suite "+suite.getName()+".-----------");
	}

}

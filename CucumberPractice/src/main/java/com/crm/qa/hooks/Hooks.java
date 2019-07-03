package com.crm.qa.hooks;

import org.apache.log4j.Logger;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.crm.qa.loggerHelp.LoggerHelper;
import com.crm.qa.util.ExtentManager;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import cucumber.api.java.BeforeStep;

public class Hooks {
	
	Logger Log = LoggerHelper.getLogger(Hooks.class.getName());
	public static ThreadLocal<ExtentTest> test = new ThreadLocal<>();
	private static ExtentReports extent = null;
	
	@Before()
    public void beforeScenarios(Scenario scenario){
	
		extent = ExtentManager.getInstance();
		ExtentTest extentTest = extent.createTest(scenario.getName());
        test.set(extentTest);
		Log.info("------------Scenario "+scenario.getName()+" is started.-------------");
		
		
    }	
	
	
	@After()
    public void afterScenarios(Scenario scenario){
		
		
		Log.info("------------Scenario "+scenario.getName()+" is stopped.-------------");
    }
	
	@BeforeStep
	public void beforeStep()
	{
		Log.info("------------Before Step is called.-------------");
		
	}
	
	@AfterStep
	public void afterStep()
	{
		Log.info("------------After Step is called.-------------");
	}
	
	
	/**
	 * Get test 
	 * @return
	 */
	
    public synchronized static ExtentTest getTest () {
        return test.get();
    }

}

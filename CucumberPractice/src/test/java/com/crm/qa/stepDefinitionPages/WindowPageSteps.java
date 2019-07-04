package com.crm.qa.stepDefinitionPages;

import org.apache.log4j.Logger;

import com.crm.qa.context.TestContext;
import com.crm.qa.enums.Context;
import com.crm.qa.loggerHelp.LoggerHelper;
import com.crm.qa.pages.WindowTestingPage;

import cucumber.api.java.en.Given;

public class WindowPageSteps {
	
	TestContext testContext;
	WindowTestingPage windowTestingPage;
	
	Logger Log = LoggerHelper.getLogger(WindowPageSteps.class.getName());
	
	public WindowPageSteps(TestContext testContext)
	{
		this.testContext = testContext;
		
		windowTestingPage = testContext.getPageObjectManager().getWindowTestingPage();
		
	}
	
	
	@Given("Selected window using Title.")
	public void selected_window_using_Title() {
	    
		windowTestingPage.windowSwitchTest(true);
		
		testContext.getScenarioContext().setContext(Context.TOOLTIPPAGE_TEXT, "Tooltip text");
		
		testContext.getScenarioContext().setContext(Context.MENUPAGE_TITLE, "Learn Cucumber | Cucumber Tutorial for Beginners");
		
		Log.info("Step 'Selected window using Title.' is executed");
		
	}

}

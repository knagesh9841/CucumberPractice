package com.crm.qa.stepDefinitionPages;

import org.apache.log4j.Logger;

import com.crm.qa.context.TestContext;
import com.crm.qa.loggerHelp.LoggerHelper;
import com.crm.qa.pages.FrameTestingPage;

import cucumber.api.java.en.When;

public class FrameTestingPageSteps {
	
	TestContext testContext;
	
	FrameTestingPage frameTestingPage;
	
	Logger Log = LoggerHelper.getLogger(FrameTestingPageSteps.class.getName());
	
	public FrameTestingPageSteps(TestContext testContext)
	{
		this.testContext = testContext;
		
		frameTestingPage = testContext.getPageObjectManager().getFrameTestingPage();
	
	}
	
	@When("Select Element from Frame.")
	public void select_Element_from_Frame() {
	    
		frameTestingPage.verifyElementInIFrame("FrameTest", true, "Baby Cat", "Not a Friendly Topic");
		
		Log.info("Step 'Select Element from Frame.' is executed");
	}
	

}

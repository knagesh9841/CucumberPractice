package com.crm.qa.stepDefinitionPages;

import org.apache.log4j.Logger;

import com.crm.qa.context.TestContext;
import com.crm.qa.enums.Context;
import com.crm.qa.loggerHelp.LoggerHelper;
import com.crm.qa.pages.TooltipPage;

import cucumber.api.java.en.Then;

public class TooltipPageSteps {
	
	TestContext testContext;
	TooltipPage tooltipPage;
	
	Logger Log = LoggerHelper.getLogger(TooltipPageSteps.class.getName());
	
	public TooltipPageSteps(TestContext testContext)
	{
		this.testContext = testContext;
		
		tooltipPage = testContext.getPageObjectManager().getTooltipPage();
		
	}
	
	@Then("tooltip Message should be generated.")
	public void tooltip_Message_should_be_generated() {
	    
		tooltipPage.verifyTooltipText((String) testContext.scenarioContext.getContext(Context.TOOLTIPPAGE_TEXT));
		
		Log.info("Step 'tooltip Message should be generated.' is executed");
		
	}
	

}

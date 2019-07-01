package com.crm.qa.stepDefinitionPages;

import org.apache.log4j.Logger;

import com.crm.qa.context.TestContext;
import com.crm.qa.enums.Context;
import com.crm.qa.loggerHelp.LoggerHelper;
import com.crm.qa.pages.HomePage;

import cucumber.api.java.en.Then;

public class HomePageSteps {
	
TestContext testContext;
	
	HomePage homePage;
	
	Logger Log = LoggerHelper.getLogger(HomePageSteps.class.getName());
	
	public HomePageSteps(TestContext testContext)
	{
		this.testContext = testContext;
		
		homePage = testContext.getPageObjectManager().getHomePage();
		
	}
	
	
	@Then("user logout from application.")
	public void user_logout_from_application() {
	    
		String aTitle = (String) testContext.scenarioContext.getContext(Context.HOMEPAGE_TITLE);
		homePage.verifyTitle(aTitle, "Address Book - Sign In");
		
	}

}

package com.crm.qa.stepDefinitionPages;

import org.apache.log4j.Logger;

import com.crm.qa.context.TestContext;
import com.crm.qa.enums.Context;
import com.crm.qa.loggerHelp.LoggerHelper;
import com.crm.qa.pages.MenuSelectionPage;

import cucumber.api.java.en.When;


public class MenuSelectionPageSteps {
	
	TestContext testContext;
	MenuSelectionPage menuSelectionPage;
	
	Logger Log = LoggerHelper.getLogger(MenuSelectionPageSteps.class.getName());
	
	public MenuSelectionPageSteps(TestContext testContext)
	{
		this.testContext = testContext;
		
		menuSelectionPage = testContext.getPageObjectManager().getMenuSelectionPage();
		
	}
	
	@When("User select the menu.")
	public void user_select_the_menu() {
	    
		menuSelectionPage.verifyMenuSelection((String) testContext.scenarioContext.getContext(Context.MENUPAGE_TITLE));
		
		Log.info("Step 'User select the menu.' is executed");
	}

}

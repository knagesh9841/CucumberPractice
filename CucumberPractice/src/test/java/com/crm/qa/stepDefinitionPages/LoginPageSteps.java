package com.crm.qa.stepDefinitionPages;

import org.apache.log4j.Logger;

import com.crm.qa.context.TestContext;
import com.crm.qa.loggerHelp.LoggerHelper;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.PropertyManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginPageSteps {
	
	TestContext testContext;
	
	LoginPage loginPage;
	
	Logger Log = LoggerHelper.getLogger(LoginPageSteps.class.getName());
	
	public LoginPageSteps(TestContext testContext)
	{
		this.testContext = testContext;
		
		loginPage = testContext.getPageObjectManager().getLoginPage();
		
	}
	
	
	@Given("User is able to login to application.")
	public void user_is_able_to_login_to_application() throws InterruptedException {
	   
		//loginPage.loginToApplication("knagesh143s@gmail.com", "knagesh143s");
		
		Log.info("Url: "+PropertyManager.getConfigTimeData("basicurl")+"");
		
	}

	@Then("verify title of page.")
	public void verify_title_of_page() {
	   
		//loginPage.verifyTitle("Address Book", "Address Book");
	}
	
	

}

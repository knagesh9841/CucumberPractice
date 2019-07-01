package com.crm.qa.stepDefinitionPages;

import org.apache.log4j.Logger;

import com.crm.qa.context.TestContext;
import com.crm.qa.loggerHelp.LoggerHelper;
import com.crm.qa.pages.LoginPage;
import cucumber.api.java.en.Given;


public class LoginPageSteps {
	
	TestContext testContext;
	
	LoginPage loginPage;
	
	Logger Log = LoggerHelper.getLogger(LoginPageSteps.class.getName());
	
	public LoginPageSteps(TestContext testContext)
	{
		this.testContext = testContext;
		
		loginPage = testContext.getPageObjectManager().getLoginPage();
		
	}
	
	@Given("User is able to login to application with valid credentials as {string} and {string}.")
	public void user_is_able_to_login_to_application_with_valid_credentials_as_and(String userName, String password) throws Exception {
	   
		String aTitle = loginPage.loginToApplication(userName, password);
		
		
		loginPage.verifyTitle(aTitle, "Address Book");
		
		Log.info("Step 'User is able to login to application with valid credentials as "+userName+" and "+password+"' is executed");
	}
	
	

}

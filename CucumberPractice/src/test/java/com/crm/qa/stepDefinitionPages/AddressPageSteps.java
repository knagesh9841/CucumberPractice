package com.crm.qa.stepDefinitionPages;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.crm.qa.context.TestContext;
import com.crm.qa.enums.Context;
import com.crm.qa.loggerHelp.LoggerHelper;
import com.crm.qa.pages.AddressPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.testdata.Customer;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddressPageSteps {
	
	TestContext testContext;
	
	AddressPage addressPage;
	
	HomePage homePage;
	
	Logger Log = LoggerHelper.getLogger(AddressPageSteps.class.getName());
	
	public AddressPageSteps(TestContext testContext)
	{
		this.testContext = testContext;
		
		addressPage = testContext.getPageObjectManager().getAddressPage();
		
		homePage = testContext.getPageObjectManager().getHomePage();
		
	}
	
	@When("User Enters address Details.")
	public void user_Enters_address_Details(DataTable dataTable) {
		
		List<Map<String,String>> data = dataTable.asMaps(String.class,String.class);
		
		Customer customer = testContext.getPageObjectManager().getJsonReader().getCustomerByName(data.get(0).get("Customername"));
		
		addressPage.fillAddressDetails(customer);
	   
	}
	
	
	@Then("User verifies the Address Details.")
	public void user_verifies_the_Address_Details() {
	   
		addressPage.verifyAddressDetails();
		
	}

	@When("User Deletes the Address Details.")
	public void user_Deletes_the_Address_Details() {
		
		addressPage.deleteAddressDetails();
	}

	@Then("Address Should not be present.")
	public void address_Should_not_be_present() {
	    
		addressPage.verifyDeletedAddressDetails();
		
		String aTitle = homePage.loginOutFromApplication();
		
		testContext.getScenarioContext().setContext(Context.HOMEPAGE_TITLE, aTitle);
	}

}

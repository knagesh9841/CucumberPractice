package com.crm.qa.stepDefinitionPages;

import org.apache.log4j.Logger;

import com.crm.qa.context.TestContext;
import com.crm.qa.loggerHelp.LoggerHelper;
import com.crm.qa.pages.DownloadPage;

import cucumber.api.java.en.Then;


public class DownloadPageSteps {
	
TestContext testContext;
	
	DownloadPage downloadPage;
	
	Logger Log = LoggerHelper.getLogger(DownloadPageSteps.class.getName());
	
	public DownloadPageSteps(TestContext testContext)
	{
		this.testContext = testContext;
		
		downloadPage = testContext.getPageObjectManager().getDownloadPage();
	
	}
	
	@Then("File should be Downloaded Successfully.")
	public void file_should_be_Downloaded_Successfully() {
	   
		downloadPage.verifyDownloadedFile();
		
		Log.info("Step 'File should be Downloaded Successfully.' is executed");
	}

}

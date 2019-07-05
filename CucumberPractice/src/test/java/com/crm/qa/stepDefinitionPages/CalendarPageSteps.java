package com.crm.qa.stepDefinitionPages;

import org.apache.log4j.Logger;

import com.crm.qa.context.TestContext;
import com.crm.qa.loggerHelp.LoggerHelper;
import com.crm.qa.pages.CalendarPage;

import cucumber.api.java.en.Given;


public class CalendarPageSteps {
	
	TestContext testContext;
	
	CalendarPage calendarPage;
	
	Logger Log = LoggerHelper.getLogger(CalendarPageSteps.class.getName());
	
	public CalendarPageSteps(TestContext testContext)
	{
		this.testContext = testContext;
		
		calendarPage = testContext.getPageObjectManager().getCalendarPage();
	
	}
	
	@Given("Selected date as {string} from calendar.")
	public void selected_date_as_from_calendar(String date) {
	    
		calendarPage.verifyCalendarDate(date);
		
		Log.info("Step 'Selected date as "+date+" from calendar.' is executed");
		
	}

}

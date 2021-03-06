package com.crm.qa.pages;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.loggerHelp.LoggerHelper;
import com.crm.qa.util.PropertyManager;
import com.crm.qa.util.Reporter;
import com.crm.qa.util.Utilities;
import com.crm.qa.util.WaitUtilities;

public class CalendarPage {
	
			//*********Page Variables*********

			private WebDriver driver;

			private static Logger Log = LoggerHelper.getLogger(CalendarPage.class.getName());


			//*********Constructor*********

			public CalendarPage(WebDriver driver)
			{
				this.driver = driver;
				PageFactory.initElements(driver, this);
			}


			//*********Web Elements*********

			@FindBy(how=How.XPATH,using="//input[@id='datepicker']")
			@CacheLookup
			public WebElement datePicker;
			
			@FindBy(how=How.XPATH,using="//table[@class='ui-datepicker-calendar']//td")
			@CacheLookup
			public List<WebElement> dateTable;
			
		

			//*********Page Methods*********
			
			public void verifyCalendarDate(String date)
			{

				try {
					driver.get(PropertyManager.getConfigTimeData("calendarurl"));

					Log.info("-----------Navigating to URL-------------");

					Utilities.maximizeWindow();
					WaitUtilities.waitForPageToBeLoad(driver);
					

					WaitUtilities.waitForPageTitleIs(driver, "Selenium Practise: How to handle calendar in Selenium Webdriver", 30);
					
					datePicker.click();
					
					Log.info("-----------Clicked on Datepicker button-------------");
					
					WaitUtilities.waitForElementVisible(driver, By.xpath("//table[@class='ui-datepicker-calendar']//td/a[text()='"+date+"']"), 20);
					
					boolean sFlag=false;
					
					for(WebElement dateElement:dateTable)
					{
						if(dateElement.getText().equals(date))
						{
							sFlag = true;
							dateElement.click();
							Reporter.info("Date "+date+" should be selected successfully.", "Date "+date+" is selected successfully.", driver, true);
							Log.info("-----------Date "+date+" is selected successfully.-------------");
							break;
						}
					}
					
					if(!sFlag)
					{
						Reporter.fail("Date "+date+" should be selected successfully.", "Date "+date+" is selected successfully.", driver, false);
					}
					
					
				} catch (Exception e) {
				
					Log.warn("-----------Exception Occured while Entering Date.------------");
				}
			}

}

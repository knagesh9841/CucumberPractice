package com.crm.qa.cucumberPages;
import org.openqa.selenium.WebDriver;

import com.crm.qa.exceltestdata.JsonDataReader;
import com.crm.qa.pages.*;


public class PageObjectManager {
	
	
	private WebDriver driver;
	
	private LoginPage loginPage_Object;
	private HomePage homePage_Object;
	private AddressPage addrsPage_Object;
	private FrameTestingPage framepage_Object;
	private WindowTestingPage windowpage_Object;
	private MenuSelectionPage menuSelectPage_Object;
	private DownloadPage downloadPage_Object;
	private BootStrapLoginWindowPage bootStrapLoginWindowPage_Object;
	private BootStrapDropdownPage bootStrapDropdownPage_Object;
	private TooltipPage tooltipPage_Object;
	private CalendarPage calendarPage_Object;
	private static JsonDataReader jsonDataReader;
	
	
	
	public PageObjectManager(WebDriver driver) {

		this.driver = driver;

	}
	
	
	public LoginPage getLoginPage(){

		return (loginPage_Object == null) ? loginPage_Object = new LoginPage(driver) : loginPage_Object;

	}
	
	public HomePage getHomePage(){

		return (homePage_Object == null) ? homePage_Object = new HomePage(driver) : homePage_Object;

	}
	
	
	public AddressPage getAddressPage(){

		return (addrsPage_Object == null) ? addrsPage_Object = new AddressPage(driver) : addrsPage_Object;

	}
	
	public FrameTestingPage getFrameTestingPage(){

		return (framepage_Object == null) ? framepage_Object = new FrameTestingPage(driver) : framepage_Object;

	}
	
	
	public WindowTestingPage getWindowTestingPage(){

		return (windowpage_Object == null) ? windowpage_Object = new WindowTestingPage(driver) : windowpage_Object;

	}
	
	
	public MenuSelectionPage getMenuSelectionPage(){

		return (menuSelectPage_Object == null) ? menuSelectPage_Object = new MenuSelectionPage(driver) : menuSelectPage_Object;

	}
	
	public DownloadPage getDownloadPage(){

		return (downloadPage_Object == null) ? downloadPage_Object = new DownloadPage(driver) : downloadPage_Object;

	}
	
	
	public BootStrapLoginWindowPage getBootStrapLoginWindowPage(){

		return (bootStrapLoginWindowPage_Object == null) ? bootStrapLoginWindowPage_Object = new BootStrapLoginWindowPage(driver) : bootStrapLoginWindowPage_Object;

	}
	
	
	public BootStrapDropdownPage getBootStrapDropdownPage(){

		return (bootStrapDropdownPage_Object == null) ? bootStrapDropdownPage_Object = new BootStrapDropdownPage(driver) : bootStrapDropdownPage_Object;

	}
	
	public TooltipPage getTooltipPage(){

		return (tooltipPage_Object == null) ? tooltipPage_Object = new TooltipPage(driver) : tooltipPage_Object;

	}
	
	
	public CalendarPage getCalendarPage(){

		return (calendarPage_Object == null) ? calendarPage_Object = new CalendarPage(driver) : calendarPage_Object;

	}
	
	public JsonDataReader getJsonReader(){
		 return (jsonDataReader == null) ? new JsonDataReader() : jsonDataReader;
		 }
	

}

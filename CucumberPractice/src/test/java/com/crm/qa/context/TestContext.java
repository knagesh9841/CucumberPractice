package com.crm.qa.context;

import com.crm.qa.cucumberPages.PageObjectManager;
import com.crm.qa.util.BrowserFactory;

public class TestContext {
	
	private PageObjectManager pageObjectManager;
	public ScenarioContext scenarioContext;
	
	public TestContext(){
		
		pageObjectManager = new PageObjectManager(BrowserFactory.getDriver());
		scenarioContext = new ScenarioContext();
	}
	
	
	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}
	
	public ScenarioContext getScenarioContext() {
		 return scenarioContext;
		 }

}

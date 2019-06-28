package com.crm.qa.context;

import com.crm.qa.cucumberPages.PageObjectManager;
import com.crm.qa.util.BrowserFactory;

public class TestContext {
	
	private PageObjectManager pageObjectManager;
	
	public TestContext(){
		
		pageObjectManager = new PageObjectManager(BrowserFactory.getDriver());
	}
	
	
	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}

}

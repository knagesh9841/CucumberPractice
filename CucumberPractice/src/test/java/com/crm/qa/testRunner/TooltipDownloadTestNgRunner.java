package com.crm.qa.testRunner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.crm.qa.util.BrowserFactory;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.PickleEventWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(
features = {"src/test/java/com/crm/qa/featureFile/TooltipDownloadMenu.feature"}
,glue={"com.crm.qa.stepDefinitionPages","com.crm.qa.hooks"}
,plugin = { "html:target/cucumber-html-report",
        "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt",
        "usage:target/cucumber-usage.json", "junit:target/cucumber-results.xml"},
monochrome = true,
strict = true
)

public class TooltipDownloadTestNgRunner {
	
	private TestNGCucumberRunner testNGCucumberRunner;
	 
	
	 @BeforeClass(alwaysRun = true)
	 @Parameters({ "browser" })
	    public void setUpClass(String browser) throws Exception { 
		 	
		 	BrowserFactory.setDriver(browser);
	        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	    }

	    @Test(dataProvider = "features")    
	    public void feature(PickleEventWrapper eventwrapper,CucumberFeatureWrapper cucumberFeature) throws Throwable {
	    	
	    	
	    	testNGCucumberRunner.runScenario(eventwrapper.getPickleEvent());
	    }
	    
	    @DataProvider
	    public Object[][] features() {
	         
	    	 return testNGCucumberRunner.provideScenarios();
	    }
	    
	    @AfterClass(alwaysRun = true)
	    public void tearDownClass() throws Exception {  
	    	
	    	BrowserFactory.getDriver().quit();
	        testNGCucumberRunner.finish();        
	    }

}

package com.crm.qa.loggerHelp;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LoggerHelper {
	
private static boolean root = false;
	
	public static Logger getLogger(String className)
	{
		if(root)
		{
			return Logger.getLogger(className);
		}else
		{
			DOMConfigurator.configure(System.getProperty("user.dir") + "\\src\\main\\java\\com\\crm\\qa\\resources\\config\\log4j.xml");
			root = true;
			return Logger.getLogger(className);
		}
	}

}

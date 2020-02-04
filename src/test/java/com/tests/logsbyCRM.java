package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class logsbyCRM 
{
	
	@Test
	public void setUpLogin() 
	{
		
		Logger logs = Logger.getLogger(logsbyCRM.class);
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		logs.warn("execution will begin soon ...");
		WebDriver driver=new ChromeDriver();
		logs.warn("warning messages will be triggered soon ...");
		driver.get("https://ui.freecrm.com/");
		logs.warn("url has been entered ...");
		driver.close();
		logs.info("application has been closed ");
		
		
		
	}

}

package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class logsgenerated 
{
	@Test
	public void setUp() 
	{
		
		Logger logs = Logger.getLogger(logsgenerated.class);
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		logs.warn("caution browser is about to launch...");
		WebDriver driver=new ChromeDriver();
		driver.get("https://ui.freecrm.com/");
		logs.warn("application url has been entered..!!!");
		driver.close();
		
		
	}

}

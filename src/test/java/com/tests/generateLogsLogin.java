package com.tests;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class generateLogsLogin {
	// what is log
	// capturing the info during the execution cz jvm also executing , selenium too
	// , api also , we want to wts gng on in the backend
	// cz we will be runing in remote can not sit and watch
	// we can unbderstand the execution
	// we debug code and failure at run time

	// types of logs or label of logs
	// a.info warn debug and error or fatal

	// how to generate logs , to generate logs we use apache log 4 j API
	// how does it works , it will read log4j configuration from log4j.properties
	// file
	// where to create >>create inside a resource folder
	WebDriver driver;
	Logger log = Logger.getLogger(generateLogsLogin.class);

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		log.info("browser is about to laucnh ");
		driver = new ChromeDriver();
		driver.get("https://ui.freecrm.com/");
		log.info("url has been entered ");

	}

	@Test
	public void login() {
		driver.findElement(By.name("email")).sendKeys("shantu147@gmail.com");
		log.info("user name has been entered ");
		driver.findElement(By.name("password")).sendKeys("Godvs400");
		log.warn("password has been entered ");
		driver.findElement(By.xpath("(//div[.='Login'])[2]")).click();
		log.fatal("this is error login message ");
	}

	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(4000);
		log.warn("application is about close now");
		driver.close();

	}

}

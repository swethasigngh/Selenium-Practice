package com.swetha.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Add {
	
WebDriver driver; 
	
	@BeforeSuite
	public void launchBrowser() {
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
}
	@BeforeTest
	public void enterURL() {
		driver.get("https://apply.commonapp.org/login?ma=881&tref=admissionswebsite");

	}
	@Test
	public void enterUserName() {	
		driver.findElement(By.id("loginEmailControl")).sendKeys("shweta.@gmail.com");
	}
	@Test
	public void LastrName() {
		driver.findElement(By.id("loginPasswordControl")).sendKeys("fghuji");
	}


	@AfterSuite
	public void closeBrowser() {
	driver.close();
	}
}




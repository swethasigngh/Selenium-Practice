package com.swetha.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Newid {
	WebDriver driver;

	@BeforeSuite
	public void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@BeforeTest
	public void enterURL() {
		driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F");

	}

	@Test
	public void enterUserName() {
		driver.findElement(By.name("firstname")).sendKeys("shweta");
	}

	@Test
	public void LastrName() {
		driver.findElement(By.name("lastname")).sendKeys("Singh");
	}

	@Test
	public void rName() {
		driver.findElement(By.linkText("AdChoice")).click();
	}

	@AfterSuite
	public void closeBrowser() {
		driver.close();
	}
}
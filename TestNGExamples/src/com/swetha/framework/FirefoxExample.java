package com.swetha.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirefoxExample {

	WebDriver driver;

	@BeforeSuite
	public void launchBrowser() {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}

	@BeforeTest
	public void enterURL() {
		driver.get("https://www.facebook.com");
	}

	@Test(description = "User entering Emaild ID", suiteName = "Facebo0k Login")
	public void enterUserName() {
		driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("swetha@gmail.com");
	}

	@Test(dependsOnMethods = "enterUserName", description = "User entering Password")
	public void enterPassword() {
		driver.findElement(By.xpath("//input[@id = 'pass']")).sendKeys("swetha@gmail.com");
	}

	@Test(dependsOnMethods = "enterPassword", description = "User clicked on login button")
	public void clickLoginButon() {
		driver.findElement(By.xpath("//input[@type ='submit']")).click();
	}

	@AfterSuite
	public void closeBrowser() {
		driver.close();
	}
}

package com.swetha.com.swetha.framework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewAlert {
	WebDriver driver;

	@BeforeSuite
	public void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@BeforeTest
	public void enterURL() {
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	}

//	@Test(description = "click for alert", suiteName = "heroku Login")
//	public void alert() {	"
//		driver.findElement(By.xpath("//button[text() = 'Click for JS Alert']")).click();
//	}
	@Test
	public void prompt() throws InterruptedException {
	driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Alert alertExample = driver.switchTo().alert();
		String alertText = alertExample.getText();
		System.out.println("Alert Text : " + alertText);
//		Thread.sleep(2000);
		alertExample.sendKeys("Prompt Alert ...!");
		alertExample.accept();
	}
//	driver.findElement(By.xpath("//button[text() = 'Click for JS Confirm']")).click();
	// driver.findElement(By.xpath("//button[text() = 'Click for JS
	// Prompt']")).click();

//	Thread.sleep(3000);

}

package com.Automation.TestNg1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BookMyShowDemo {
WebDriver driver;
	
	@BeforeSuite
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\k.karthik\\OneDrive\\Desktop\\kksoft123\\TestingDEC2023\\Driverss\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		System.out.println("Beforesuite");

	}
	
	@Test
	public void CitySelection() {
     driver.get("https://in.bookmyshow.com/explore/home/hyderabad");
	Actions actions = new Actions(driver);
	//actions.sendKeys(Keys.chord(Keys.PAGE_DOWN)).perform();
	
	driver.findElement(By.linkText("Movies")).click();
    //driver.findElement(By.linkText("Pay Later")).click();
	System.out.println("Test");
	
	}
	
	@AfterSuite
	public void CloseBrowser() throws InterruptedException {
Thread.sleep(5000);
driver.close();
System.out.println("Aftersuite");
		
	}
	

}

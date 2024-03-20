package com.Automation.screenshots;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.reporters.Files;

public class SreenshotDemo {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\k.karthik\\OneDrive\\Desktop\\kksoft123\\TestingDEC2023\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.navigate().refresh();
	driver.get("https://www.booking.com");
	TakesScreenshot ts =(TakesScreenshot) driver;
	File file=ts.getScreenshotAs(OutputType.FILE);
	Fileutils.copyFile(file,new File("C:\\Users\\k.karthik\\OneDrive\\Desktop\\kksoft123\\TestingDEC2023\\Screenshots\\Booking.jpeg"));
	
	
}
}

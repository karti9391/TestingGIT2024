package com.Automation.Seleniumcore;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Automation.screenshots.Fileutils;

public class ScreenshotDemo {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\k.karthik\\OneDrive\\Desktop\\kksoft123\\TestingDEC2023\\Driverss\\chromedriver.exe");
	//ChromeDriver driver = new ChromeDriver();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.navigate().refresh();
	driver.get("https://www.gmail.com");
	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	TakesScreenshot ts = (TakesScreenshot) driver;
	File file=ts.getScreenshotAs(OutputType.FILE);
	Fileutils.copyFile(file, new File("C:\\Users\\k.karthik\\OneDrive\\Desktop\\kksoft123\\TestingDEC2023\\screenshot\\gmail.jpeg"));
	
	
	Thread.sleep(5000);
	driver.close();
}
}

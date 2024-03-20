package com.Automation.screenshots;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ScreenshotTest {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\k.karthik\\OneDrive\\Desktop\\kksoft123\\TestingDEC2023\\Drivers\\chromedriver.exe");
	RemoteWebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.navigate().refresh();
	driver.get("https://www.booking.com");
	File file=driver.getScreenshotAs(OutputType.FILE);
	Fileutils.copyFile(file, new File("C:\\Users\\k.karthik\\OneDrive\\Desktop\\kksoft123\\TestingDEC2023\\Screenshots\\Booking1.jpeg"));
	
}
}

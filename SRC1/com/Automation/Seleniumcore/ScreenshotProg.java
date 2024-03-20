package com.Automation.Seleniumcore;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.Automation.screenshots.Fileutils;

public class ScreenshotProg {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\k.karthik\\OneDrive\\Desktop\\kksoft123\\TestingDEC2023\\Driverss\\chromedriver.exe");
	//ChromeDriver driver = new ChromeDriver();
	//WebDriver driver = new ChromeDriver();
	RemoteWebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.navigate().refresh();
	driver.get("https://www.gmail.com");
	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	
	WebElement uname = driver.findElement(By.id("identifierId"));
	uname.clear();
	uname.sendKeys("karthikk@gmail.com");
	WebElement next = driver.findElement(By.linkText("Next"));
	next.click();
	
	
	File file= driver.getScreenshotAs(OutputType.FILE);
	Fileutils.copyFile(file, new File("C:\\Users\\k.karthik\\OneDrive\\Desktop\\kksoft123\\TestingDEC2023\\screenshot\\gmail.jpeg"));
	
}
}

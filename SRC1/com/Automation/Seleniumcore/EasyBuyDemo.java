package com.Automation.Seleniumcore;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EasyBuyDemo {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\k.karthik\\OneDrive\\Desktop\\kksoft123\\TestingDEC2023\\Driverss\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.navigate().refresh();
	driver.get("https://www.easybuyindia.com/");
	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	
	
	
	
	
	
	Thread.sleep(5000);
	driver.close();
	
	
	
	
}
}

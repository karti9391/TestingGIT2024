package com.Automation.Seleniumcore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDemo {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\k.karthik\\OneDrive\\Desktop\\kksoft123\\TestingDEC2023\\Driverss\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.navigate().refresh();
	driver.get("https://www.booking.com/");
	//WebElement register=driver.findElement(By.linkText("Contact Us"));
	//register.click();
	
	//WebElement register1=driver.findElement(By.linkText("Confirm"));
	//register1.click();
	
	WebElement search = driver.findElement(By.id("flights"));
	search.click();
	
	Thread.sleep(5000);
	driver.close();
}
}

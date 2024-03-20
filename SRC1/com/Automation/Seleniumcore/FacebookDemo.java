package com.Automation.Seleniumcore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDemo {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\k.karthik\\OneDrive\\Desktop\\kksoft123\\TestingDEC2023\\Driverss\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.navigate().refresh();
	driver.get("https://www.facebook.com/");
	
	// Radio buttons
	
	WebElement createaccount=driver.findElement(By.linkText("Create new account"));
	createaccount.click();
	WebElement dayDD=driver.findElement(By.xpath("//select[@id=\"day\"]/option[2]"));
	dayDD.click();
	
	}
	
	
	
	
	
}


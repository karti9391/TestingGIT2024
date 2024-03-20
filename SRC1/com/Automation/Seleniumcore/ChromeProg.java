package com.Automation.Seleniumcore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeProg {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\k.karthik\\OneDrive\\Desktop\\kksoft123\\TestingDEC2023\\Driverss\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.navigate().refresh();
	driver.get("https://www.facebook.com/");
	
	// Radio buttons
	
	WebElement createaccount=driver.findElement(By.linkText("Create new account"));
	createaccount.click();
	WebElement firstName=driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
	if(firstName.isDisplayed()&&firstName.isEnabled()) {
		firstName.clear();
		firstName.sendKeys("katte");
		System.out.println("FirstName is displayed");
	}
	else {
		System.out.println("FirstName is not Displayed");
	}
	
	WebElement lastname=driver.findElement(By.name("lastname"));
	if(lastname.isDisplayed()&&lastname.isEnabled()) {
		lastname.sendKeys("karthik");
		System.out.println("lastname is displayed");
	}
	else {
		System.out.println("lastname is not Displayed");
	}
	
	
	WebElement pwd=driver.findElement(By.id("password_step_input"));
	if(pwd.isDisplayed()&&pwd.isEnabled()) {
		pwd.sendKeys("KKsoft9391");
		System.out.println("pwd is displayed");
	}
	else {
		System.out.println("pwd is not Displayed");
	}
	
	WebElement btn=driver.findElement(By.id("u_4_5_3Q"));
	if(btn.isDisplayed()&&btn.isEnabled()) {
		btn.click();
		System.out.println("btn is displayed");
	}
	else {
		System.out.println("btn is not Displayed");
	
	//u_4_5_3Q
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	Thread.sleep(5000);
	driver.close();
}
}
}

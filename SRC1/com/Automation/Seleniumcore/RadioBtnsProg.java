package com.Automation.Seleniumcore;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioBtnsProg {
public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\k.karthik\\OneDrive\\Desktop\\kksoft123\\TestingDEC2023\\Driverss\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.navigate().refresh();
	driver.get("https://www.rameshsoft.com/");
	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	
	WebElement contactNow=driver.findElement(By.linkText("Contact Now"));
	if(contactNow.isDisplayed()&&contactNow.isEnabled()) {
		contactNow.click();
	}
	else System.out.println("contactnow is not displayed");
	
	WebElement offline = driver.findElement(By.xpath("//input[@value='Offline']"));
	if(offline.isDisplayed()&&offline.isEnabled()) {
		offline.click();
		
	}
	else System.out.println("offline is not enabled");
	
	
	
	
	
	
	
	
	
	
}
}

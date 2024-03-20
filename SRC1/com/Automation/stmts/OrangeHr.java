package com.Automation.stmts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangeHr {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\k.karthik\\OneDrive\\Desktop\\kksoft123\\TestingDEC2023\\Driverss\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.navigate().refresh();
	driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	
	driver.get("https://www.forbes.com/advisor/business/software/best-human-resource-management-systems/");
	
	WebElement move=driver.findElement(By.linkText("USA"));
	Actions actions = new Actions(driver);
	actions.moveToElement(move).perform();
	
	WebElement india = driver.findElement(By.xpath("//img[@alt='IN']"));
	actions.moveToElement(india).click(india).perform();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//driver.get("https://in.bookmyshow.com/");
	
	/*
	 * WebElement city=driver.findElement(By.xpath("//img[@alt='HYD']")); Actions
	 * actions = new Actions(driver); actions.sendKeys("Hyderabad").perform();
	 * actions.click(city).perform();
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * WebElement
	 * acceptcookies=driver.findElement(By.xpath("//a[@title='Accept Cookies']"));
	 * Actions actions = new Actions(driver);
	 * actions.moveToElement(acceptcookies).click().perform();
	 */
	/*
	 * WebElement en=driver.findElement(By.xpath("//input[@name=\"username\"]"));
	 * en.sendKeys("Admin");
	 * driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123"
	 * ); driver.findElement(By.cssSelector("button[type='submit']")).click();
	 * driver.findElement(By.xpath("//li[1]//a[1]//span[1]")).click();
	 * driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
	 */
	
	
}
}

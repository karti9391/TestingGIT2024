package com.Automation.stmts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchingProg {
public static void main(String[] args) throws InterruptedException, MalformedURLException{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\k.karthik\\OneDrive\\Desktop\\kksoft123\\TestingDEC2023\\Driverss\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.navigate().refresh();
	driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	//driver.get("https://www.jqueryui.com");
	driver.navigate().to("https://www.jqueryui.com");
	driver.navigate().to(new URL(""));
	
	driver.findElement(By.linkText("Autocomplete")).click();
	
	WebElement listofElements=driver.findElement(By.tagName("iframe"));
	
	System.out.println("Total no of elements: "+listofElements);
	
	WebElement frameElement=driver.findElement(By.className("demo-frame"));
	driver.switchTo().frame(frameElement);
	
	driver.findElement(By.id("tags")).sendKeys("karthik");
	
	
	driver.switchTo().defaultContent();
	
	driver.findElement(By.linkText("Draggable")).click();
	
	driver.switchTo().frame(0);
	
	WebElement draggable1=driver.findElement(By.id("draggable"));
	Actions actions = new Actions(driver);
	actions.dragAndDropBy(draggable1, 150, 150).build().perform();
	
	driver.switchTo().defaultContent();
	
	driver.findElement(By.linkText("Droppable")).click();
	
	driver.switchTo().frame(0);
	WebElement draggable2=driver.findElement(By.id("draggable"));
	WebElement draggable3=driver.findElement(By.id("droppable"));
	actions.dragAndDrop(draggable2, draggable3).build().perform();
	
	Thread.sleep(5000);
	driver.close();
	
	
	
	
	
	
	
	
}
}

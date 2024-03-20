package com.Automation.Seleniumcore;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownsProg {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\k.karthik\\OneDrive\\Desktop\\kksoft123\\TestingDEC2023\\Driverss\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.navigate().refresh();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	
	
	WebElement createaccount=driver.findElement(By.linkText("Create new account"));
	createaccount.click();
	
	WebElement dayDD=driver.findElement(By.id("day"));
	// the prerequisets of dropdown is by using the select class to perform the dropdowns.
	// if the tagname is keep on changing to use this method 
	//1. to get the tagname 2. check the condition 
	//3. the condition is true, the select methods are excuted otherwise the else block is excuted.
	
	String tagname=dayDD.getTagName();
	if(tagname.equalsIgnoreCase("select")) {
	Select select = new Select(dayDD);
	 select.selectByIndex(4);
	 select.selectByValue("9");
	// select.selectByVisibleText("14");
	 
	
 
	 WebElement monthDD=driver.findElement(By.id("month"));
	 String tagname1=monthDD.getTagName();
		if(tagname.equalsIgnoreCase("select")) {
		Select select1 = new Select(dayDD);
		 select1.selectByIndex(4);
		 select1.selectByValue("6");
	    // select1.selectByVisibleText("Feb");
	     
	     WebElement fisrtselect=select1.getFirstSelectedOption();
	 System.out.println("first delected options: "+fisrtselect);
	 String txt = fisrtselect.getText();
	System.out.println(txt);
	
	
	List<WebElement> allselectedoptions = select1.getAllSelectedOptions();
	System.out.println("all selcted options: "+allselectedoptions);
	
	List<WebElement> options1=select1.getOptions();
	System.out.println(options1);
		}
		else System.out.println("it is multi selectd options");
	
	
	
	
	List<WebElement> allselected = select.getAllSelectedOptions();
	System.out.println("all selcted options: "+allselected);
	
	List<WebElement> options=select.getOptions();
	System.out.println(options);
	}
	else {
		
		// if the tagname is keep on change in webpage to use " * "
		
		driver.findElement(By.xpath("//*[@id=\"day\"]/option[2]")).click();
		WebElement alloption=driver.findElement(By.xpath("//*[@id=\"day\"]/option"));
		System.out.println(alloption);
		
		driver.findElement(By.xpath("//*[@id=\"month\"]/option[2]")).click();
		WebElement alloption1=driver.findElement(By.xpath("//*[@id=\"month\"]/option"));
		System.out.println(alloption1);
		
		
		
		
		
		
		
		
		
		
	}
	
	Thread.sleep(5000);
	driver.close();
}
}

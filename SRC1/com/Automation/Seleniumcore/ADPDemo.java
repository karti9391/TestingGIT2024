package com.Automation.Seleniumcore;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ADPDemo {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\k.karthik\\OneDrive\\Desktop\\kksoft123\\TestingDEC2023\\Driverss\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.navigate().refresh();
	driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	
	driver.get("https://www.adp.com");
	List<WebElement> listElement=driver.findElements(By.xpath("//*"));
	System.out.println("Total no of elemetns are: "+listElement.size());
	int framecount =0;
	
	Iterator<WebElement> itr=listElement.iterator();
	while(itr.hasNext()) {
		WebElement element=itr.next();
		String tagname=element.getTagName();
		if(tagname.equalsIgnoreCase("iframe")) {
			framecount++;
			String idvalue=element.getAttribute("id");
			String classvalue = element.getAttribute("class");
			String srcvalue = element.getAttribute("src");
		}
		
	}
	System.out.println("frame count is: "+framecount);
	
	
	
	
	
	
	
	
	
	
}
}

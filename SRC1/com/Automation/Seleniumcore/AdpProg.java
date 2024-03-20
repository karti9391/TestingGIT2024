package com.Automation.Seleniumcore;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdpProg {
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
	int adpcount =0;
	
	for(WebElement element:listElement){
		String text=element.getText();
		if(text!=null) {
			if(text.contains("ADP") || text.contains("adp")){
				adpcount++;
			}
		}
		System.out.println("No of occurance of adp word in the ADPwebpage: "+adpcount);
		
	}
}
}

package com.Automation.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class Base {

 private static 	WebDriver driver;
	
	@Parameters({"browser"})
	@BeforeSuite
 void	OpenBrowser(@Optional("chrome") String browser){
		if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", ":\\Users\\k.karthik\\OneDrive\\Desktop\\kksoft123\\TestingDEC2023\\Driverss\\chromedriver.exe");
		 driver = new ChromeDriver();
		init();
	}
		
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ":\\Users\\k.karthik\\OneDrive\\Desktop\\kksoft123\\TestingDEC2023\\Driverss\\geckodriver.exe");
			 driver = new ChromeDriver();
		}
		
		
		}
		
	
	public void init() {
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		
	}
	
	@AfterSuite
	void CloseBrowser() throws InterruptedException {
		Thread.sleep(5000);
		if(driver!=null) {
			driver.close();
		}
		else System.out.println("Driver is pointing to null");
		//throw exception
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	
}
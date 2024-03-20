package com.Automation.Base;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import javax.sound.midi.SysexMessage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

public class BaseTest {

	private static  WebDriver driver;
	
	@Parameters({"browser"})
	@BeforeSuite
	
	public void OpenBroser(@Optional("chrome") String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\k.karthik\\OneDrive\\Desktop\\kksoft123\\TestingDEC2023\\Drivers\\chromedriver.exe");
			 driver = new ChromeDriver();
			 init();
		}
		else
			if(browser.equalsIgnoreCase("IE")) {
				System.setProperty("webdriver.ie.driver", " ");
				driver = new InternetExplorerDriver();
				init();
			}
			else if(browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", " ");
				driver = new FirefoxDriver();
				init();
			}
	}
	
	public void init() {
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

	}
	
	@AfterSuite
	 public void CloseBrowser() {
	if(driver!=null) {
		driver.close();
	}
	else {
		System.out.println("DRIVER IS POINTING TO NULL");
		// throwing exception
	}
	}
	
	
	@BeforeMethod
	
	public void BeforetestcaseExecution(Method method) {
	String TCName=method.getName();
      System.out.println("Current Test Case Execution is: "+TCName);
	}
	
	@AfterMethod
	
	public void AftertestcaseExecution(ITestResult result) {
		long endmillisec = result.getEndMillis();
         String TcName=result.getName();
         long startmillisec=result.getStartMillis();
         if(result.getStatus()==ITestResult.SUCCESS) {
        	 System.out.println("Test case is executed: "+TcName);
         }
         else if(result.getStatus()==ITestResult.FAILURE) {
        	 //take a screenshot
        	 // get the exception information why its got failed
        	 // add the exception & add to the report
        	 // mark them as failure
        	 System.out.println("Test case is FAILURE: "+TcName);
         }
         else if(result.getStatus()==ITestResult.SKIP) {
        	 // take a screenshot
        	 // get the exception information why its got skipped
        	 // add the exception & add to the report
        	 //mark them as skipped
         }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static WebDriver getDriver() {
		return driver; 
	}
	
	
}

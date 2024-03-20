package com.Automation.BussinessScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;
import org.testng.annotations.Test;

import com.Automation.Base.BaseTest;
//import com.Automation.Base.Basetest;

public class AmazonTest extends BaseTest {

	@Test
	
	public void loginTest() {
	getDriver().get("https://www.amazon.com");
	getDriver().findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus phones");
  
		WebElement searchBtn =getDriver().findElement(By.id("nav-search-submit-button"));
	    searchBtn.click();
	}
}

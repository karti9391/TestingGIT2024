package com.Automation.BussinessScripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Automation.Base.BaseTest;
//import com.Automation.Base.Basetest;

public class FlipkartTest extends BaseTest {

	@Test
	
	public  void loginTest() {
		getDriver().get("https://www.flipkart.com");
		getDriver().findElement(By.xpath("//a[@class=\"_1TOQfO\"]")).click();
		getDriver().findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]")).sendKeys("9391696487");
		getDriver().findElement(By.xpath("//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")).click();
		

	}
}

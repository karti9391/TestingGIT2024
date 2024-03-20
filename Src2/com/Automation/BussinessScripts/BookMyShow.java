package com.Automation.BussinessScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.Automation.Base.Base;

public class BookMyShow extends Base{
	
	@Test
	
	public void CitySelect() {
		 getDriver().get("https://in.bookmyshow.com/explore/home/hyderabad");
			Actions actions = new Actions(getDriver());
			actions.sendKeys(Keys.chord(Keys.PAGE_DOWN)).perform();
			
			getDriver().findElement(By.linkText("Operation Valentine")).click();
		    
	}
	
	
	

}

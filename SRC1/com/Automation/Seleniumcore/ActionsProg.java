package com.Automation.Seleniumcore;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsProg {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\k.karthik\\OneDrive\\Desktop\\kksoft123\\TestingDEC2023\\Driverss\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.navigate().refresh();
	driver.get("https://www.amazon.com/");
	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	
	
	WebElement orders=driver.findElement(By.xpath("//span[text()='& Orders']"));
	
	Actions actions = new Actions(driver);
	actions.moveToElement(orders).build().perform();
	
	actions.sendKeys(Keys.chord(Keys.CONTROL,"a")).perform();
	actions.sendKeys(Keys.chord(Keys.SHIFT,"s")).perform();
	actions.sendKeys(Keys.chord(Keys.DOWN,Keys.DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_UP)).perform();
	actions.sendKeys(Keys.chord(Keys.HOME)).perform();
	actions.clickAndHold().perform();
	WebElement pcs = driver.findElement(By.xpath("//div[@class='_fluid-fat-image-link-v2_style_fluidFatImageLinkBody__1LsOX']"));
	actions.clickAndHold(pcs).pause(5).release(pcs).perform();
	
	
	driver.get("https://google.com");
	driver.findElement(By.name("q")).sendKeys("ibomma");
	actions.sendKeys(Keys.chord(Keys.ENTER)).perform();
	
	WebElement ibomma=driver.findElement(By.xpath("//h3[contains(text(),'iBOMMA - Watch iBomma Telugu Movies | iBOMMA.ONE')]"));
	WebElement Enter = driver.findElement(By.xpath("//button[text()='ENTER']"));
	actions.click(Enter).perform();
	
	
	
	actions.doubleClick(ibomma).sendKeys(Keys.chord(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_LEFT)).perform();
	
	
	
	Thread.sleep(5000);
	driver.close();
	
}
}

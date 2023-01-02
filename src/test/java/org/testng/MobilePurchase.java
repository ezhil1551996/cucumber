package org.testng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utilities.BaseClass;

public class MobilePurchase extends BaseClass {
	@BeforeClass
	private void BrouserLaunch() {
		
		launchChrome();
		winmax();
	}
	
	@BeforeMethod
	private void start() {
	loadurl("https://www.flipkart.com/");

	}
   @Test
   private void login() {
	WebElement cls = driver.findElement(By.xpath("//*[text()='✕']"));
	cls.click();

}
   @AfterMethod
   private void end() {
	System.out.println("Browser end");

}
   @AfterClass
   private void clse() {
	System.out.println("end");

}
   @Test
   private void search() throws AWTException {
	WebElement search = driver.findElement(By.xpath("//*[@type='text']"));
	search.sendKeys("realme mobiles");
	
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
}
   
   
}

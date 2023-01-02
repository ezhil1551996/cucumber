package org.cts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;

public class BrouserLaunch extends BaseClass{
	
	
	public static void main(String[] args) throws IOException {
		
		
		launchChrome();
		winmax();
		loadurl("https://WWW.facebook.com");
		printTitle();
		PrintCurrentUrl();
		  
	WebElement txtpass = driver.findElement(By.id("email"));
		fill(txtpass, GetData(1, 2));
		WebElement txtuser = driver.findElement(By.id("pass"));
		fill(txtuser, GetData(1, 1));
		
	}

}

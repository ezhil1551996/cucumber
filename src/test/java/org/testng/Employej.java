package org.testng;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.utilities.BaseClass;
import org.utilities.LoginPojo;

public class Employej extends BaseClass {
	
	
	
	@BeforeClass
	public void LaunchBrowser() {
		launchChrome();
		winmax();
		
	}
	
	@AfterClass
	public void quiting() {
		
		close();
		
		
	}
	@Parameters({"orang","personal" })
	@Test
	public void tc1(String s1, String s2) throws IOException, InterruptedException {
		
		LoginPojo l = new LoginPojo();
		fill(l.getTxtuser(),s1);
		fill(l.getTxtpass(),s2);
		btnClick(l.getTxtlogin());
		Thread.sleep(1000);
	}
	
	
	@Test
	private void tc11() throws IOException, InterruptedException {
		
		
		LoginPojo l = new LoginPojo();
		fill(l.getTxtuser(),GetData(2, 2));
		fill(l.getTxtpass(),GetData(2, 2));
		btnClick(l.getTxtlogin());
		Thread.sleep(1000);
		
	}
	
	
@BeforeMethod
public void start() {
	loadurl("https://www.facebook.com");
	
}
@AfterMethod
public void end() {
	
	System.out.println("2");
}


}
	



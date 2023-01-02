package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass{
	
public LoginPojo() {
	
	
	
	PageFactory.initElements(driver, this);
	
}

@FindBy(xpath="//input[@name=\"email\"]")

private WebElement txtuser;


	@FindBy(xpath="//input[@type=\"password\"]")

private WebElement txtpass;

@FindBy(xpath="//button[@name='login']")
private WebElement txtlogin;

public WebElement getTxtuser() {
	return txtuser;
}

public WebElement getTxtpass() {
	return txtpass;
}

public WebElement getTxtlogin() {
	return txtlogin;
}


	
	
	
	
	
	
	
	
	
}
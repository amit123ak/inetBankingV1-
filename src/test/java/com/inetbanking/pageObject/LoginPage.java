package com.inetbanking.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	
	public LoginPage(WebDriver rdriver)
	 {
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver, this);
	 }
	
	 @FindBy(name="uid")
	 @CacheLookup
     WebElement txtUsername;
	 
	 @FindBy(name="password")
	 @CacheLookup
	 WebElement txtpassword;
	 
	 @FindBy(name="btnLogin")
	 @CacheLookup
	 WebElement txtbtnLogin;
	 public void setUserName(String uname) {
		 
		 txtUsername.sendKeys(uname);
	 }
	 public void SetPassword(String pwd)
	 {
		 txtpassword.sendKeys(pwd);
	 }
	 public void Loginbtn()
	 {
		 txtbtnLogin.click();
		 
	 }

}

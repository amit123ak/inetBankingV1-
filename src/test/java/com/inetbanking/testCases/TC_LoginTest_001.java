package com.inetbanking.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.inetbanking.pageObject.LoginPage;

import junit.framework.Assert;

public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	public void loginTest()
	{

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);
		logger.info("URL IS OPENED");
		LoginPage ip =new LoginPage(driver);
		ip.setUserName(username);
		logger.info("ENTERED USER NAME");
		ip.SetPassword(pwd);
		logger.info("Enterted passowrd");
		ip.Loginbtn();
		logger.info("click on login button");
	
		
		if(driver.getTitle().equals(title))
		{
		Assert.assertTrue(true);
		logger.info("login test pass");
		}else 
		{
		Assert.assertTrue(false);
		logger.info("login test fail");
			
		}
		
	}

}

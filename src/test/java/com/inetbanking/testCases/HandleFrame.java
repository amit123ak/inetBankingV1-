package com.inetbanking.testCases;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.inetbanking.testCases.ListenerTest.class)

public class HandleFrame  extends BaseClass{

	@Test
	public void Handleframe()
	{
	 driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
	 driver.manage().window().maximize();
	 driver.findElement(By.id("name")).sendKeys("hello");
	 driver.switchTo().frame(driver.findElement(By.id("frm3")));
	 driver.switchTo().frame(driver.findElement(By.id("frm1")));
	 Select sc =new Select(driver.findElement(By.id("selectnav2")));
	 sc.selectByVisibleText("Home");
	 driver.switchTo().parentFrame();
	 Select sc1 =new Select(driver.findElement(By.id("selectnav1")));
	 sc1.selectByVisibleText("- SQL");
	 driver.switchTo().defaultContent();
	 driver.findElement(By.id("name")).sendKeys("Switch ho gya bhai2");
	 
	}
}

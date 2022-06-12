package com.inetbanking.testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GoogleSearchTest extends BaseClass{
  @Test
  public void f() {
	  driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@value=\"Google Search\" and @type =\"submit\"]")).click();
		
		String s=driver.findElement(By.xpath("//h3[text()=\"Selenium\"]")).getText();
		String s2="Selenium";
		
		
		if(s2.equalsIgnoreCase(s))
		{
			driver.findElement(By.xpath("//a[@href=\"https://www.selenium.dev/\"]")).click();
			
		}
		
		
  }
}

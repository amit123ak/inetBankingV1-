package com.inetbanking.testCases;

import org.openqa.selenium.By;

public class Matrix extends BaseClass {

	public static void main(String[] args) {

	String s="Iphone 13 Max Pro";
		//input[@id="twotabsearchtextbox"]
		//input[@type="submit" and @value="Go"]
	driver.get("https://www.amazon.com/");
	driver.findElement(By.xpath("input[@id=\"twotabsearchtextbox\"]")).sendKeys(s);
	 driver.findElement(By.xpath("//input[@type=\"submit\" and @value=\"Go\"]")).click();
	String s1= driver.findElement(By.xpath("//span[@id=\"productTitle\"]")).getText();
	
	if(s.equals(s1))
	{
		
		System.out.print(s1);
	}

	
	}
	}

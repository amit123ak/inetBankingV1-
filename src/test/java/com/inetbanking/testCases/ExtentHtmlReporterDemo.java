package com.inetbanking.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtentHtmlReporterDemo  extends BaseClass{
    @Test
	public void HtlmReport() {
	
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
		ExtentReports  ex=new ExtentReports();
		ex.attachReporter(htmlReporter);
	com.aventstack.extentreports.ExtentTest test =ex.createTest("Google seach test1","Gooogle search");
	test.log(Status.INFO, " google seach test is started  ");
	driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
	test.pass("navigated to HYR");
	driver.manage().window().maximize();
	 driver.findElement(By.id("name")).sendKeys("hello");
	 test.pass("hello type success");
	driver.switchTo().frame(driver.findElement(By.id("frm3")));
	test.pass("switching to frame3");
	 driver.switchTo().frame(driver.findElement(By.id("frm1")));
	 test.pass("swichting to inner frame");
	 Select sc =new Select(driver.findElement(By.id("selectnav2")));
	 sc.selectByVisibleText("Home");
	 test.pass("suucessfully selected HOMe drp from inner frame");
	 driver.switchTo().parentFrame();
	 test.pass("switch to parsent frame which frame 3");
	 Select sc1 =new Select(driver.findElement(By.id("selectnav1")));
	 sc1.selectByVisibleText("- SQL");
	 test.pass("selecting SQL inside frame 3");
	 driver.switchTo().defaultContent();
	 test.pass("swiching to default content ");
	 driver.findElement(By.id("name")).sendKeys("Switch ho gya bhai2");
	 test.pass("successfully again type to the input box ");
	 test.pass("all test is completed ");
	
	ex.flush();

	}

}

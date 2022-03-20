package com.inetbanking.testCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.poi.poifs.property.DirectoryProperty.PropertyComparator;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.apache.log4j.PropertyConfigurator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public String baseURL="https://demo.guru99.com/v1/index.php";
	public String username="mngr389091";
	public String pwd="padugEm";
	public String title="GTPL Bank Manager HomePage";
	public static WebDriver driver;
	public static Logger logger;

	
	@BeforeClass
	public void setup() 
	{
	 System.setProperty("webdriver.chrome.driver","/home/amitkumr.gond/Desktop/chromedriver");
	//driver=new ChromeDriver(); System.getProperty("user.dir")
		//WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		driver = new ChromeDriver(options);
		 logger=Logger.getLogger("ebanking");
		 //Properties props = System.getProperties();
		//PropertyConfigurator.configure("log4j.properties");
		Properties props = System.getProperties();
		 String s=props.getProperty("user.dir")+"/log4j.properties";
		 PropertyConfigurator.configure(s);
		 
		System.out.println("Current working directory is " + props.getProperty("user.dir"));
		

	
		
	 
	}
	
	@AfterClass
	public void tearDown()
	{
	
	//driver.quit();
	}

}

package com.inetbanking.testCases;

import org.testng.annotations.Test;

public class DependentMethodTestNgTest {
	//private static String NULL;
	static String trackinNum=null;
/*	
  @Test(priority = 2)
  public void createshipment() {
	  System.out.println(1/0);
	  System.out.println("create shipment success");
	  trackinNum="ADG12Bk";
	  }*/
  @Test(priority = 1,dependsOnMethods = {"createshipment"},ignoreMissingDependencies = true)
  public void Trackshipment() throws Exception {
	  if(trackinNum!=null)
	  {
		  System.out.println("Traceshiment success");
	  }else {
		  throw new Exception(" invaild TrackingNum");
	  }
  }
  
  @Test(priority = 3,dependsOnMethods = {"Trackshipment"},alwaysRun = true)
  public void cancelshipment() throws Exception {
	  if(trackinNum!=null)
	  {
		  System.out.println("cancelshipment success");
	  }else {
		  throw new Exception(" invaild TrackingNum");
	  }
  }
  
  
  
}

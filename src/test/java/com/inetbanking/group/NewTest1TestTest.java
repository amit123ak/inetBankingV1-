package com.inetbanking.group;

import org.testng.annotations.Test;

public class NewTest1TestTest {
  @Test
  public void test1() {
	  System.out.println("test1");
  }
  
  
  @Test(groups={"smoke"})
  public void test2() {
	  System.out.println("test2");
  }
  
  @Test(groups= {"functional","reggression"})
  public void test3() {
	  System.out.println("test3");
  }
  
  @Test(groups= {"daily","sanity","smoke"})
  public void test4() {
	  System.out.println("test4");
  }
  @Test(groups= {"reggression"})
  public void test5() {
	  System.out.println("test5");
  }
}

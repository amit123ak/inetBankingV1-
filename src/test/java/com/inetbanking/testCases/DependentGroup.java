package com.inetbanking.testCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class DependentGroup {
  @Test(groups = "sanity" )
  public void test1() {
	  System.out.println("Test1 ->sanity");
  }
  
  @Test(groups = "regresion" )
  public void test2() {
	  System.out.println("Test2 ->regresion");
  }
  @Test(groups = "function" )
  public void test3() {
	  //System.out.println(1/0);
	  System.out.println("Test3 ->function");
  }
  @Test(groups = "build" )
  public void test4() {
	  System.out.println("Test4 ->build");
  }
  /*
  @Test(dependsOnGroups ={"sanity","function"},alwaysRun = true)
  public void test0() {
	  System.out.println("main");
  }
  */
  
}

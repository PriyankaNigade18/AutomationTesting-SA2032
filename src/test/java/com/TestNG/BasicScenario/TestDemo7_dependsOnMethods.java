package com.TestNG.BasicScenario;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDemo7_dependsOnMethods {
  @Test(priority=1)
  public void registerTest() 
  {
	  System.out.println("Test1....Register process");
	  Assert.assertEquals(true,true);//pass
  }
  
  @Test(priority=2,dependsOnMethods="registerTest")
  public void loginTest() 
  {
	  System.out.println("Test2....login process");
	  Assert.assertEquals(true,false);//fail
  }
  
  @Test(priority=3,dependsOnMethods="loginTest")
  public void logoutTest() 
  {
	  System.out.println("Test1....logout process");
  }
}

package com.TestNG.BasicScenario;

import org.testng.annotations.Test;

public class TestDemo2_invocationCount
{
  @Test(priority=1)
  public void registerTest()
  {
	  System.out.println("User Register process....");
	  
  }
  
  //To run login test 3 times
  @Test(priority=2,invocationCount=3)
  public void loginTest()
  {
	  System.out.println("User Login process....");
	  
  }
}

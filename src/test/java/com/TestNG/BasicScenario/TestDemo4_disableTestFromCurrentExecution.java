package com.TestNG.BasicScenario;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDemo4_disableTestFromCurrentExecution {
  @Test(priority=1)
  public void regiterTest()
  {
	  System.out.println("User register here!");
  }
  
  @Test(priority=2)
  public void loginTest()
  {
	  System.out.println("User login here!");
  }
  
  @Test(priority=3)
  public void searchProductTest()
  {
	  System.out.println("User search product here!");
  }
  
  @Test(priority=4)
  public void addTocartTest()
  {
	  System.out.println("User add the product here!");
  }
  
  @Test(priority=5,enabled=false)
  public void logoutTest()
  {
	  System.out.println("User logout here!");
  }
  
  
}

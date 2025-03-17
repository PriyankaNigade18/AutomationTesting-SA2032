package com.TestNG.BasicScenario;

import org.testng.annotations.Test;

public class TestDemo1_priority_description 
{
  @Test(priority=1,description="This is register test case")
  public void registerTest()
  {
	  System.out.println("User register here!");
  }
  
  @Test(priority=2,description="This is login test case")
  public void loginTest()
  {
	  System.out.println("User login here!");
  }
  
  @Test(priority=3,description="This is search test case")
  public void searchProductTest()
  {
	  System.out.println("User searched product here!");
	
  }
  
  
  @Test(priority=4,description="This is test case for Add to cart")
  public void addToCartTest()
  {
	  System.out.println("User added product here!");
	
  }
  
}

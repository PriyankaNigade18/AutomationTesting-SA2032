package com.TestNG.Annotations;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class AnnotationsBasics {
  @Test(priority=1)
  public void registerTest()
  {
	  System.out.println("Test1....Register process");
  }
  
  @Test(priority=2)
  public void loginTest()
  {
	  System.out.println("Test2....login process");
  }
  
  @Test(priority=3)
  public void logoutTest()
  {
	  System.out.println("Test3....logout process");
  }
  
  
  
  
  @BeforeClass
  public void bclass()
  {
	  System.out.println("BeforeClass executes before first test case only");
  }
  
  @AfterClass
  public void aclass()
  {
	  System.out.println("AfterClass executes after last test case only");
  }
  
  @BeforeMethod
  public void bmethod()
  {
	  System.out.println("BeforeMethod executes before every test case");
  }
  
  
  
  @AfterMethod
  public void amethod()
  {
	  System.out.println("AfterMethod executes after every test case");
  }
}

package com.TestNG.BasicScenario;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDemo3_timeouts {
  @Test(timeOut = 5000)
  public void testcase1() throws InterruptedException
  {
	  System.out.println("Test1 started.....");
	  
	  Thread.sleep(4000);
	  
	  System.out.println("Test1 ended.....");
  }
  
  
  
  @Test(timeOut = 5000)
  public void testcase2() throws InterruptedException
  {
	  System.out.println("Test2 started.....");
	  
	  Thread.sleep(6000);
	  
	  System.out.println("Test2 ended.....");
  }
}

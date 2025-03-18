package com.TestNG.BasicScenario;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestDemo6_Assertions {
  @Test
  public void testHasrdAssertion()
  {
	  String act="Selenium WebDriver is webui automation library";
	  String exp="testng";
	  
	  /*
	   * When any assertion fail you will get AssertionError-test will fail
	   
	  Assert.assertEquals(act,exp,"Test Fail: As strings are not equal");
	  System.out.println("Test pass: As strings are equal");
	 
	  
	  //scenario:truecondition: test if actual string contains expected string
	  
	  
	  Assert.assertTrue(act.contains(exp),"TestFail: as actual string does not contain expected string...\"");
	  System.out.println("Test Pass: as actual string contain expected string...");
	  */
	  //scenario: false condition: test if actual string should not contains expected string
	  Assert.assertFalse(act.contains(exp),"Test Fail: as Actual string contains expected!");
	  System.out.println("Test Pass: actual string does not contians expected");
	  
	  /*
	  if(act.equals(exp))
	  {
		  System.out.println("Test pass: As strings are equal");
		  Assert.assertTrue(true);
	  }else
	  {
		  System.out.println("Test Fail: As strings are not equal");
		  Assert.assertTrue(false);
	  }
	  */
  }
  
  
  @Test
  public void testSoftAssertion()
  {
	  int a=100,b=500;
	  
	  SoftAssert sf=new SoftAssert();
	  
	  sf.assertEquals(a,b,"Test Fail: Numbers are not equal");
	  System.out.println("Test Pass: Numbers are equal");
	  
	  sf.assertAll();
	  
	  
	  
	  
	  
  }
  
  
  
  
  
  
  
  
  
  
  
}

package com.TestNG.PageObjectModelUsingPageFactory;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTestCase extends BaseClass
{
  @Test(priority=1)
  public void validateTitle()
  {
	  String actTitle=lp.getAppTitle();
	  Assert.assertTrue(actTitle.contains("Login"));
	  System.out.println("Title matched...."+actTitle);
  }
  
  @Test(priority=2)
  public void validateLogin()
  {
	  lp.setEmailId("test@gmail.com");
	  lp.setPassword("test123");
	  lp.clickOnSubmitButton();
	  
	  //or
	  
	  //lp.doLogin("test@gmail.com","test123");
	  
  }
}

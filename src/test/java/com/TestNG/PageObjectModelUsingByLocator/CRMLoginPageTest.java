package com.TestNG.PageObjectModelUsingByLocator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CRMLoginPageTest extends BaseClass
{
  @Test(priority=1)
  public void validateUrl()
  {
	  //CRMLoginPage lp=new CRMLoginPage(driver);
	  String actUrl=lp.getAppUrl();
	  Assert.assertTrue(actUrl.contains("crm"));
	  System.out.println("Url is matched...."+actUrl);
	  
  }
  
  
  @Test(priority=2)
  public void validateLogin()
  {
	  //CRMLoginPage lp=new CRMLoginPage(driver);
	  lp.doLogin("test@gmail.com","test123");
  }
}

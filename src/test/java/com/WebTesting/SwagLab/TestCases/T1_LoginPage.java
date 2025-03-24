package com.WebTesting.SwagLab.TestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.WebTesting.SwagLab.Base.BaseClass;

public class T1_LoginPage extends BaseClass
{
  @Test(priority=1)
  public void validateUrl()
  {
	  String actUrl=lp.getAppUrl();
	  Assert.assertTrue(actUrl.contains("sauce"));
	  System.out.println("URL matched..."+actUrl);
  }
  
  @Test(priority=2)
  public void validateLogin()
  {
	  lp.doLogin(prop.getData("un"),prop.getData("psw"));
	  Assert.assertTrue(lp.getAppUrl().contains("inventory"),"Login Fail!");
	  System.out.println("Login Completed..........");
  }
}

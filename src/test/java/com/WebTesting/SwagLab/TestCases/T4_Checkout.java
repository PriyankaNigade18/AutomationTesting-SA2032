package com.WebTesting.SwagLab.TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.WebTesting.SwagLab.Base.BaseClass;

public class T4_Checkout extends BaseClass{
	
	@BeforeClass
	public void pageSetUp()
	{
		ip=lp.doLogin(prop.getData("un"),prop.getData("psw"));
		ip.addProductToTheCart(prop.getData("pname1"));
		addWait();
		cp=ip.openCartPage();
		addWait();
		ch=cp.clickOnCheckOut();
	}
	
	
  @Test
  public void validateCheckout()
  {
	  ch.doCheckout(prop.getData("fn"),prop.getData("ln"),prop.getData("pc"));
  }
}

package com.WebTesting.SwagLab.TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.WebTesting.SwagLab.Base.BaseClass;

public class T3_CartPage extends BaseClass
{
	@BeforeClass
	public void pageSetUp()
	{
		ip=lp.doLogin(prop.getData("un"),prop.getData("psw"));
		addWait();
		ip.addProductToTheCart(prop.getData("pname1"));
		addWait();
		cp=ip.openCartPage();
		
	}	
	
	
  @Test(priority=1)
  public void verifyProductDescription()
  {
	  cp.getCartProductDescription();
  }
  
  @Test(priority=2)
  public void validateRemoveFeature()
  {
	  cp.clickOnRemove();
	  addWait();
  }
  
  
  @Test(priority=3)
  public void validateContinueShopping()
  {
	  ip=cp.clickOncontinueShopping();
	  addWait();
	  ip.addProductToTheCart(prop.getData("pname2"));
	  addWait();
	 cp=ip.openCartPage();
	 addWait();
  }
  
  
  @Test(priority=4)
  public void validateCheckoutpageLaunch()
  {
	  cp.clickOnCheckOut();
  }
}

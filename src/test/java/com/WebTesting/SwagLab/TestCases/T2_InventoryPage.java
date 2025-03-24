package com.WebTesting.SwagLab.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.WebTesting.SwagLab.Base.BaseClass;

public class T2_InventoryPage extends BaseClass
{
	@BeforeClass
	public void pageSetUp()
	{
		ip=lp.doLogin(prop.getData("un"),prop.getData("psw"));
		
	}	
	
	
  @Test(priority=1)
  public void verifyProductCount()
  {
	  int count=ip.getProductCount();
	  AssertJUnit.assertEquals(count,6);
	  System.out.println("Total Product count matched...Products are: "+count);
	  
  }
  
  @Test(priority=2)
  public void verifyProductDetails()
  {
	  ip.getProductDetails();
  }
  
  @Test(priority=3)
  public void validateAddToCartFeature()
  {
	  ip.addProductToTheCart(prop.getData("pname1"));
  }
  @Test(priority=4)
  public void verifyCartPageLaunch()
  {
	  ip.openCartPage();
  }
}

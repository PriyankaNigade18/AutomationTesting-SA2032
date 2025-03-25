package com.WebTesting.SwagLab.TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.WebTesting.SwagLab.Base.BaseClass;

public class T5_Overview extends BaseClass
{
	@BeforeClass
	public void pageSetUp()
	{
		ip=lp.doLogin(prop.getData("un"),prop.getData("psw"));
		ip.addProductToTheCart(prop.getData("pname1"));
		addWait();
		cp=ip.openCartPage();
		addWait();
		ch=cp.clickOnCheckOut();
		op=ch.doCheckout(prop.getData("fn"),prop.getData("ln"),prop.getData("pc"));
	}
	
	
  @Test(priority=1)
  public void varifySummary()
  {
	  op.getSummary();
  }
  
  @Test(priority=2)
  public void validateCompleteCheckOut() 
  {
	 String confMessage= op.clickOnFinish();
	 System.out.println("Confirmation message is: "+confMessage);
  }
}

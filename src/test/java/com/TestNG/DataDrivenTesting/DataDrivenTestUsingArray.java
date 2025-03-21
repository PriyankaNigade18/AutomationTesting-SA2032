package com.TestNG.DataDrivenTesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTestUsingArray
{
	/*
	//test data
	@DataProvider(name="logintestdata")
	public Object[][] testData()
	{
		Object [][]data={{"Admin","admin123"},{"Ravi","test123"},{"Sara","test123"},{"Admin","admin123"}};
		return data;
	}
	*/
	
	
  @Test(dataProvider = "logintestdata",dataProviderClass = CustomData.class)
  public void loginTest(String un,String psw) 
  {
	  System.out.println("UserName is: "+un+" : "+"Password is: "+psw);
	  
	  
  }
}

package com.TestNG.DataPassing;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class DataPassingUsingxml
{
  @Test
  @Parameters({"un","psw"})
  public void loginTest(String u,String p) 
  {
	  System.out.println("User name is: "+u);
	  System.out.println("password is: "+p);
  }
}

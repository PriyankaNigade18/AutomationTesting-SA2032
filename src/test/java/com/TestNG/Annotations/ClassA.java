package com.TestNG.Annotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassA 
{
	@BeforeTest
	public void btest()
	{
		System.out.println("BeforeTest executes only before first class");
	}
	
	@BeforeSuite
	public void bsuite()
	{
		System.out.println("BeforeSuite executes only before first test");
	}
  @Test
  public void testCaseA1() 
  {
	  System.out.println("Class A.....TestCase1");
  }
  
  @Test
  public void testCaseA2() 
  {
	  System.out.println("Class A.....TestCase2");
  }
}

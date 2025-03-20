package com.TestNG.Annotations;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassB {
	@AfterTest
	public void btest()
	{
		System.out.println("AfterTest executes only last first class");
	}
	@AfterSuite
	public void asuite()
	{
		System.out.println("AfterSuite executes only after last test");
	}
  @Test
  public void testCaseB1() 
  {
	  System.out.println("Class B.....TestCase1");
  }
  
  @Test
  public void testCaseB2() 
  {
	  System.out.println("Class B.....TestCase2");
  }
}

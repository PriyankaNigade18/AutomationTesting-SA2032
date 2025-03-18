package com.TestNG.Annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationRealUseCase extends BaseClass
{
//	WebDriver driver;
//	
//	@BeforeClass
//	public void setUp()
//	{
//		 driver=new ChromeDriver();
//		driver.get("https://automationplayground.com/crm/login.html");
//		
//	}
//	
//	@BeforeMethod
//	public void getUrl()
//	{
//		System.out.println("Url is: "+driver.getCurrentUrl());
//	}
//	
//	@AfterMethod
//	public void getAppTitle()
//	{
//		System.out.println("Title is: "+driver.getTitle());
//	}
	@Test(priority=1)
	public void tetsLogin()
	{
		System.out.println("Test 1..login is executing");
		//login
		  driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
		  driver.findElement(By.name("password-name")).sendKeys("test123");
		  driver.findElement(By.id("submit-id")).click();
		
	}
	
	
	@Test(priority=2)
	public void testLogout()
	{
		System.out.println("Test 2..logout is executing");
		//logout
		  driver.findElement(By.linkText("Sign Out")).click();
	}
	
//	@AfterClass
//	public void tearDown()
//	{
//		driver.quit();
//	}
//	
  /*@Test
  public void tetsLogin_logout() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://automationplayground.com/crm/login.html");
	  //login
	  driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
	  driver.findElement(By.name("password-name")).sendKeys("test123");
	  driver.findElement(By.id("submit-id")).click();
	  
	  //logout
	  driver.findElement(By.linkText("Sign Out")).click();
	  
	  //close
	  driver.quit();
  }*/
}



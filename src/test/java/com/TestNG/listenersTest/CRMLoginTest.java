package com.TestNG.listenersTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



//@Listeners(com.TestNG.listenersTest.AppListener.class)
public class CRMLoginTest 
{
	
	public WebDriver driver;
	

	@BeforeClass
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/");
	}
	
  @Test(priority=1)
  public void testSignInLink()
  {
	  driver.findElement(By.linkText("Sign In")).click();
  }
  
  @Test(priority=2)
  public void testlogin()
  {
	  driver.findElement(By.id("email-id##")).sendKeys("test@gmail.com");
	  driver.findElement(By.id("password")).sendKeys("test123");
	  driver.findElement(By.id("submit-id")).click();
  }
  
  
  @Test(priority=3)
  public void testSignOutLink()
  {
	  driver.findElement(By.linkText("Sign Out")).click();
  }
}

package com.TestNG.Annotations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HrmLogin_LogoutScenarioForAnnotation extends HRMBaseClass
{
	
	
	
  @Test(priority=1)
  public void validateLogin()
  {
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  driver.findElement(By.name("password")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();

  }
  
  @Test(priority=2)
  public void validateLogout()
  {
	  driver.findElement(By.xpath("//i[contains(@class,'oxd-userdropdown-icon')]")).click();
	  driver.findElement(By.linkText("Logout")).click();
	  
  }
  
  
}

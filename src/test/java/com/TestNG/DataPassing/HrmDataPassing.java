package com.TestNG.DataPassing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.generic.Utility;

public class HrmDataPassing {
  @Test
  @Parameters({"un","psw"})
  public void testLogin(String un,String psw) throws InterruptedException
  {
	 WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(2000);
	Utility.getScreenshot(driver,"HrmHomepage");
	  driver.findElement(By.name("username")).sendKeys(un);
	  driver.findElement(By.name("password")).sendKeys(psw);
	  Utility.getScreenshot(driver,"Credentials");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
	  Thread.sleep(2000);
	  Utility.getScreenshot(driver,"dashboardpage");
	  //validation
	  
	  Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"Login Fail for Invalid Credentials");
	  System.out.println("Login successful");
	  
	  
  }
}

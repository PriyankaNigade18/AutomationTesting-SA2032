package com.TestNG.DataPassing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.generic.PropertiesUtil;

public class HrmDataPassingUsingPropertiesFile {
  @Test
  public void testFile() throws InterruptedException
  {
	  PropertiesUtil prop=new PropertiesUtil("config");
	  
	  WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getData("url"));
		
		  driver.findElement(By.name("username")).sendKeys(prop.getData("un"));
		  driver.findElement(By.name("password")).sendKeys(prop.getData("psw"));
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  
		  Thread.sleep(2000);
		  //validation
		  
		  Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"Login Fail for Invalid Credentials");
		  System.out.println("Login successful");
		  
  }
}

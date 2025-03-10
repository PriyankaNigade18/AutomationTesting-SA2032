package com.WebElementAutomation.UsingTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicAuthenticationAutomation {
  @Test
  public void testBasicAuthentication() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	  
	  
	  System.out.println(driver.findElement(By.xpath("//div[@class='example']")).getText());
  }
}

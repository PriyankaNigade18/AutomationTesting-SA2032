package com.WebElementAutomation.UsingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment10 {
  @Test
  public void testNewTabs() 
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	  
	  for(int i=1;i<=10;i++)
	  {
	  WebDriver newTab=driver.switchTo().newWindow(WindowType.TAB);
	  newTab.get("https://www.facebook.com");
	  
	  }
  }
}

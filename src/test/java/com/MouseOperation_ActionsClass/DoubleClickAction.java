package com.MouseOperation_ActionsClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DoubleClickAction {
  @Test
  public void testDoubleClick() throws InterruptedException
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	  
	  //button
	  WebElement button=driver.findElement(By.tagName("button"));	
	  
	  //double click--->doubleClick()
	  Actions act=new Actions(driver);
	  act.doubleClick(button).perform();
	  
	  //alert 
	  Thread.sleep(2000);
	  
	  //handle alert
	  Alert alt=driver.switchTo().alert();
	  System.out.println("Alert text is: "+alt.getText());
	  //ok
	  alt.accept();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}

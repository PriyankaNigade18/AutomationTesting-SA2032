package com.MouseOperation_ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ToolTipAutomation {
  @Test
  public void testToolTip()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://jqueryui.com/tooltip/");
	  
	  
	  //frame
	  driver.switchTo().frame(0);
	  
	  
	  //input
	  WebElement ele=driver.findElement(By.id("age"));  
	  
	  Actions act=new Actions(driver);
	  act.moveToElement(ele).perform();
  
  //tooltip
	  String tooltip=driver.findElement(By.xpath("//div[@class='ui-tooltip-content']")).getText();
  System.out.println(tooltip);
  
  
  
  }
}

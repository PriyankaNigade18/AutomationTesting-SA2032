package com.MouseOperation_ActionsClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseOverAction_Naukari {
  @Test
  public void testMouseOver() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.naukri.com/");
	  
	  //Identify Jobs  to do mouse over
	  
	  WebElement jobEle=driver.findElement(By.xpath("//div[text()='Jobs']"));
	  
	  /*
	   * To handle any mouse operation selenium provides Actions class
	   * 
	   * Rule
	   * =====
	   * To complete Single action use perform()
	   * 
	   * To complete multiple actions use build().perform()
	   */
	  
	  Actions act=new Actions(driver);
	  act.moveToElement(jobEle).perform();
	  
	  //list
	  List<WebElement> list=driver.findElements(By.xpath("//div[contains(@class,'nI-gNb-Jobs')]//ul//li//div"));
	  
	  for(WebElement i:list)
	  {
		  System.out.println(i.getText());
	  }
	  
	  
	  //list highlight-get that list
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}

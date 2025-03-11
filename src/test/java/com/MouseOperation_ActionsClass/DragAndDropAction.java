package com.MouseOperation_ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropAction {
  @Test
  public void testDragnDrop() 
  
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://jqueryui.com/droppable/#default");
	  

	  
	  //switch to frame
	  driver.switchTo().frame(0);
	  
	  //src
	  WebElement src=driver.findElement(By.id("draggable"));
	  
	  //dest
	  
	  WebElement dest=driver.findElement(By.id("droppable"));
	  
	  //drag and drop action
	  Actions act=new Actions(driver);
	  act.dragAndDrop(src,dest).perform();
	  
	  
	  
	  
	  
	  
	  
  }
}

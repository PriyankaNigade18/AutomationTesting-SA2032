package com.MouseOperation_ActionsClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RightclickAction {
  @Test
  public void testRightClickAction() throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	  
	  //right click on Button
	  
	  WebElement rbutton=driver.findElement(By.xpath("//span[text()='right click me']"));
	  
	  //right click action --->contextClick()
	  Actions act=new Actions(driver);
	  act.contextClick(rbutton).perform();
	  
	    //get the list
	  List<WebElement> list1=driver.findElements(By.xpath("(//ul)[3]//li//span"));
	 
	  WebElement ele=null;
	  for(WebElement i:list1)
	  {
		  System.out.println(i.getText());
		  if(i.getText().contains("Paste"))
		  {
			  ele=i;
		  }
	  }
	  
	  //click on any option
	  ele.click();
	  
	    
	  //open alert
	  Thread.sleep(2000);
	  
	  
	  //handle alert
	  driver.switchTo().alert().accept();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}

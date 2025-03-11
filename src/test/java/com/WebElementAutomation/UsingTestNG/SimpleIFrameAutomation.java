package com.WebElementAutomation.UsingTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SimpleIFrameAutomation {
  @Test
  public void testSingleFrame() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demo.automationtesting.in/Frames.html");

	  
	  
	  //input is inside the frame-frame with indexing
	 // driver.switchTo().frame(0);
	  
	  //frame with id/name
	  //driver.switchTo().frame("singleframe");
	  
	  //frame with WebElement
	  WebElement frameEle=driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
	    
	  driver.switchTo().frame(frameEle);
	  //input
	  driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Hello All!");
	  
	  
  
  
  
  
  
  
  
  
  
  
  }
}

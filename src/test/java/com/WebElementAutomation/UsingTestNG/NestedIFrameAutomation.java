package com.WebElementAutomation.UsingTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NestedIFrameAutomation {
  @Test
  public void testNestedIframes() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://demo.automationtesting.in/Frames.html");
	  
	  //iframe with an iframe  click on button
	  driver.findElement(By.linkText("Iframe with in an Iframe")).click();
	  
	  
	  //switch to parent frame
	  WebElement parentFrame=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	  driver.switchTo().frame(parentFrame);
	  
	  //switch to child frame
	  WebElement childFrame=driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
	  driver.switchTo().frame(childFrame);
	  
	  //driver.switchTo().frame(parentFrame).switchTo().frame(childFrame);//failing
	  
	  //child input
	  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello All");
	  
	  //come to parent frame and get the text
//	  driver.switchTo().parentFrame();
//	  
//	  String parentText=driver.findElement(By.xpath("//h5[text()='Nested iFrames']")).getText();
//	  
//	  System.out.println(parentText);
	  
	  
	  /*
	   * Selects either the first frame on the page, 
	   * or the main document when a page contains iframes
	   */
	  //come to main document and click on Single iframe button
	  driver.switchTo().defaultContent();
	  
	  //click on single iframe
	  driver.findElement(By.linkText("Single Iframe")).click();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}

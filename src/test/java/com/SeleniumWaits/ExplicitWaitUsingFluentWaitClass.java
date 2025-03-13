package com.SeleniumWaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class ExplicitWaitUsingFluentWaitClass {
  @Test
  public void f()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
	  
	  //By locator
	 By startbtn= By.tagName("button");
	  
	  By textEle=By.xpath("(//h4)[2]");
	  
	  
	  //script
	  driver.findElement(startbtn).click();
	  
	  Wait<WebDriver> wait =
		        new FluentWait<WebDriver>(driver)
		            .withTimeout(Duration.ofSeconds(5))
		            .pollingEvery(Duration.ofMillis(300))
		            .ignoring(ElementNotInteractableException.class);
	  
	 String text= wait.until(ExpectedConditions.visibilityOfElementLocated(textEle)).getText();
	  System.out.println(text);
  }
}

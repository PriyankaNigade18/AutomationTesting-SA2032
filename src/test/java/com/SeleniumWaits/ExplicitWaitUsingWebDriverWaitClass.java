package com.SeleniumWaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.generic.Utility;

public class ExplicitWaitUsingWebDriverWaitClass {
  @Test
  public void testWait() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
	  
	  //By locator
	 By startbtn= By.tagName("button");
	  
	  By textEle=By.xpath("(//h4)[2]");
	  
	  
	  //script
	  driver.findElement(startbtn).click();
	  
	  
	  WebElement text=Utility.waitForVisibilityOfElement(driver,textEle);
	  /*
	  //wait
	  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	  WebElement text=wait.until(ExpectedConditions.visibilityOfElementLocated(textEle));
	  */
	  
	  //String text=driver.findElement(textEle).getText();
	  System.out.println(text.getText());
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}

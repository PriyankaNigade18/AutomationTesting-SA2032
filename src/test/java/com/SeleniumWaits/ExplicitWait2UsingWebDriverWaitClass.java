package com.SeleniumWaits;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWait2UsingWebDriverWaitClass {
  @Test
  public void testWait() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	  
	  
	  //locator
	  By email=By.name("email####");
	  By password=By.name("password");
	  By loginBtn=By.xpath("//input[@value='Login']");
	  
	  /*
	   * TimeoutException: Expected condition failed: 
	   * waiting for presence of element located by: 
	   * By.name: email#### (tried for 5 second(s) with 500 milliseconds interval)
	   * what is default polling time for selenium
	   * polling time =interval time=500ms=0.5sec
	   */
	  
	  //1st explicit wait
	  WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(5));
	  WebElement emailele=wait1.until(ExpectedConditions.presenceOfElementLocated(email));
	  
	  emailele.sendKeys("test@gmail.com");
	  
	  
	  WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(5));
	  WebElement passwordele=wait2.until(ExpectedConditions.visibilityOfElementLocated(password));
	  
	  passwordele.sendKeys("test@123");
	  
	  
	  WebDriverWait wait3=new WebDriverWait(driver,Duration.ofSeconds(5));
	  wait3.until(ExpectedConditions.elementToBeClickable(loginBtn)).click();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}

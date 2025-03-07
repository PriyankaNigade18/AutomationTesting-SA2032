package com.WebElementAutomation.UsingTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.generic.Utility;

public class JavascriptExecutorDemo {
  @Test
  public void testScroll() throws InterruptedException
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.amazon.in/");
	  driver.manage().window().maximize();
	  
//	  Utility.scrollDown(driver);
//	  
//	  Thread.sleep(2000);
//	  
//	  Utility.scrollUp(driver);
//	  Thread.sleep(2000);
//	  Utility.scrollDown(driver);
	  
	  WebElement ele=driver.findElement(By.xpath("//span[text()='Trendy home decor']"));
	  
	  Utility.scrolUptoElement(driver,ele);
	  
	  
	  
	  
//	//current session object(driver) converting into Js object
//	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  
	  
	  //js.executeScript("arguments[0].scrollIntoView(true);",ele);
	  
	  
	  
	  
	  //current session object(driver) converting into Js object
	  //JavascriptExecutor js=(JavascriptExecutor) driver;
	  
	 // js.executeScript("window.scrollTo(0,7000)");
//	  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//	  
//	  Thread.sleep(2000);
//	  
//	  
//	  js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
//	  
	  
	  
	  
	  
	  
  }
}

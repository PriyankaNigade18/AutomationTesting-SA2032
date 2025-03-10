package com.WebElementAutomation.UsingTestNG;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertHandlingDemo1 {
  @Test
  public void testAlert() throws InterruptedException
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	  
	  //enter username
	  driver.findElement(By.id("login1")).sendKeys("Priyanka");
	  
	  
	  //click on sign in
	  driver.findElement(By.name("proceed")).click();
	  
	  Thread.sleep(2000);
	  
	  /*If you skip alert 
	   * UnhandledAlertException: unexpected alert open:
	   *  {Alert text : Please enter your password}
	   */
	  
	  //alert will open- Alert is interface
	  Alert alt=driver.switchTo().alert();
	  System.out.println("Aert text is: "+alt.getText());
	  //ok
	  alt.accept();
	  
	  
	  //enter password
	  driver.findElement(By.id("password")).sendKeys("test123");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}

package com.WebElementAutomation.UsingTestNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertHandlingDemo2_Types 
{
  @Test
  public void testAlerts() throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	  
	  
	  WebElement result=driver.findElement(By.id("result"));
	  
	  System.out.println("******************Alert1_Basic***************");

	  //alert1-Basic alert Type
	  driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	  //alert will open
	  Thread.sleep(2000);
	  
	  //handle it-->switch to alert and then use method
	  Alert alt1=driver.switchTo().alert();
	  System.out.println("Alert1 text is: "+alt1.getText());
	  //ok
	  alt1.accept();
	  
	  //result
	 // String result=driver.findElement(By.id("result")).getText();	
	  System.out.println("Result of alert1 is: "+result.getText());
	  
	  System.out.println("******************Alert2_Confirmation***************");
	  //alert2
	  driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
	  //alert will open
	  Thread.sleep(2000);
	  
	 //handle
	  Alert alt2=driver.switchTo().alert();
	  System.out.println("Alert2 text is: "+alt2.getText());
	  //cancel
	  alt2.dismiss();
	  
	  System.out.println("Result of alert2 is: "+result.getText());
	  
	  System.out.println("******************Alert3_Prompt***************");

	  driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	  //alert will open
	  Thread.sleep(2000);
	  
	  Alert alt3=driver.switchTo().alert();
	  System.out.println("Alert3 text is: "+alt3.getText());
	  //send the data
	  alt3.sendKeys("HellO All!");
	  
	  //ok
	  alt3.accept();
	  
	  System.out.println("Resi=ult of alert3 is: "+result.getText());
	  

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}

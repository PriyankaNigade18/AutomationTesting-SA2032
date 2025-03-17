package com.Capabilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TetsFileUploadUsingSendKeys {
  @Test
  public void testFileUpload()
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/upload");
	  
	  //select the file
	  driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Ganes\\OneDrive\\Desktop\\Appiumsetup.txt");
	  
	  
	  //upload the file
	  driver.findElement(By.id("file-submit")).click();
	  
	  //text message
	  String confirmationText=driver.findElement(By.tagName("h3")).getText();
	  System.out.println(confirmationText);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}

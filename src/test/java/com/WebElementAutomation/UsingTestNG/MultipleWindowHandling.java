package com.WebElementAutomation.UsingTestNG;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleWindowHandling {
  @Test
  public void testMultipleWindows_Tabs() 
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  //parent window
	  
	  String parentId=driver.getWindowHandle();
	  System.out.println(parentId);
	  
	  //link
	  driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	  //page will open-child window
	  
	  Set<String> allWindowsId=driver.getWindowHandles();
	  System.out.println(allWindowsId);
	  
	  //loop to confirm window and switch to child window
	  for(String childId:allWindowsId)
	  {
		  //when Ids are not equal then switch to child
		  if(!parentId.equals(childId))
		  {
			  
			  driver.switchTo().window(childId);
			//enter email id
			  driver.findElement(By.name("EmailHomePage")).sendKeys("test@gmail.com");
			 // driver.close();//close current active window
			  //driver.quit();//close all open windows by selenium
			  
			  
		  }
		  
	  }
	  
	  //parent window
	  driver.switchTo().window(parentId);
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}

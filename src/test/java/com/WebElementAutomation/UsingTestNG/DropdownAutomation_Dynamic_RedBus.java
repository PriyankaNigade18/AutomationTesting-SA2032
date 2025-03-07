package com.WebElementAutomation.UsingTestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.generic.Utility;

public class DropdownAutomation_Dynamic_RedBus {
  @Test
  public void testDropdown()
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.redbus.in/");
	  
	  
	  WebElement fromele=driver.findElement(By.id("src"));
	  
	  fromele.click();
	  fromele.sendKeys("pu");
	  
	  By loc=By.xpath("//ul[contains(@class,'sc-dnqmq')]//li//text[@class='placeHolderMainText']");
	  
	  Utility.selectOtion(driver,loc,"Viman Nagar");
	  
	  /*
	  //get app options
	  List<WebElement> alloptions=driver.findElements(By.xpath("//ul[contains(@class,'sc-dnqmq')]//li//text[@class='placeHolderMainText']"));
	  System.out.println("Total Options are: "+alloptions.size());
	  
	  WebElement ele=null;
	  for(WebElement i:alloptions)
	  {
		  System.out.println(i.getText());
		  if(i.getText().contains("Viman Nagar"))
		  {
			  ele=i;
		  }
		  
	  }
	  
	  ele.click();
	  
	  */
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}

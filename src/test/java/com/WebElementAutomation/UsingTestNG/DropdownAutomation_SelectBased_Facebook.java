package com.WebElementAutomation.UsingTestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.generic.Utility;

public class DropdownAutomation_SelectBased_Facebook {
  @Test
  public void testDropdown()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://www.facebook.com/");
	  
	  //click on create new account link
	  driver.findElement(By.linkText("Create new account")).click();
	  
	  //day dropdown
	  WebElement dayele=driver.findElement(By.id("day"));
	  Utility.selectBasedDropdown(dayele,"27");
	  
	  //month
	  WebElement monthdd=driver.findElement(By.id("month"));
	  Utility.selectBasedDropdown(monthdd,"Dec");
	  
	  
	  //year
	  WebElement yearele=driver.findElement(By.id("year"));
	  Utility.selectBasedDropdown(yearele,"2010");
	  
	  
	  
	  
	  
	  //create object of Select class
//	  Select dd=new Select(dayele);
//	  
//	  System.out.println("Is dropdown support multiple selection: "+dd.isMultiple());
//	  
//	  //get all options
//	  List<WebElement> allOptions=dd.getOptions();
//	 System.out.println("Total Options are: "+allOptions.size());
//	 
//	 WebElement ele=null;
//	 for(WebElement i:allOptions)
//	 {
//		 System.out.println(i.getText());
//		 if(i.getText().contains("27"))
//		 {
//			 ele=i;
//		 }
//	 }
//	  
//	  ele.click();
	  
//	  
	 
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}

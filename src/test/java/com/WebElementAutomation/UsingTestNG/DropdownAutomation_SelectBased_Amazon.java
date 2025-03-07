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

public class DropdownAutomation_SelectBased_Amazon {
  @Test
  public void testDropdown() throws InterruptedException
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.amazon.in/");
	  
	  //get the address of dropdown
	  WebElement dropdownele=driver.findElement(By.id("searchDropdownBox"));
	  
	  Utility.selectBasedDropdown(dropdownele,"Video Games");
	  
	  
	  
	  
	  /*
	  //dropdownele.click();
	  
	  //<select> ---Use Select class
	  
	  Select dd=new Select(dropdownele);
	  
	  System.out.println("Is dropdown supported multiple selection?: "+dd.isMultiple());
	  
	  //Single option selection
	  
	  dd.selectByIndex(3);
	  Thread.sleep(1500);
	  dd.selectByVisibleText("Kindle Store");
	  Thread.sleep(1500);
	  dd.selectByValue("search-alias=toys");
	  
	  /*
	   * total options for dropdown
	   * print all options
	   * then serch for specific option
	   * select that option if found
	   * 
	   
	  List<WebElement> allOption=dd.getOptions();
	  System.out.println("Total Options are: "+allOption.size());
	  
	  WebElement ele=null;
	  for(WebElement i:allOption)
	  {
		  System.out.println(i.getText());
		  if(i.getText().contains("MP3 Music"))
		  {
			  ele=i;
		  }
	  }
	  
	  
	  ele.click();
	  
	  
	  
	  */
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}

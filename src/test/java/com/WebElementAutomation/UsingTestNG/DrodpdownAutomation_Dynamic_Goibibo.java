package com.WebElementAutomation.UsingTestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.generic.Utility;

public class DrodpdownAutomation_Dynamic_Goibibo {
  @Test
  public void testDropdown()
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://www.goibibo.com/");
	  
	  //close the popup
	  driver.findElement(By.xpath("//span[contains(@class,'icClose')]")).click();
	  
	  
	  WebElement fromele=driver.findElement(By.xpath("(//p[text()='Enter city or airport'])[1]"));
	  
	  fromele.click();
	  
	  //fromele.sendKeys("p");
	  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("p");
	  
	  By loc=By.xpath("//ul[@id='autoSuggest-list']//li//span[@class='autoCompleteTitle ']");
	 
	  Utility.selectOtion(driver,loc,"Pantnagar, India");
	  
	  /*
	  //list
	  List<WebElement> flist=driver.findElements(By.xpath("//ul[@id='autoSuggest-list']//li//span[@class='autoCompleteTitle ']"));
	  
	  System.out.println("Total Options are: "+flist.size());
	  
	  WebElement ele=null;
	  for(WebElement i:flist)
	  {
		  System.out.println(i.getText());
		  if(i.getText().contains("Pantnagar, India"))
		  {
			  ele=i;
		  }
		  
	  }
	  
	  ele.click();
	  */
	  
	  
	  
	  
	  
  }
}

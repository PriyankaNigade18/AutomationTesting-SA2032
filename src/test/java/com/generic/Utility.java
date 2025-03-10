package com.generic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility 
{

	
	
	public static void selectBasedDropdown(WebElement ddele,String value)
	{
		Select dd=new Select(ddele);
		  
		  System.out.println("Is dropdown support multiple selection: "+dd.isMultiple());
		  
		  //get all options
		  List<WebElement> allOptions=dd.getOptions();
		 System.out.println("Total Options are: "+allOptions.size());
		 
		 WebElement ele=null;
		 for(WebElement i:allOptions)
		 {
			 System.out.println(i.getText());
			 if(i.getText().contains(value))
			 {
				 ele=i;
			 }
		 }
		  
		  ele.click();
		  
		  
	}
	
	
	
	
	public static void selectOtion(WebDriver driver,By loc,String value)
	{
		List<WebElement> flist=driver.findElements(loc);
		  
		  System.out.println("Total Options are: "+flist.size());
		  
		  WebElement ele=null;
		  for(WebElement i:flist)
		  {
			  System.out.println(i.getText());
			  if(i.getText().contains(value))
			  {
				  ele=i;
			  }
			  
		  }
		  
		  ele.click();
		
	}
	
	
	
	//scroll utility
	public static void scrollDown(WebDriver driver)
	{
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		  
	  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	
	public static void scrolUptoElement(WebDriver driver,WebElement ele)
	{
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		  
		 js.executeScript("arguments[0].scrollIntoView(true);",ele);
	}
	public static void scrollUp(WebDriver driver)
	{
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		  
	  js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	}
	
	
	
	
	

}

package com.WebElementAutomation.UsingTestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DynamicWebTableAutomation {
  @Test
  public void testDynamicTable() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  driver.get("https://demo.guru99.com/test/web-table-element.php");
	  
	  //number of rows=26
	  System.out.println("Number of rows: "+driver.findElements(By.xpath("//tbody//tr")).size());
	  
	  List<WebElement> headings=driver.findElements(By.xpath("//thead//tr//th"));
	  System.out.println("Number of Columns are: "+headings.size());//5
	  
	  System.out.println("******All Headings are******");
	  for(WebElement i:headings)
	  {
		  System.out.println(i.getText());
	  }
	  
	  System.out.println("*************Specific Column*************");
	  
	  List<WebElement> company=driver.findElements(By.xpath("//tbody//tr//td[1]"));
	  
	  	  
	  int count=0;//to get the row count
	  for(WebElement i:company)
	  { count++;//1
		  
	  	String pr=driver.findElement(By.xpath("//tbody//tr["+count+"]//td[3]")).getText();
	  	System.out.println(i.getText()+":"+pr);
	  }
	  
	  System.out.println("*************Specific rows*************");

	  //dataforrow=driver.findElements(By.xpath("//tbody//tr[1]//td"));
	  
	  int row=0;
	  for(WebElement i:company)
	  {
		  row++;
		  if(i.getText().contains("UCO Bank"))
		  {
			  System.out.println("Bank found at row: "+row);
			  List<WebElement> allCells=driver.findElements(By.xpath("//tbody//tr["+row+"]//td"));
			  for(WebElement k:allCells)
			  {
				  System.out.println(k.getText());
			  }
		  }
	  }
	  
	  
	  
	  
	  
	  
	  
	  
  }
}

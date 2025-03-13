package com.WebElementAutomation.UsingTestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StaticWebTableAutomation {
  @Test
  public void testStaticWebTable() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://automationplayground.com/crm/customers.html?email-name=test%40gmail.com&password-name=tetet&submit-name=");	  
	  
	  System.out.println("********Number of Rows*******");
	  int rows=driver.findElements(By.xpath("//table//tr")).size();
	  System.out.println("Total Rows including heading are: "+rows);//7
	  
	  System.out.println("********Number of columns*******");
	  List<WebElement> headings=driver.findElements(By.xpath("//table//thead//tr//th"));
	  System.out.println("Total columns in table: "+headings.size());
	  
	  System.out.println("********Print the headings*******");
	  
	  for(WebElement i:headings)
	  {
		  System.out.println(i.getText());
	  }
	  
	  System.out.println("********print specific row number 5*******");
	  List<WebElement> row=driver.findElements(By.xpath("(//tbody//tr)[5]//td"));
	  for(WebElement i:row)
	  {
		  System.out.println(i.getText());
	  }

	  System.out.println("*************All First Name column**************");
	  
	  
	  List<WebElement> column=driver.findElements(By.xpath("//tbody//tr//td[2]"));
	  
	  for(WebElement i:column)
	  {
		  System.out.println(i.getText());
	  }
	  
	  
	  System.out.println("*************All the data from table**************");

	  List<WebElement> alldata=driver.findElements(By.xpath("//tbody//tr//td"));	  
	  
	  for(WebElement i:alldata)
	  {
		  System.out.println(i.getText());
	  }
	  

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}

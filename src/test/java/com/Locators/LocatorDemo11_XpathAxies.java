package com.Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo11_XpathAxies {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://automationplayground.com/crm/customers.html?email-name=test%40gmail.com&password-name=dsasdsdfa&submit-name=");

		//identify tagname for ancestor node for john
		String tag1=driver.findElement(By.xpath("//td[text()='John']//ancestor::tbody")).getTagName();
		System.out.println("tagname for ancestor node for john: "+tag1);//tbody
		
		//identify parent of john
		String tag2=driver.findElement(By.xpath("//td[text()='John']//parent::tr")).getTagName();
		System.out.println("tagname of Parent for John: "+tag2);//tr
		
		//get the all child count for row number 4
		List<WebElement> list=driver.findElements(By.xpath("(//tbody//tr)[4]//child::td"));
		System.out.println("Total childs for row 4: "+list.size());//5
		
		for(WebElement i:list)
		{
			System.out.println(i.getText());
		}
		
		//get all number of rows after john
		int countafterrows=driver.findElements(By.xpath("//td[text()='John']//following::tr")).size();
		System.out.println("After john element number of rows are: "+countafterrows);
		
		//get all number of rows before john
		int countpfterrows=driver.findElements(By.xpath("//td[text()='John']//preceding::tr")).size();
		System.out.println("After john element number of rows are: "+countpfterrows);//4
		
		//get only following sibling 
		int fsibling=driver.findElements(By.xpath("//td[text()='John']//following-sibling::td")).size();
		System.out.println("Following siblings for John are: "+fsibling);//3
		
		//get only preceding sibling
		int psibling=driver.findElements(By.xpath("//td[text()='John']//preceding-sibling::td")).size();
		System.out.println("preceding siblings for John are: "+psibling);//3
		
		
		
		
		
		
		
		
	}

}

package com.WebTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommnads {

	public static void main(String[] args) 
	{
		// Create driver session
		WebDriver driver=new ChromeDriver();
		
		//get(url)
		//org.openqa.selenium.InvalidArgumentException: invalid argument
		//driver.get("google.com");
		
		driver.get("https://automationplayground.com/crm/");
		
		//get the title of current page-getTitle():String
		System.out.println("Title is: "+driver.getTitle());
		
		//get the current url -getCurrentUrl():String
		System.out.println(driver.getCurrentUrl());
		
		//get the page source -getPageSource()
		System.out.println(driver.getPageSource());
		
		//close() or Quit()
		//driver.close();
		driver.quit();
		
		
		
		
		

	}

}

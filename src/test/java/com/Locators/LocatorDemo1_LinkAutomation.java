package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo1_LinkAutomation {

	public static void main(String[] args)
	{
		//Create driver session
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://automationplayground.com/crm/");
		
		driver.manage().window().maximize();
		
		//signIn
		//driver.findElement(By.linkText("Sign In")).click();
		
		//NoSuchElementException: no such element
		//driver.findElement(By.linkText("In")).click();
		
		
		driver.findElement(By.partialLinkText("Sign In")).click();
		
		
	}

}

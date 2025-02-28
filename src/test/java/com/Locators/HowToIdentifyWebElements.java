package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToIdentifyWebElements {

	public static void main(String[] args)
	{
		// create driver session
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		
		//Technique3:Identify+action
		driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
		
		
		/*
		//Techinique2: Identify+Validate+Action
		WebElement searchEle=driver.findElement(By.id("APjFqb"));
		
		if(searchEle.isDisplayed() && searchEle.isEnabled())
		{
			searchEle.sendKeys("Cucumber");
		}
		*/
		
		
		
		
		
		//automation for serach box(webelement)
		/*
		//Technique1:By locator--Framework
		
		//get the address of element
		By searchBox=By.id("APjFqb");
		
		//identify address using selenium
		WebElement ele=driver.findElement(searchBox);
		
		//validate ele
		System.out.println("Is search box displayed?: "+ele.isDisplayed());//true
		System.out.println("Is search box enabled?: "+ele.isEnabled());//true
		
		//action on this ele
		ele.sendKeys("TestNG",Keys.ENTER);
		*/
	

	}

}

package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo4_ClassName {

	public static void main(String[] args)
	{
		// Create driver session
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

		
		//email
		driver.findElement(By.id("input-email")).sendKeys("priyankatest123@gmail.com");
		
		//password
		driver.findElement(By.name("password")).sendKeys("test123");
		
			
		//login
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		
		
		
	}

}

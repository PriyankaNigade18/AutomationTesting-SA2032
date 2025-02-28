package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo2_Id_Name {

	public static void main(String[] args) 
	{
		// Create driver session
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/");
		
		//click on SignIn
		driver.findElement(By.linkText("Sign In")).click();
		
		//email
		driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
		
		//password
		driver.findElement(By.name("password-name")).sendKeys("test123");
		
		//checkbox
		driver.findElement(By.id("remember")).click();
		
		//submit
		driver.findElement(By.id("submit-id")).click();
		
		//signOut
		driver.findElement(By.linkText("Sign Out")).click();
		
		//close
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		

	}

}

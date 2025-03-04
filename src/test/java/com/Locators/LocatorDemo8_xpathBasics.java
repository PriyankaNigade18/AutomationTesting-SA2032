package com.Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo8_xpathBasics {

	public static void main(String[] args) 
	{

		//create driver session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		//email
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("priyankatest123@gmail.com");
		
		//password
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("test123");
		
		
		//button
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		
		
		
		
		
		
		
		

	}

}

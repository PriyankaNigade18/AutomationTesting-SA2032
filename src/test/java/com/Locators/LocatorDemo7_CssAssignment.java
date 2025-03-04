package com.Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo7_CssAssignment {

	public static void main(String[] args)
	{
		// create driver session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		//username
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin");
		
		//password
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("admin123");
		
		//login
		//driver.findElement(By.cssSelector("button.oxd-button")).click();
		driver.findElement(By.cssSelector("button.oxd-button[type='submit']")).click();
		
		//logout
		//click in icon
		driver.findElement(By.cssSelector("i.oxd-userdropdown-icon")).click();
		
		//click on logout link
		driver.findElement(By.cssSelector("a[href='/web/index.php/auth/logout']")).click();
		
		
		
		
		
		
		
		
		
		
		
	}

}

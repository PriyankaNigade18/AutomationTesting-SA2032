package com.Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo9_XapthIndexing {

	public static void main(String[] args) 
	{
		// Create driver session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");

		//fname
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Shweta");
		
		//lname
		driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("sharma");
		//email
		driver.findElement(By.xpath("(//input[@class='form-control'])[3]")).sendKeys("shweta2024@gmail.com");
		
		//telephone
		driver.findElement(By.xpath("(//input[@class='form-control'])[position()=4]")).sendKeys("87766555");
		
	
		//password
		driver.findElement(By.xpath("(//input[@class='form-control'])[position()=5]")).sendKeys("test123");
		
		//cpassword
		driver.findElement(By.xpath("(//input[@class='form-control'])[6]")).sendKeys("test123");
		
		//radio-yes
		driver.findElement(By.xpath("(//input[@name='newsletter'])[1]")).click();
		
		//checkbox
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		
		//continue
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		//get the text of message
		String text=driver.findElement(By.xpath("(//h1)[2]")).getText();
		System.out.println("Result text is: "+text);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

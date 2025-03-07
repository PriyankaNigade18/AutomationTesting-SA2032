package com.Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo10_XpathMethods {

	public static void main(String[] args)
	{
		// Create driver session
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	//click on fashion-text()
	driver.findElement(By.xpath("//a[text()='Fashion']")).click();
	
	//open Cart page-normalize-space()
	driver.findElement(By.xpath("(//span[normalize-space()='Cart'])[2]")).click();
	
	
	//String cartText=driver.findElement(By.xpath("(//h3)[1]")).getText();
	String cartText=driver.findElement(By.xpath("//h3[normalize-space()='Your Amazon Cart is empty']")).getText();
	System.out.println(cartText);
	
	////search box :contains()
	driver.findElement(By.xpath("//input[contains(@id,'searchtex')]")).sendKeys("Watch",Keys.ENTER);
	
	//clear search and search for other product
	WebElement ele=driver.findElement(By.xpath("//input[starts-with(@id,'two')]"));
	
	ele.clear();
	ele.sendKeys("Bags",Keys.ENTER);
	
	
	
	
	
	

	}

}

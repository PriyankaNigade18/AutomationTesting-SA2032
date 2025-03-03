package com.Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo5_tagName {

	public static void main(String[] args)
	{

		//create driver session
		WebDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		
		//username
		//driver.findElement(By.name("1234")).sendKeys("Priyanka");
		
		//Number of inputBoxes
		List<WebElement> listOfInputs=driver.findElements(By.tagName("input"));
		System.out.println("Number of input boxes: "+listOfInputs.size());//0
		//System.out.println(listOfInputs);//[]
		
		//Number of images
		int count=driver.findElements(By.tagName("img")).size();
		System.out.println("Total Imgaes are: "+count);
		
		//Number of Links-->get the text of link --->get the value for href attribute
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		System.out.println("Total links are: "+allLinks.size());//5
		
		//iterate list and then get the text/attribute
		for(WebElement i:allLinks)
		{
		System.out.println(i.getText());
		System.out.println(i.getDomAttribute("href"));
		}
		
		
		
		
		
		
		

	}

}

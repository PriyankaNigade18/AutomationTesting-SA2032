package com.Capabilities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HeadlessTesting {
  @Test
  public void testHeadless() 
  {
	  
	  ChromeOptions options=new ChromeOptions();
	  options.addArguments("--headless");
	  
	  
	  
	  WebDriver driver=new ChromeDriver(options);
	  
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Driver session is created.....");
		driver.get("https://www.google.com");
		System.out.println("Google application launch.....");
		
		driver.findElement(By.id("APjFqb")).sendKeys("Mobile");
		System.out.println("Search for valid keyword.....");
		System.out.println("List of search options are.....");
		List<WebElement> allOptions=driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		System.out.println("Total Options are: "+allOptions.size());
		
		
		for(WebElement i:allOptions)
		{
			System.out.println(i.getText());
		}
		
		driver.quit();
		System.out.println("Driver session is closed.....");
		
	  
  }
}

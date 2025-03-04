package com.Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo9_Scenario1 {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		//get the list and print in console
		List<WebElement> allLinks=driver.findElements(By.xpath("//div[@class='list-group']/a"));
		System.out.println("Total options are: "+allLinks.size());
		
		String expLink="Register";
		WebElement ele=null;
		for(WebElement i:allLinks)
		{
			System.out.println(i.getText());
			if(i.getText().contains(expLink))
			{
				ele=i;
				
//				i.click();
//				break;
			}
		}
		System.out.println("found element: "+ele.getText());
		//click on matched link
		ele.click();
	}

}

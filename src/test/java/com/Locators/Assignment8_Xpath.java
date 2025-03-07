package com.Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8_Xpath {

	public static void main(String[] args)
	{
		// Create driver session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		
		//List<WebElement> footerlist=driver.findElements(By.xpath("//div[@class='navFooterVerticalRow navAccessibility']//div//ul//li//a"));
		List<WebElement> footerlist=driver.findElements(By.xpath("//div[contains(@class,'navFooterV')]//div//ul//li//a"));
		System.out.println("Total foooter links are: "+footerlist.size());
		
		WebElement ele=null;
		for(WebElement i:footerlist)
		{
			System.out.println(i.getText());
			if(i.getText().contains("Facebook"))
			{
//				i.click();
//				break;
				ele=i;
			}
		}
		
		
		//click on link
		ele.click();
		

	}

}

package com.WebTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateGoogleApplicationTitle {

	public static void main(String[] args) 
	{
		/*
		 * test google application title is Google
		 */

		//create driver session
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		String expTitle="Google";
		
		String actTitle=driver.getTitle();
		
		//validation
		if(actTitle.equals(expTitle))
		{
			System.out.println("Title matched....Test Pass!");
		}
		else
		{
			System.out.println("Title not matched...Test Fail!");
		}
		
		//close the browser
		driver.quit();
		
		
		
		
		
		
		
		
	}

}

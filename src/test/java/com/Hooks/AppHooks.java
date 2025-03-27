package com.Hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Utility.BrowserProvider;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AppHooks 
{
	public WebDriver driver;
	
	@Before
	public void setUp()
	{
		//driver=new ChromeDriver();
		driver=BrowserProvider.setDriver("chrome");
		System.out.println("Driver session is started....");
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
		System.out.println("Driver session is closed......");
	}

}

package com.TestNG.PageObjectModelUsingByLocator;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass 
{
	public WebDriver driver;
	public CRMLoginPage lp;
	
	@BeforeClass
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://automationplayground.com/crm/login.html");
		lp=new CRMLoginPage(driver);
		
	}

}

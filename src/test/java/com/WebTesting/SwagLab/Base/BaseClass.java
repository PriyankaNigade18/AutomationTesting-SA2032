package com.WebTesting.SwagLab.Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import com.WebTesting.SwagLab.Pages.P1_Login;
import com.WebTesting.SwagLab.Utility.*;

public class BaseClass
{
	public WebDriver driver;
	public P1_Login lp;
	public PropertiesUtil prop;
	
	@BeforeClass
	public void setUp() 
	{
		prop=new PropertiesUtil("config");
		
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		lp=new P1_Login(driver);
	}

}

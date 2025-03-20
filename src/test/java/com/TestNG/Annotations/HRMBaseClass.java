package com.TestNG.Annotations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class HRMBaseClass 
{
	public WebDriver driver;
	
	@BeforeClass
	public void setUp()
	{
		 driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}

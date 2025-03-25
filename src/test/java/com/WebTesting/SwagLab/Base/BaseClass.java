package com.WebTesting.SwagLab.Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import com.WebTesting.SwagLab.Pages.*;
import com.WebTesting.SwagLab.Utility.*;

public class BaseClass
{
	public WebDriver driver;
	public P1_Login lp;
	public PropertiesUtil prop;
	public P2_Inventory ip;
	public P3_CartPage cp;
	public P4_CheckOut ch;
	public P5_Overview op;
	
	@BeforeClass
	@Parameters({"bname"})
	public void setUp(String bname) 
	{
		prop=new PropertiesUtil("config");
		
		switch(bname)
		{
		case "chrome":driver=new ChromeDriver();break;
		case "edge": driver=new EdgeDriver();break;
		case "firefox":driver=new FirefoxDriver();break;
		default: return;
		}
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		lp=new P1_Login(driver);
		ip=new P2_Inventory(driver);
		cp=new P3_CartPage(driver);
		ch=new P4_CheckOut(driver);
		op=new P5_Overview(driver);
		
		
	}
	
	
	
	public void addWait()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
		
	}

}

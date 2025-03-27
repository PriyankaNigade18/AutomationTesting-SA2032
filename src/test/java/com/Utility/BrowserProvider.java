package com.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserProvider 
{
	static public WebDriver driver;
	
	/*
	 * In Java, the ThreadLocal class enables you to create variables 
	 * that are specific to each thread
	 * methods
	 * ------
	 * get()
	 * 
	 * set()
	 */
	
	static ThreadLocal<WebDriver> tdriver=new ThreadLocal<WebDriver>();
	
	
	public static  WebDriver setDriver(String bname)
	{
		switch(bname)
		{
		case "chrome": driver=new ChromeDriver();
						tdriver.set(driver);
						break;
		case "edge": driver=new EdgeDriver();
			tdriver.set(driver);
			break;
				
		}
		return getDriver();
	}
	
	public static  WebDriver getDriver()
	{
		 return tdriver.get();
		//return driver;
	}
	
	
	
	
	

}

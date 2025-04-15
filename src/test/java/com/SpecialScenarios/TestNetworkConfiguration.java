package com.SpecialScenarios;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Utilities.DriverUtil;
import com.Utilities.ElementUtil;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class TestNetworkConfiguration
{
	/*
	 * 
	 * toggleWifi()
	 * toggleData():mobile data
	 * toggleAirplaneMode()
	 * 
	 */
  @Test
  public void testNetwrokConfiguration() throws InterruptedException
  {
	  
	  //create driver session
	  
	  AppiumDriver driver=DriverUtil.initAppiumDriver();
	  
	  
	  System.out.println("Current state of Wifi is ON");
	  //ON--->OFF
	  
	  ((AndroidDriver)driver).toggleWifi();
	  
	  Thread.sleep(2000);
	  System.out.println("After calling Method state of Wifi is OFF");
	  //OFF--->ON
	  
	  ((AndroidDriver)driver).toggleWifi();
	  
	  System.out.println("After calling Method state of Wifi is ON");

	  //mobile data do swipe
	  
	  //area
	  WebElement area=driver.findElement(AppiumBy.id("com.android.systemui:id/tile_page"));
	  ElementUtil.swipeLeft(driver,area);
	  
	  Thread.sleep(2000);
	  
	  System.out.println("Current status of MobileData is ON");
	  //ON to OFF
	  
	  ((AndroidDriver)driver).toggleData();
	  
	  System.out.println("After calling method status of MobileData is OFF");
	  
	  Thread.sleep(2000);
	  
	  //OFF To ON
	  ((AndroidDriver)driver).toggleData();
	  
	  System.out.println("After calling method status of MobileData is ON");
	  
	  //Airplane Mode
	  Thread.sleep(2000);
	  
	  System.out.println("Current status of AirplaneMode is OFF");
	  //OFF to ON
	  
	  ((AndroidDriver)driver).toggleAirplaneMode();
	  
	  System.out.println("After calling method status of AirplaneMode is ON");
	  //ON--->OFF
	  
	  Thread.sleep(2000);
	  
	  ((AndroidDriver)driver).toggleAirplaneMode();
	  
	  System.out.println("After calling method status of AirplaneMode is OFF");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}

package com.TestMobileElementScenarios;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.Utilities.DriverUtil;
import com.Utilities.ElementUtil;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class TestSwipeGesture {
  @Test
  public void testGesture() throws InterruptedException 
  {
	  
	  //create a driver session
	  
	  AppiumDriver driver=DriverUtil.initAppiumDriver();
	  
	  //views
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //Gallery
	  driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
	  
	  //photos
	  driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
	  //area
	  WebElement area=driver.findElement(AppiumBy.id("io.appium.android.apis:id/gallery"));
	  
	  //gesture
	  
	  ElementUtil.swipeLeft(driver,area);
	  
	  Thread.sleep(2000);
	  
	  ElementUtil.swipeRight(driver,area);
	  /*
	  driver.executeScript("mobile:swipeGesture",ImmutableMap.of(
			  
			  "elementId",((RemoteWebElement)area).getId(),
			  "direction","left",
			  "percent",1.0
			  ));
	  */
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}

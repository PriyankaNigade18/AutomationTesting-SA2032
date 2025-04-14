package com.TestMobileElementScenarios;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.Utilities.DriverUtil;
import com.Utilities.ElementUtil;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class TestScrollGesture {
  @Test
  public void testGesture()
  {
	  //create driver session
	  
	  AppiumDriver driver=DriverUtil.initAppiumDriver();
	  
	  
	  //views
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //area to scroll
	  WebElement area=driver.findElement(AppiumBy.id("android:id/list"));
	  
	  
	  ElementUtil.scrollDownUpToCount(driver,area,2);
	  
	  /*
	  //scrollgesture
	  driver.executeScript("mobile:scrollGesture",ImmutableMap.of(
			  "elementId",((RemoteWebElement)area).getId(),
			  "direction","down",
			  "percent",1.0
			  		  
			  ));
	  
	  System.out.println("Page is Scrolling down!");
	  
	  */
	  
	  
	  
  }
}

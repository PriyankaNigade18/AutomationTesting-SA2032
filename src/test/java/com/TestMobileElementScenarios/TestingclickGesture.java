package com.TestMobileElementScenarios;

import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.Utilities.DriverUtil;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class TestingclickGesture {
  @Test
  public void testClickGesture() 
  
  {
	  //create driver session
	  
	  AppiumDriver driver=DriverUtil.initAppiumDriver();
	  
	  
	  //element
	  WebElement ele=driver.findElement(AppiumBy.accessibilityId("Views"));
	  
	  //click gesture
	  
	  driver.executeScript("mobile:clickGesture",ImmutableMap.of(
			  
			  "elementId",((RemoteWebElement)ele).getId()
			  
			   ));
	  
	  System.out.println("Click Gesture Completed!");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}

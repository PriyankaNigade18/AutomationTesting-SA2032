package com.TestMobileElementScenarios;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Utilities.DriverUtil;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class TestDragGesture {
  @Test
  public void testDragGesture()
  {
	  //create a driver session
	  AppiumDriver driver=DriverUtil.initAppiumDriver();
	  
	  //views
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //drag and drop
	  driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
	  
	  //dot1
	  WebElement ele=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));
	  
	  //gesture
	  driver.executeScript("mobile:dragGesture",ImmutableMap.of(
			  
			  "elementId",((RemoteWebElement)ele).getId(),
			  "endX",804,
			  "endY",1543
			  
			  ));
	  
	  //result message
	  String resultText=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_result_text")).getText();
	  
	  String exp="Dropped!";
	  Assert.assertEquals(resultText,exp);
	  System.out.println("Result Text is: "+resultText);
	  
	  
  }
}

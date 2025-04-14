package com.TestMobileElementScenarios;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Utilities.DriverUtil;
import com.Utilities.ElementUtil;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class AutomateKeyboardEvents {
  @Test
  public void testKeyPressEvent()
  {
	  //create driver session
	  AppiumDriver driver=DriverUtil.initAppiumDriver();
	  
	  //views
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //area
	  WebElement area=driver.findElement(AppiumBy.id("android:id/list"));
	  
	  //sroll 3 time
	  ElementUtil.scrollDownUpToCount(driver,area,3);
	  
	  //textFields
	  driver.findElement(AppiumBy.accessibilityId("TextFields")).click();
	  
	  //tyeparea
	  WebElement editArea=driver.findElement(AppiumBy.id("io.appium.android.apis:id/edit"));
	  
	  //sendKeys()
	  //editArea.sendKeys("Hello All!");
	  
	  //virtual keyboard
	  
	  ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.H));
	  ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.E));
	  ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.L));
	  ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.L));
	  ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.O));
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}

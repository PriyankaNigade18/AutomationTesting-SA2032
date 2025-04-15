package com.SpecialScenarios;

import org.openqa.selenium.ScreenOrientation;
import org.testng.annotations.Test;

import com.Utilities.DriverUtil;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class TestDeviceLock_Unlock_Rotate {
  @Test
  public void deviceLockUnlock() throws InterruptedException
  {
	  
	  //create driver session
	  AppiumDriver driver=DriverUtil.initAppiumDriver();
	  
	  //lock
	 ((AndroidDriver)driver).lockDevice();
	  
	  
	 Thread.sleep(2000);
	 
	 //unlock 
	 ((AndroidDriver)driver).unlockDevice();
	  
	  
	 Thread.sleep(2000);
	 
	  //rotate screen
	 ((AndroidDriver)driver).rotate(ScreenOrientation.LANDSCAPE);
	 
	 Thread.sleep(2000);
	 
	 ((AndroidDriver)driver).rotate(ScreenOrientation.PORTRAIT);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}

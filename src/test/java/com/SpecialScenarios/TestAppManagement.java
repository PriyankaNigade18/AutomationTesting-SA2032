package com.SpecialScenarios;

import java.time.Duration;

import org.testng.annotations.Test;

import com.Utilities.DriverUtil;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class TestAppManagement {
  @Test
  public void testApp() throws InterruptedException 
  {
	  //create driver session
	  
	  AppiumDriver driver=DriverUtil.initAppiumDriver();
	  
	  String packageName=((AndroidDriver)driver).getCurrentPackage();
	  
	  //current status of application 
	  System.out.println("Current App status is: "+((AndroidDriver)driver).queryAppState(packageName));
	  
	  
	  //terminateApp
	  ((AndroidDriver)driver).terminateApp(packageName);
	  System.out.println("After Terminate App status is: "+((AndroidDriver)driver).queryAppState(packageName));

	  Thread.sleep(2000);
	  
	  
	  //activate app
	  
	  ((AndroidDriver)driver).activateApp(packageName);
	  System.out.println("After Activate App status is: "+((AndroidDriver)driver).queryAppState(packageName));

	  //un-installation of app- removeApp()
	  
	  Thread.sleep(2000);

	  ((AndroidDriver)driver).removeApp(packageName);
	  System.out.println("After uninstallation App status is: "+((AndroidDriver)driver).queryAppState(packageName));

	  //to install app- installApp()
	  Thread.sleep(2000);
	  
	  String path=System.getProperty("user.dir")+"//src//test//resources//ApiDemos-debug.apk";
	  ((AndroidDriver)driver).installApp(path);
	    
	  System.out.println("After installation App status is: "+((AndroidDriver)driver).queryAppState(packageName));

	  
	  //activate app
	  
	  ((AndroidDriver)driver).activateApp(packageName);
	  System.out.println("After Activate App status is: "+((AndroidDriver)driver).queryAppState(packageName));

	  Thread.sleep(2000);
	  //background app
	 ((AndroidDriver)driver).runAppInBackground(Duration.ofMillis(5000));
	 
	  System.out.println("After Runnig app in background App status is: "+((AndroidDriver)driver).queryAppState(packageName));

	 
	  
	  
	  
	  
	  
	  
	  
	  
  }
}

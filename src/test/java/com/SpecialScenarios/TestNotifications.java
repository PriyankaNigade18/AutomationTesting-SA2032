package com.SpecialScenarios;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Utilities.DriverUtil;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class TestNotifications {
  @Test
  public void testNotifications() 
  {
	  //create driver session
	  AppiumDriver driver=DriverUtil.initAppiumDriver();
	  
	  //to open notification first convert appium driver to android driver
	  
	  ((AndroidDriver)driver).openNotifications();
	  
	//expandButton
	  driver.findElement(AppiumBy.accessibilityId("Expand")).click();
	  
	  //number of notifications
	  List<WebElement> notifications=driver.findElements(AppiumBy.id("android:id/title"));
	  
	  System.out.println("For Android System  and Appium Setting Total Notifications are: "+notifications.size());//2
	  
	  
	  System.out.println("*****Notification Headings are*****");
	  //headings for every notification
	  
	  for(WebElement i:notifications)
	  {
		  System.out.println(i.getText());
	  }
	  
	  
	  
	  
	  
	  
  }
}

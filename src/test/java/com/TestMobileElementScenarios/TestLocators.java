package com.TestMobileElementScenarios;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Utilities.DriverUtil;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class TestLocators {
  @Test
  public void testAllMobileLocators() throws InterruptedException
  {
	  
	  //create driver session
	 AppiumDriver driver= DriverUtil.initAppiumDriver();
	  
	  
	 //locator1: accessibility id
	 WebElement ele1=driver.findElement(AppiumBy.accessibilityId("Access'ibility"));
	 System.out.println("Text of element1: "+ele1.getText());
	 ele1.click();
	 
	 Thread.sleep(1500);
	 //navigate back
	 driver.navigate().back();
	 
	 //Locator2: id/resource-id
	 WebElement ele2=driver.findElements(AppiumBy.id("android:id/text1")).get(2);
	 System.out.println("Text of element2: "+ele2.getText());
	 ele2.click();
	 
	 Thread.sleep(1500);
	 //navigate back
	 driver.navigate().back();
	 
	 //Locator3: className
	 WebElement ele3=driver.findElements(AppiumBy.className("android.widget.TextView")).get(4);
	 System.out.println("Text of element3: "+ele3.getText());
	 ele3.click();
	 
	 Thread.sleep(1500);
	 //navigate back
	 driver.navigate().back();
	 
	 
	 //Locator4:Xpath
	 WebElement ele4=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Content\"]"));
	 System.out.println("Text of element4: "+ele4.getText());
	 ele4.click();
	 
	 Thread.sleep(1500);
	 //navigate back
	 driver.navigate().back();
	 
	 //Locator5:-android uiautomator
	 WebElement ele5=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Views\")"));
	 System.out.println("Text of element5: "+ele5.getText());
	 ele5.click();
	 
	 Thread.sleep(1500);
	 //navigate back
	 driver.navigate().back();
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	  
	  
	  
	  
  }
}

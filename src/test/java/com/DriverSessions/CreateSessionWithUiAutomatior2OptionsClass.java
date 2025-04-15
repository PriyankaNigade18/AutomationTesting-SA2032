package com.DriverSessions;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class CreateSessionWithUiAutomatior2OptionsClass {
  @Test
  public void testDriverSession() throws MalformedURLException, URISyntaxException
   {
	  //session info
	  UiAutomator2Options option=new UiAutomator2Options();
	  //app
	  String path=System.getProperty("user.dir")+"//src//test//resources//ApiDemos-debug.apk";
	  option.setCapability("appium:app",path);
	  
	  
	  //server details
	  //URL url=new URL("http://0.0.0.0:4723");
	  
	  URL url=new URI("http://0.0.0.0:4723").toURL();
	  
	  //craete  appium driver session
	  AppiumDriver driver=new AndroidDriver(url,option);
	  System.out.println("After connection session id is: "+driver.getSessionId());
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}

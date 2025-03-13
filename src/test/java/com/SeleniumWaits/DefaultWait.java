package com.SeleniumWaits;

import java.util.Map;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DefaultWait {
  @Test
  public void testDefaultTime()
  {
	  
	  //default wait In Selenium
	  
	  ChromeDriver driver1=new ChromeDriver();
	  
	  Capabilities cap=driver1.getCapabilities();
	  
	  Map<String,Object> allCap=cap.asMap();
	  
	 System.out.println(allCap);
	  
	 //timeouts={implicit=0, pageLoad=300000, script=30000}
	 
	 System.out.println("********************");
	 
	  
	  EdgeDriver driver2=new EdgeDriver();
	  
	  Capabilities cap2=driver2.getCapabilities();
	  
	  Map<String,Object> allCap2=cap2.asMap();
	  
	 System.out.println(allCap2);
	 System.out.println("********************");
	 
	 FirefoxDriver driver3=new FirefoxDriver();
	  
	  Capabilities cap3=driver3.getCapabilities();
	  
	  Map<String,Object> allCap3=cap3.asMap();
	  
	 System.out.println(allCap3);
	 System.out.println("********************");
	 
	 
	 
	 //
	 /*
	  * {acceptInsecureCerts=false,
	  *  browserName=chrome,
	  *   browserVersion=134.0.6998.89,
	  *    chrome={chromedriverVersion=134.0.6998.88 (7e3d5c978c6d3a6eda25692cfac7f893a2b20dd0-refs/branch-heads/6998@{#1898}), userDataDir=C:\Users\Ganes\AppData\Local\Temp\scoped_dir6048_1208803269}, fedcm:accounts=true, 
	  *    goog:chromeOptions={debuggerAddress=localhost:52311},
	  *     networkConnectionEnabled=false, pageLoadStrategy=normal,
	  *      platformName=windows, proxy=Proxy(), 
	  *      se:cdp=ws://localhost:52311/devtools/browser/6a9734ee-1b58-4432-88c5-3c3ddb3ffcf4, se:cdpVersion=134.0.6998.89, setWindowRect=true, 
	  *      strictFileInteractability=false,
	  *       timeouts={implicit=0, pageLoad=300000, script=30000}, 
	  *      unhandledPromptBehavior=dismiss and notify, webauthn:extension:credBlob=true, webauthn:extension:largeBlob=true, webauthn:extension:minPinLength=true, webauthn:extension:prf=true,
	  *  webauthn:virtualAuthenticators=true}
	  * 
	  * 
	  * 
	  */
	  
	  
  }
}

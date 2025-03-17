package com.Capabilities;

import java.util.Map;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AllCapabilitiesForBrowser {
  @Test
  public void testCapabilities()
  {
	  
	  ChromeDriver driver=new ChromeDriver();
	  Capabilities cap=driver.getCapabilities();
	  Map<String,Object> allCap=cap.asMap();
	  
	  System.out.println(allCap);
	  
	  /*
	   * {acceptInsecureCerts=false, 
	   * browserName=chrome,
	   *  browserVersion=134.0.6998.89,
	   *   chrome={chromedriverVersion=134.0.6998.88 
	   *   (7e3d5c978c6d3a6eda25692cfac7f893a2b20dd0-refs/branch-heads/6998@{#1898}), userDataDir=C:\Users\Ganes\AppData\Local\Temp\scoped_dir37660_683777918}, 
	   *   fedcm:accounts=true, 
	   *   goog:chromeOptions={debuggerAddress=localhost:50345}, 
	   *   networkConnectionEnabled=false, 
	   *   pageLoadStrategy=normal,
	   *    platformName=windows, 
	   *   proxy=Proxy(),
	   *    se:cdp=ws://localhost:50345/devtools/browser/e3f14174-e9cb-4d99-a286-43a22a263607, se:cdpVersion=134.0.6998.89, setWindowRect=true, 
	   *    strictFileInteractability=false, 
	   *    timeouts={implicit=0, pageLoad=300000, script=30000}, 
	   *    unhandledPromptBehavior=dismiss and notify, webauthn:extension:credBlob=true, webauthn:extension:largeBlob=true, webauthn:extension:minPinLength=true, 
	   * webauthn:extension:prf=true,
	   *  webauthn:virtualAuthenticators=true}
	   */
	  
	  
	  
  }
}

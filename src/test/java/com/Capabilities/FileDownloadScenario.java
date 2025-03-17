package com.Capabilities;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class FileDownloadScenario {
  @Test
  public void testFileDownload()
  {
	  ChromeOptions options = new ChromeOptions();
	  Map<String, Object> prefs = new HashMap<String, Object>();
	  prefs.put("download.default_directory","C:\\Users\\Ganes\\OneDrive\\Desktop\\Learning\\JavaSelenium2032\\MavenSeleniumTest\\Downloads");
	  options.setExperimentalOption("prefs", prefs);
	  
	  
	  WebDriver driver=new ChromeDriver(options);
	  driver.get("https://the-internet.herokuapp.com/download");
	  
	  //file
	  driver.findElement(By.linkText("requirements.txt")).click();
	  
  }
}

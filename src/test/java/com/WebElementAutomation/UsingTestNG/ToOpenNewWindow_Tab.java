package com.WebElementAutomation.UsingTestNG;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToOpenNewWindow_Tab {
  @Test
  public void testNewWindow_Tab()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	  
//	  String parentId=driver.getWindowHandle();
//	  System.out.println("HomePageId:"+parentId);
	  
	  //new tab
	 WebDriver newTab=driver.switchTo().newWindow(WindowType.TAB);
	 newTab.get("https://www.facebook.com");
//	 String tabId=newTab.getWindowHandle();
//	 System.out.println("TabId:"+tabId);
//	 
	 //newWindow
	 WebDriver newWin=driver.switchTo().newWindow(WindowType.WINDOW);
	 newWin.get("https://www.amazon.in");
	 
//	 String windowId=newWin.getWindowHandle();
//	 System.out.println("WindowId:"+windowId);
//	 System.out.println("******************************");
//	 Set<String> all=driver.getWindowHandles();
//	 System.out.println(all);
	 
  }
}

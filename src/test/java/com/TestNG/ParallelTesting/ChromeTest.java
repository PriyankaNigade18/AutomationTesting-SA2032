package com.TestNG.ParallelTesting;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeTest {
	@Test
	  public void cTest()
	  {
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.amazon.com");
	  }
}

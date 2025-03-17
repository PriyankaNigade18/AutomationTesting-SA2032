package com.Capabilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.awt.AWTException;
import java.awt.Robot;

public class TestFileUploadUsingRobotclass {
  @Test
  public void testFileUpload() throws AWTException
    {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/upload");
	  
	  //select the file
	 WebElement ele= driver.findElement(By.id("file-upload"));
	  
	 Actions act=new Actions(driver);
	 act.moveToElement(ele).click().build().perform();
	 
	 Robot rb=new Robot();
	 rb.delay(4000);
	 
	 
	 //Ctrl+c copy path from clipboard
	 StringSelection sc=new StringSelection("C:\\Users\\Ganes\\OneDrive\\Desktop\\Appiumsetup.txt");
	 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sc,null);
	 
	 //ctrl+v key press
	 
	 rb.keyPress(KeyEvent.VK_CONTROL);
	 rb.keyPress(KeyEvent.VK_V);
	 
	 //ctrl+v key release
	 rb.keyRelease(KeyEvent.VK_CONTROL);
	 rb.keyRelease(KeyEvent.VK_V);
	 
	 //press Enter key
	 rb.keyPress(KeyEvent.VK_ENTER);
	 
	  
	 rb.delay(3000);
	  //upload the file
	  driver.findElement(By.id("file-submit")).click();
	  
	  //text message
	  String confirmationText=driver.findElement(By.tagName("h3")).getText();
	  System.out.println(confirmationText);
	  
	  
	  
	  
	  
	  
  }
}

package com.MouseOperation_ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SliderAction {
  @Test
  public void testSlider()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://jqueryui.com/slider/");
	  
	  
	  //frame
	  driver.switchTo().frame(0);
	  
	  
	  //ele
	  WebElement sliderEle=driver.findElement(By.xpath("//span[contains(@class,'ui-slider-handle')]"));
	  
	  //MoveTargetOutOfBoundsException:for wrong offset
	  Actions act=new Actions(driver);
	  act.clickAndHold(sliderEle).moveToElement(sliderEle,100,0).build().perform();
	  
	  
	  
	  
	  
	  
	  
  }
  
}

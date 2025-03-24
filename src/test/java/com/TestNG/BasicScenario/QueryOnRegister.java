package com.TestNG.BasicScenario;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class QueryOnRegister {
  @Test
  public void f() 
  {
	  WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
	    driver.findElement(By.id("name")).sendKeys("Guriya Rana");
	    driver.findElement(By.name("email")).sendKeys("guriyarana1992@gmail.com");
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Guriya@1234");
	    driver.findElement(By.xpath("//input[@placeholder='Enter your mobile number']")).sendKeys("9471132218");
	    driver.findElement(By.xpath("//div[@data-val='fresher']")).click();
	    WebElement ccity= driver.findElement(By.id("currentCity"));
	    ccity.click();
	    ccity.sendKeys("Pune");
	    //pune first element
	    driver.findElement(By.xpath("//li[@value='a139']")).click();
	    
	    //checkbox
	    driver.findElement(By.xpath("//i[contains(@class,'resman-icon-check-box')]")).click();
	    
	   
  }
}

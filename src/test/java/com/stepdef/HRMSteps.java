package com.stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HRMSteps 
{
	WebDriver driver;
	
	@Given("Open Orangehrm application")
	public void open_orangehrm_application() 
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
	}

	@When("User enter {string} and user enter {string}")
	public void user_enter_and_user_enter(String un, String psw) {
	    
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(psw);
	}

	@When("User click on Hrm login button")
	public void user_click_on_hrm_login_button()
	{
	   
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("User should navigate to dashboard page")
	public void user_should_navigate_to_dashboard_page() {

Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"Login Fail!");
System.out.println("Login Completed!");
	}



}

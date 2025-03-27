package com.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Hooks.AppHooks;
import com.Utility.BrowserProvider;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class CRMStep //extends AppHooks not allowed
{
	WebDriver driver=BrowserProvider.getDriver();
	
//	@Before
//	public void setUp()
//	{
//		driver=new ChromeDriver();
//		System.out.println("Driver session is started....");
//	}
//	
//	@After
//	public void tearDown()
//	{
//		driver.quit();
//		System.out.println("Driver session is closed......");
//	}
	@Given("Open CRM application")
	public void open_crm_application() {
	    driver.get("https://automationplayground.com/crm/login.html");
	}

	@When("I enter email  {string} and password {string}")
	public void i_enter_email_and_password(String email, String psw) {
	    
		driver.findElement(By.id("email-id")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(psw);
		
	}

	@When("I click on CRM login button")
	public void i_click_on_crm_login_button()
	{
	    driver.findElement(By.id("submit-id")).click();
	}

	@Then("I should able to login in CRM")
	public void i_should_able_to_login_in_crm() {
	   
		System.out.println("Login completed!");
	}
}

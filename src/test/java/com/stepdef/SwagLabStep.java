package com.stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class SwagLabStep
{
	WebDriver driver;
	String title;

	@Given("Open SwagLab application")
	public void open_swag_lab_application() {

		 driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String url="https://www.saucedemo.com/";
		if(url.contains("https") && url!=null)
		{
			System.out.println("Url is appropriate...");
			driver.get(url);
		}

	}

	@When("user enter {string} and enters {string}")
	public void user_enter_and_enters(String un, String psw) {
	    
		driver.findElement(By.id("user-name")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(psw);
	}

	@When("user click on Login button")
	public void user_click_on_login_button() {
	    
		driver.findElement(By.id("login-button")).click();
	}

	@Then("user should navigate to InventoryPage")
	public void user_should_navigate_to_inventory_page() {
	    Assert.assertTrue(driver.getCurrentUrl().contains("inventory"),"Login Fail!");
	    System.out.println("Login Completed!");
	}

	@When("user get the actual title")
	public void user_get_the_actual_title() {
	    
		title=driver.getTitle();
	}

	@Then("title should match with Swag Labs")
	public void title_should_match_with_swag_labs() {
	    
		Assert.assertEquals(title,"Swag Labs");
		System.out.println("Title is matched....");
		
	}
}

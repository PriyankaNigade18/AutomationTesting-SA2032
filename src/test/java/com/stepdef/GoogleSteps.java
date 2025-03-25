package com.stepdef;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSteps
{
	WebDriver driver;
	 String actTitle;
	@Given("Open Google application")
	public void open_google_application()
	{
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.google.com");
	}

	@When("I get the current title of google application")
	public void i_get_the_current_title_of_google_application()
	{
	   actTitle=driver.getTitle();
	    System.out.println("Current title is: "+actTitle);
	}

	@Then("title should match with Google")
	public void title_should_match_with_google()
	{
	
		Assert.assertEquals(actTitle,"Google");
		System.out.println("Title matched!");
	}
	
	@When("I enter valid keyword as {string} in search box")
	public void i_enter_valid_keyword_as_in_search_box(String keyword) {
	    
		driver.findElement(By.id("APjFqb")).sendKeys(keyword);
	}

	@Then("I should get valid options from Google Search")
	public void i_should_get_valid_options_from_google_search() {
	    
		List<WebElement> allOptions=driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		for(WebElement i:allOptions)
		{
			System.out.println(i.getText());
		}
	}


}

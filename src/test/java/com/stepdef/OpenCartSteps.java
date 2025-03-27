package com.stepdef;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class OpenCartSteps
{
	WebDriver driver;

	@Given("Open Regiter page of OpenCart with url {string}")
	public void open_regiter_page_of_open_cart_with_url(String url) {
	   
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		
	}

	@When("I enter required fields")
	public void i_enter_required_fields(DataTable table) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    
//		List<List<String>> data=table.cells();
//		
//		driver.findElement(By.id("input-firstname")).sendKeys(data.get(1).get(0));
		
		List<Map<String,String>> data=table.asMaps();
		driver.findElement(By.id("input-firstname")).sendKeys(data.get(0).get("firstname"));
		driver.findElement(By.id("input-lastname")).sendKeys(data.get(0).get("lastname"));
		driver.findElement(By.id("input-email")).sendKeys(data.get(0).get("email"));
		driver.findElement(By.id("input-telephone")).sendKeys(data.get(0).get("telephone"));
		driver.findElement(By.id("input-password")).sendKeys(data.get(0).get("password"));
		driver.findElement(By.id("input-confirm")).sendKeys(data.get(0).get("cpassword"));
		
	}

	@When("I click on yes radio button")
	public void i_click_on_yes_radio_button() {
	    driver.findElement(By.xpath("(//input[@name='newsletter'])[1]")).click();
	}

	@When("I click on privacy policy checkbox")
	public void i_click_on_privacy_policy_checkbox() {
driver.findElement(By.name("agree")).click();

	}

	@When("I click on Continue button")
	public void i_click_on_continue_button() {
	    driver.findElement(By.xpath("//input[@value='Continue']")).click();
	}

	@Then("I should able to register and should get message")
	public void i_should_able_to_register_and_should_get_message() {
	    
		String exp="Created";
		String act=driver.findElement(By.xpath("(//h1)[2]")).getText();
		
		Assert.assertTrue(act.contains(exp));
		System.out.println("confirmation message is: "+act);
	}

	@Given("Open login page with url {string}")
	public void open_login_page_with_url(String url) {
	    driver=new ChromeDriver();
	    driver.get(url);
	}

	@When("I enter email {string} and  I enter password {string}")
	public void i_enter_email_and_i_enter_password(String email, String psw) {
	    driver.findElement(By.name("email")).sendKeys(email);
	    driver.findElement(By.id("input-password")).sendKeys(psw);
	}

	@When("I click on cart Login button")
	public void i_click_on_cart_login_button() {

driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@Then("I should able to login")
	public void i_should_able_to_login()
	{
	    System.out.println("User login is completed!");
	}


}

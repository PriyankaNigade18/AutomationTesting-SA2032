package com.stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class AmazonSteps 
{
	WebDriver driver;
	String actTitle;
	
@Given("Open Amazon application")
public void open_amazon_application() {
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
}

@When("I get the title of amazon homepage")
public void i_get_the_title_of_amazon_homepage() {
    
	actTitle=driver.getTitle();
}

@Then("Title should match with amazon homepage")
public void title_should_match_with_amazon_homepage() {
    Assert.assertTrue(actTitle.contains("India"));
    System.out.println("Home page title matched!");
}

@When("I Open Mobiles page")
public void i_open_mobiles_page() {
    driver.findElement(By.linkText("Mobiles")).click();
}

@When("I get the title of mobiles page")
public void i_get_the_title_of_mobiles_page() {
    actTitle=driver.getTitle();
}

@Then("Title should  match with mobiles page")
public void title_should_match_with_mobiles_page() {
   Assert.assertTrue(actTitle.contains("Phones"));
   System.out.println("Mobiles page title matched!");
}

@When("I Open Fashion page")
public void i_open_fashion_page() {
   driver.findElement(By.linkText("Fashion")).click();
}

@When("I get the title of fashion page")
public void i_get_the_title_of_fashion_page() {
    actTitle=driver.getTitle();
}

@Then("Title should match with fashion page")
public void title_should_match_with_fashion_page() {
	Assert.assertTrue(actTitle.contains("Store"));
	   System.out.println("Fashion page title matched!");
}

@When("I Open Computers page")
public void i_open_computers_page() {
    driver.findElement(By.linkText("Computers")).click();
}

@When("I get the title of Computers page")
public void i_get_the_title_of_computers_page() {
    actTitle=driver.getTitle();
}

@Then("Title should match with Computers page")
public void title_should_match_with_computers_page() {
	Assert.assertTrue(actTitle.contains("Computers"));
	   System.out.println("Computers page title matched!");
}

@When("I Open Books page")
public void i_open_books_page() {
    driver.findElement(By.linkText("Books")).click();
}

@When("I get the title of Books page")
public void i_get_the_title_of_books_page() {
    actTitle=driver.getTitle();
}

@Then("Title should match with Books page")
public void title_should_match_with_books_page() {
	Assert.assertTrue(actTitle.contains("Online"));
	   System.out.println("Books page title matched!");
}



}

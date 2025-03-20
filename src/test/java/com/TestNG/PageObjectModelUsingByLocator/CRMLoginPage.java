package com.TestNG.PageObjectModelUsingByLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Encapsulation:private data+ public methods
public class CRMLoginPage 
{
	private WebDriver driver;
	
	//constructor
	public CRMLoginPage(WebDriver driver)//object we will accept from base class
	{
		this.driver=driver;
	}
	
	//locators
	private By email=By.id("email-id");
	private By password=By.id("password");
	private By submitButton=By.id("submit-id");
	
	
	//actions
	public void setEmailId(String id)
	{
		driver.findElement(email).sendKeys(id);
	}
	
	public void setPassword(String psw)
	{
	driver.findElement(password).sendKeys(psw);
	}
	
	public void clickOnSubmitButton()
	{
		driver.findElement(submitButton).click();
	}
	
	public void doLogin(String eid,String psw)
	{
		driver.findElement(email).sendKeys(eid);
		driver.findElement(password).sendKeys(psw);
		driver.findElement(submitButton).click();
		
	}
	
	public String getAppUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}

}

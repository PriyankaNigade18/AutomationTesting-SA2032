package com.TestNG.PageObjectModelUsingPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	
	private WebDriver driver;
	
	//constructor
		public LoginPage(WebDriver driver)//driver from baseclass
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);//this is current class ref/object
		
		}
	
	

	//locator
	@FindBy(id="email-id")
	private WebElement email;
	
	@FindBy(name="password-name")
	private WebElement password;
	
	@FindBy(id="submit-id")
	private WebElement submitButton;
	
		//actions
	
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	public void setEmailId(String id)
	{
		email.sendKeys(id);
	}
	
	public void setPassword(String psw)
	{
		password.sendKeys(psw);
	}
	
	public void clickOnSubmitButton()
	{
		submitButton.click();
	}
	public void doLogin(String eid,String psw)
	{
		email.sendKeys(eid);
		password.sendKeys(psw);
		submitButton.click();
	}
}

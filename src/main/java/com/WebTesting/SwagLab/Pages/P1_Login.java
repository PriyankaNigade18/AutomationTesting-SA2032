package com.WebTesting.SwagLab.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P1_Login
{
	private WebDriver driver;
	
	//constructor
	public P1_Login(WebDriver driver)//from base class we read driver
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//loactor
	@FindBy(id="user-name")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement loginButton;
	
	
	//actions
	
	public void doLogin(String un,String psw)
	{
		username.sendKeys(un);
		password.sendKeys(psw);
		loginButton.click();
		/*the action where we are changing the current state 
		 * of application there we can add code to
		 *  return that page object
		 */
		//return new P2_Inventory();
		
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

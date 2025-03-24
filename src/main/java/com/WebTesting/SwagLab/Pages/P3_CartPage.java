package com.WebTesting.SwagLab.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P3_CartPage 

{	private WebDriver driver;
	
	
	public P3_CartPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//locators
	@FindBy(xpath="//div[@class='inventory_item_desc']")
	WebElement productDesc;
	
	@FindBy(xpath="//button[text()='Remove']")
	WebElement removeButton;
	
	@FindBy(id="continue-shopping")
	WebElement continueShoppingButton;
	
	@FindBy(id="checkout")
	WebElement checkoutbutton;
	
	
	//actions
	public P3_CartPage getCartProductDescription()
	{
		System.out.println("Cart Product description is: "+productDesc.getText());
		return this;
		
	}
	
	
	public P3_CartPage clickOnRemove()
	{
		removeButton.click();
		return this;
	}
	
	
	public P2_Inventory clickOncontinueShopping()
	{
		continueShoppingButton.click();
		return new P2_Inventory(driver);
	}
	
	public P4_CheckOut clickOnCheckOut()
	{
		checkoutbutton.click();
		//navigated to checkout page
		return new P4_CheckOut();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

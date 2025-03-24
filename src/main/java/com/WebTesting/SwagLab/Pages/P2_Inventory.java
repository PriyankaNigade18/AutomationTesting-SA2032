package com.WebTesting.SwagLab.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P2_Inventory
{
private WebDriver driver;

public P2_Inventory(WebDriver driver)//base class driver
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

//locators
@FindBy(xpath="//div//div[@class='inventory_item_name ']")
List<WebElement> allProducts;

@FindBy(xpath="//button[text()='Add to cart']")
WebElement addToCartButton;

@FindBy(xpath="//a[@class='shopping_cart_link']")
WebElement cartOption;

//actions
	public int getProductCount()
	{
	return allProducts.size();
	}
	
	
	public P2_Inventory getProductDetails()
	{
		System.out.println("Product details......");
		for(WebElement i:allProducts)
		{
			System.out.println(i.getText());
		}
		return this;
	}

	public P2_Inventory addProductToTheCart(String pname)
	{
		for(WebElement i:allProducts)
		{
			if(i.getText().contains(pname))
			{
				System.out.println("Product found in List!");
				i.click();
				break;
			}
		}
		
		
		//add that product to the cart
		addToCartButton.click();
		System.out.println(pname+" is added to the cart!");
		return this;
	}

	public P3_CartPage openCartPage()
	{
		cartOption.click();
		//after click we navigated to Cart page so return object
		return new P3_CartPage(driver);
	}
	
}

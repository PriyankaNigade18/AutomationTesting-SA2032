package com.WebTesting.SwagLab.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P5_Overview {
private WebDriver driver;
	
	public P5_Overview(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	
	@FindBy(xpath="//div[@class='summary_info']")
	WebElement summary;
	
	@FindBy(id="finish")
	WebElement finishButton;
	
	@FindBy(tagName="h2")
	WebElement confmessage;
	
	
	//actions
	public P5_Overview  getSummary()
	{
		System.out.println("Payment Summary:");
		System.out.println(summary.getText());
		return this;
	}
	
	public String clickOnFinish()
	{
		finishButton.click();
		return confmessage.getText();
	}
}

package com.qsp.object_repository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	
	public WelcomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(linkText = "Log in")
	private WebElement loginlink;
	
	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement shoppinglink;
	 
	@FindBy(linkText = "Register")
	private WebElement registerlink;

	public WebElement getLoginlink() {
		return loginlink;
	}

	public WebElement getShoppinglink() {
		return shoppinglink;
	}

	public WebElement getRegisterlink() {
		return registerlink;
	}
	
	
	


	
	
}

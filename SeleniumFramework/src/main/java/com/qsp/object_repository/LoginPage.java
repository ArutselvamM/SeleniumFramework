package com.qsp.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {

	    PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "Email")
	private WebElement emailtextfield;
	
	@FindBy(id="Password")
	private WebElement passtextfield;
	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginbutton;

	public WebElement getEmailtextfield() {
		return emailtextfield;
	}

	public WebElement getPasstextfield() {
		return passtextfield;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
	

}

package com.qsp.generic_utility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.qsp.object_repository.Homepage;
import com.qsp.object_repository.LoginPage;
import com.qsp.object_repository.WelcomePage;

public class Baseclass {
	
	fileutility filelib;
	WelcomePage wp;
	
	LoginPage lp;
	
	Homepage hp;
	
	WebDriver driver;

	@BeforeClass
	
	public void launchbrowser() throws IOException
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 filelib= new fileutility();
		String url = filelib.getDataFromProperty("URl");
		
		driver.get(url);
		 }
	
	@BeforeMethod

	public void Login() throws IOException {
		
		wp= new WelcomePage(driver);
		wp.getLoginlink().click();
		lp = new LoginPage(driver);
		
		String email = filelib.getDataFromProperty("Email");
		lp.getEmailtextfield().sendKeys(email);
		 String password = filelib.getDataFromProperty("Password");
		 lp.getPasstextfield().sendKeys(password);
		 lp.getLoginbutton().click();	
	
	}
	@AfterMethod
	
	public void Logout()
	{
		hp= new Homepage(driver);
		hp.getLogoutlink().click();
	}
	
	@AfterClass
	
	public void closeBrower(){
		driver.close();
	}

}


package com.qsp.generic_utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listenerutility extends Baseclass implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		
		String methodname = result.getName();
		JavaUtility javalib= new JavaUtility();
		String timestamp = javalib.getSystemTime();
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest= new File("./screenshots/"+methodname+timestamp+".png");
	 try {
		FileHandler.copy(temp, dest);
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	}
	
	 
	
	

}

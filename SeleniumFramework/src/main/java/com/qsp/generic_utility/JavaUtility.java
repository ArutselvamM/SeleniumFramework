package com.qsp.generic_utility;

import java.time.LocalDateTime;

public class JavaUtility {
	
	public String getSystemTime() 
	{
		return LocalDateTime.now().toString().replace(":", "-");
		return LocalDateTime.now().toString().replace(":", "-");
		
	}

}

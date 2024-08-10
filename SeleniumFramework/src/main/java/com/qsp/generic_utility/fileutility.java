package com.qsp.generic_utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class fileutility {
	public String getDataFromProperty(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./scr/test/resources/commondata.properties");
		Properties prop= new Properties();
		prop.load(fis);
		return prop.getProperty(key);
		
	}

}

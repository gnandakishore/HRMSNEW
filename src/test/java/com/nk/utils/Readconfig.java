package com.nk.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {
	String property;
	
	public String readconfig(String getprp)
	{
		try {
			FileInputStream fis = new FileInputStream(".//TestData.config.properties");
			Properties prp = new Properties();
			prp.load(fis);
			property = prp.getProperty(getprp);
		
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return property;
	}
	
	
}

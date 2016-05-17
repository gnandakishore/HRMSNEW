package com.nk.common;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.nk.utils.Readconfig;

public class common_test {
	
	protected static WebDriver uiDriver;

	Readconfig rdobj = new Readconfig();
	
	String browser = rdobj.readconfig("browser");
	String url = rdobj.readconfig("url");
	
	@BeforeMethod
	public void beforetest()
	{
	
		try {
			if(browser.equalsIgnoreCase("FF"))
			{
				uiDriver.get(url);
			}
			else
			if(browser.equalsIgnoreCase("GC"))
			{
			}
				
				
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}
	
	@AfterMethod
	public void aftertest() throws Exception
	{
		Thread.sleep(2000);
		uiDriver.close();
	}
	
	
	
}

package com.nk.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.nk.utils.BasePageObject;
import com.nk.utils.BaseTestObject;
import com.nk.utils.DbMacros;
import com.nk.pages.LoginPage;
import com.nk.pages.Webform2Page;
import com.nk.common.HSConstants;
import com.nk.utils.ExcelutilObject;;

public class LoginTest extends BaseTestObject
{


LoginPage objloginpage;
Webform2Page objwebformpage; 

@Test(priority=1)
public void clickonSubmitButton() throws Exception
{
	try 
	{
		
		
		objloginpage= new LoginPage(uiDriver);
		
		objloginpage.verifyUsername();
		//objloginpage.enterUsername("1104020");
		String userName=getExcelHRMSLogin(1, 1);
		objloginpage.enterUsername(userName);
		
		objloginpage.verifyPassword();
		
		String password=getExcelHRMSLogin(1, 2);
		System.out.println(password);
		objloginpage.enterPassword(password);
		//objloginpage.enterPassword("xqji9221XQ");
		
		
		objwebformpage=objloginpage.clickonSubmitButton();
		objwebformpage.getUsername();
		Thread.sleep(8000);
		
		
	} 
	
	catch (Exception e) 
	
	{
		throw new Exception("FAILED VERIFYING the LoginPage   TESTCASE" + "\n clickonSubmitButton" +e.getLocalizedMessage());
	}
	}

public String getExcelHRMSLogin(int row, int column) throws Exception
{

ExcelutilObject.setExcelFile(HSConstants.Path_TestData, "HRMSLogin");
return ExcelutilObject.getCellData(row, column);
}
}

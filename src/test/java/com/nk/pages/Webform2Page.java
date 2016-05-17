package com.nk.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.nk.utils.BasePageObject;

public class Webform2Page extends BasePageObject
{
public Webform2Page(WebDriver driver) 
{
	super(driver);
}
String actualResult=null;
String expectedResult=null;

By name=By.id("ctl00_lblLoggedInUser");

By DashboardMessage=By.id("ctl00_cphMain_Label2");

By MyrequestStatusMessage=By.id("ctl00_cphMain_lbl_RecentHeading");

By ReportiesRequestMessage=By.id("ctl00_cphMain_lbl_RecentHeadingOther");

By celebrationsMessage=By.id("ctl00_cphMain_lbl_RecentHeadingOther");

By EventsMessage=By.id("ctl00_cphMain_Label3");

By AttendeneceRegulationCount=By.xpath("//tr[@id='ctl00_cphMain_MPRequest']/td[2]//following-sibling::td[1]");
By onDutycount=By.xpath("//tr[@id='ctl00_cphMain_OTRequest']/td[2]/following-sibling:: td[1]");
By LeaveRequestCount=By.xpath("//tr[@id='ctl00_cphMain_LeaveRequest']/td[2]/following-sibling:: td[1]");
By CompoffCount=By.xpath("//tr[@id='ctl00_cphMain_CORequest']/td[2]/following-sibling:: td[1]");




public void getUsername() throws Exception
{
try {
	
	actualResult=getText(name);
	System.out.println(actualResult);
	expectedResult="MANJUNATHA R";
	
	
} catch (Exception e) 
{
	throw new Exception(e.getLocalizedMessage());
}	
}
}

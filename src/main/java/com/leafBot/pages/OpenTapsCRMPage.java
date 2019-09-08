package com.leafBot.pages;


import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class OpenTapsCRMPage extends ProjectSpecificMethods{
	
	public OpenTapsCRMPage clearCurrentCompanyName()
	{
		driver.findElementById("updateLeadForm_companyName").clear();
		return this;
	}
	
	public OpenTapsCRMPage enterNewCompanyName()
	{
		driver.findElementById("updateLeadForm_companyName").sendKeys("Leaftaps");
		return this;
	}
	
	public ViewLeadPage clickUpdateButton()
	{
		driver.findElementByClassName("smallSubmit").click();
		return new ViewLeadPage();
	}
}

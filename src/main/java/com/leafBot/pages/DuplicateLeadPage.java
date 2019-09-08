package com.leafBot.pages;


import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class DuplicateLeadPage extends ProjectSpecificMethods{
	
	public ViewLeadPage clickCreateLeadButton()
	{
		driver.findElementByClassName("smallSubmit").click();
		return new ViewLeadPage();
	}

}

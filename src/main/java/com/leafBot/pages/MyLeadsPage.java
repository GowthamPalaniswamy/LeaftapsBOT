package com.leafBot.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods{
	
	public MyLeadsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Create Lead") WebElement eleClickCreateLead;
	@FindBy(linkText="Find Leads") WebElement eleClickFindLeads;
	
	public CreateLeadPage clickCreateLead()
	{
		//driver.findElementByLinkText("Create Lead").click();
		click(eleClickCreateLead);
		return new CreateLeadPage();
	}
	
	public FindLeadsPage clickFindLeads()
	{
		//driver.findElementByLinkText("Find Leads").click();
		click(eleClickFindLeads);
		return new FindLeadsPage();
	}

}

package com.leafBot.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods{
	
	public ViewLeadPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="viewLead_firstName_sp") WebElement elegetfirstLeadname;
	
	public ViewLeadPage getfirstLeadname()
	{
		//String leadName = driver.findElementById("viewLead_firstName_sp").getText();
		String leadName = getElementText(elegetfirstLeadname);
		System.out.println("Lead Name : "+leadName+" created Successfully");
		return this;
	}
	
	public DuplicateLeadPage clickDupicateleadButton()
	{
		driver.findElementByLinkText("Duplicate Lead").click();
		return new DuplicateLeadPage();
	}
	
	public ViewLeadPage getDuplicateLeadName()
	{
		String duplicateLeadName = driver.findElementById("viewLead_firstName_sp").getText();
		System.out.println("Duplicate lead name : "+duplicateLeadName);
		return this;
	}
	
	public ViewLeadPage getCurrentCompanyName()
	{
		String oldCompanyName = driver.findElementById("viewLead_companyName_sp").getText();
		System.out.println("Current company name: "+oldCompanyName);
		return this;
	}
	
	public OpenTapsCRMPage clickEditButton()
	{
		driver.findElementByLinkText("Edit").click();
		return new OpenTapsCRMPage();
	}
	
	public ViewLeadPage getUpdatedCompanyName()
	{
		String newCompanyName = driver.findElementById("viewLead_companyName_sp").getText();
		System.out.println("Updated Comapany Name :"+newCompanyName);
		return this;
	}
	
	public MyLeadsPage clickDeleteButton()
	{
		driver.findElementByClassName("subMenuButtonDangerous").click();
		return new MyLeadsPage();
	}
}

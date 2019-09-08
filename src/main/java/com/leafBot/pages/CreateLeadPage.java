package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods{
	
	public CreateLeadPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="createLeadForm_companyName") WebElement eleEnterCompanyname;
	@FindBy(id="createLeadForm_firstName") WebElement eleEnterFirstName;
	@FindBy(id="createLeadForm_lastName") WebElement eleEnterLastname;
	@FindBy(id="createLeadForm_primaryPhoneNumber") WebElement eleEnterPhoneNumber;
	@FindBy(id="createLeadForm_primaryEmail") WebElement eleEnterMailId;
	@FindBy(className="smallSubmit") WebElement eleClickCreateLeadButton;
	
	public CreateLeadPage enterCompanyname()
	{
		//driver.findElementById("createLeadForm_companyName").sendKeys("Infosys");
		clearAndType(eleEnterCompanyname, "Infosys");
		return this;
	}
	
	public CreateLeadPage enterFirstName()
	{
		//driver.findElementById("createLeadForm_firstName").sendKeys("Gowtham");
		clearAndType(eleEnterFirstName, "Gowtham");
		return this;
	}
	
	public CreateLeadPage enterLastname()
	{
		//driver.findElementById("createLeadForm_lastName").sendKeys("Palaniswamy");
		clearAndType(eleEnterLastname, "Palaniswamy");
		return this;
	}
	
	public CreateLeadPage enterPhoneNumber()
	{
		//driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("6012345678");
		clearAndType(eleEnterPhoneNumber, "6012345678");
		return this;
	}
	
	public CreateLeadPage enterMailId()
	{
		//driver.findElementById("createLeadForm_primaryEmail").sendKeys("pg@gmail.com");
		clearAndType(eleEnterMailId, "pg@gmail.com");
		return this;
	}
	
	public ViewLeadPage clickCreateLeadButton()
	{
		//driver.findElementByClassName("smallSubmit").click();
		click(eleClickCreateLeadButton);
		return new ViewLeadPage();
	}
	
}

package com.leafBot.pages;


import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class FindLeadsPage extends ProjectSpecificMethods{
	
	public FindLeadsPage clickEmail()
	{
		driver.findElementByXPath("//span[text()='Email']").click();
		return this;
	}
	
	public FindLeadsPage clickPhoneNumber()
	{
		driver.findElementByXPath("//span[text()='Phone']").click();
		return this;
	}
	
	public FindLeadsPage enterEmailAddress()
	{
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("pg@gmail.com");
		return this;
	}
	
	public FindLeadsPage enterPhoneNumber()
	{
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("6012345678");
		return this;
	}
	
	public FindLeadsPage clickFindLeads() throws InterruptedException
	{
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(5000);
		return this;
	}
	
	public FindLeadsPage getFirstLeadID()
	{
		String firstID = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText();
		System.out.println("First Lead ID : "+firstID);
		return this;
	}
	
	public FindLeadsPage getFirstLeadName()
	{
		String leadName = driver.findElementByXPath("((//td[@class='x-grid3-col x-grid3-cell x-grid3-td-firstName '])//a)[1]").getText();
		System.out.println("Lead name : "+leadName);
		return this;
	}
	
	public ViewLeadPage clickFirstLeadID()
	{
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		return new ViewLeadPage();
	}
	
	public FindLeadsPage enterFirstName()
	{
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Gowtham");
		return this;
	}

}

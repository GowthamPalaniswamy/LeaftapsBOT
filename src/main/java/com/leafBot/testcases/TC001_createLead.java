package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.CreateLeadPage;
import com.leafBot.pages.HomePage;
import com.leafBot.pages.LoginPage;
import com.leafBot.pages.MyHomePage;
import com.leafBot.pages.MyLeadsPage;
import com.leafBot.pages.ViewLeadPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;


public class TC001_createLead extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setData()
	{
		testcaseName="Create Lead";
		testcaseDec="To create a lead and verify whether it is successfully created";
		author="Gowtham";
		category="Regression Testing";
	}
	
	
	@Test
	public void runTC001() throws InterruptedException {
		new LoginPage()
		.enterUserName()
		.enterPassword()
		.clickLogin()
		.clickCRMSFALink()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyname()
		.enterFirstName()
		.enterLastname()
		.enterPhoneNumber()
		.enterMailId()
		.clickCreateLeadButton()
		.getfirstLeadname();
		
		
	}

}

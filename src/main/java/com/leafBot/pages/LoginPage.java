package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username") WebElement eleUserName;
	@FindBy(id="password") WebElement elePassword;
	@FindBy(className="decorativeSubmit") WebElement eleLogin;
	public LoginPage enterUserName()
	{
		//driver.findElementById("username").sendKeys("DemoSalesManager");
		clearAndType(eleUserName, "DemoSalesManager");
		return this;
	}
	
	public LoginPage enterPassword()
	{
		//driver.findElementById("password").sendKeys("crmsfa");
		clearAndType(elePassword, "crmsfa");
		return this;
	}
	
	public HomePage clickLogin()
	{
		//driver.findElementByClassName("decorativeSubmit").click();
		click(eleLogin);
		return new HomePage();
	}
}

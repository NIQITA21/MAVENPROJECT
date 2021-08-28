package com.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement usernametextfld;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement pwdtextfld;
	
	@FindBy(xpath="//input[@id='submitButton']")
	private WebElement loginbtn;
	
	

	public WebElement getUsernametextfld() {
		return usernametextfld;
	}

	public WebElement getPwdtextfld() {
		return pwdtextfld;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	
	public void login(String un,String password)//business libraries
	{
		getUsernametextfld().sendKeys(un);
		getPwdtextfld().sendKeys(password);
		getLoginbtn().click();
	}
	
	

	
	
}

package com.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateorganizationPage {

	public CreateorganizationPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement Createorgbutton;
	
	@FindBy(xpath="//img[@language='javascript']")
	private WebElement Memberofplusicon;
	
	@FindBy(xpath="//select[@name='industry']")
	private WebElement industryDD;
	
	@FindBy(xpath="//select[@name='accounttype']")
	private WebElement TypeDD;
	
	@FindBy(xpath="//select[@name='rating']")
	private WebElement RatingDD;
	
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
	private WebElement Savebtn;

	public WebElement getCreateorgbutton() {
		return Createorgbutton;
	}

	public WebElement getMemberofplusicon() {
		return Memberofplusicon;
	}

	public WebElement getIndustryDD() {
		return industryDD;
	}

	public WebElement getTypeDD() {
		return TypeDD;
	}

	public WebElement getRatingDD() {
		return RatingDD;
	}

	public WebElement getSavebtn() {
		return Savebtn;
	}
	
	public void Createorg()
	{
		getCreateorgbutton().click();
		getMemberofplusicon().click();
		getIndustryDD().click();
		getTypeDD().click();
		getRatingDD().click();	
	}
}

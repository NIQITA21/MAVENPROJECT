package com.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.Webdriver_utility;

public class HomePage {
	 WebDriver driver;
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[.='Organizations']")
	private WebElement Organizationbtn;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement Signoutlogo;
	
	@FindBy(xpath="//a[.='Sign Out']")
	private WebElement Signout;
	

	@FindBy(xpath="//a[.='More']")
	private WebElement Morelink;
	
	@FindBy(xpath="//a[.='Purchase Order']")
	private WebElement Purchaselink;
	
	public WebElement getOrganizationbtn() {
		return Organizationbtn;
		
		
	}

	public WebElement getSignoutlogo() {
		return Signoutlogo;
	}

	public WebElement getMorelink() {
		return Morelink;
	}

	public WebElement getPurchaselink() {
		return Purchaselink;
	}

	public WebElement getSignout() {
		return Signout;
	}
     
	public void Homepagegeneric()
	{
		getOrganizationbtn().click();
		
	}
	
	public void Signout(WebDriver driver) throws InterruptedException
	{
		Webdriver_utility wb=new Webdriver_utility();
		Thread.sleep(2000);
	    wb.movetoelement(driver,Signoutlogo);
	    Thread.sleep(2000);
	    Signout.click();
		
	}
	public void HomepagePurchase(WebDriver driver) throws InterruptedException
	{
		Webdriver_utility wb=new Webdriver_utility();
		wb.movetoelement(driver, getMorelink());
		Thread.sleep(2000);
		getPurchaselink().click();
		
	}
	
	
}

package com.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Vendornamebrowser {

	@FindBy(xpath="//a[.='MRF TYRES']")
	private WebElement Vendorname;
	
	public Vendornamebrowser(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getVendorname() {
		return Vendorname;
	}
	
	public void Vendorname()
	{
		Vendorname.click();
	}
	
}

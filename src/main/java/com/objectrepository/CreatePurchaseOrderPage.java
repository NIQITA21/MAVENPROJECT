package com.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.Webdriver_utility;

public class CreatePurchaseOrderPage {
	WebDriver driver;
	Webdriver_utility wb=new Webdriver_utility();

	public CreatePurchaseOrderPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@name='subject']")
	private WebElement Subject;
	
	@FindBy(xpath="//select[@name='postatus']")
	private WebElement StatusDD;
	
	@FindBy(xpath="(//td[@class='dvtCellInfo']//textarea)[1]")
	private WebElement BillingAddress;
	
	@FindBy(xpath="(//td[@class='dvtCellInfo']//textarea)[2]")
	private WebElement ShippingAddress;
	
	@FindBy(xpath="//input[@id='qty1']")
	private WebElement Qty;
	
	@FindBy(xpath="//img[@src='themes/softed/images/select.gif']")
	private WebElement Vendornameplussign;
	
	@FindBy(xpath="(//img[@src='themes/softed/images/select.gif'])[2]")
	private WebElement Contactnameplussign;
	
	@FindBy(xpath="//img[@id='searchIcon1']")
	private WebElement Itemadditionicon;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement Savebtn;
	
	@FindBy(xpath="//input[@value='Add Service']")
	private WebElement AddServicebtn;
	

	@FindBy(xpath="//inpt[@value='Add Product']")
	private WebElement Addproductbtn;


	@FindBy(xpath="//img[@id='searchIcon2']")
	private WebElement Serviceicon1;
		
	@FindBy(xpath="(//img[@src='themes/images/up_layout.gif'])[1]")
	private WebElement Upwardarrow;
	
	public WebElement getListprice() {
		return Listprice;
	}


	@FindBy(xpath="(//img[@src='themes/images/down_layout.gif'])[1]")
	private WebElement Downwardarrow;
	
	
	@FindBy(xpath="//input[@id='listPrice1']")
	private WebElement Listprice;
	
	public WebElement getQty() {
		return Qty;
	}

	public WebElement getUpwardarrow() {
		return Upwardarrow;
	}

	public WebElement getDownwardarrow() {
		return Downwardarrow;
	}
	
	public WebDriver getDriver() {
		return driver;
	}

	public Webdriver_utility getWb() {
		return wb;
	}

	public WebElement getSubject() {
		return Subject;
	}

	public WebElement getStatusDD() {
		return StatusDD;
	}

	public WebElement getBillingAddress() {
		return BillingAddress;
	}

	public WebElement getShippingAddress() {
		return ShippingAddress;
	}

	public WebElement getVendornameplussign() {
		return Vendornameplussign;
	}

	public WebElement getContactnameplussign() {
		return Contactnameplussign;
	}

	public WebElement getItemadditionicon() {
		return Itemadditionicon;
	}

	public WebElement getSavebtn() {
		return Savebtn;
	}

	public WebElement getAddServicebtn() {
		return AddServicebtn;
	}

	public WebElement getAddproductbtn() {
		return Addproductbtn;
	}

	
	public WebElement getServiceicon1() {
		return Serviceicon1;
	}


	public  void StatusDD()
	{
		wb.selectdropdown(StatusDD, 2);
	}

}

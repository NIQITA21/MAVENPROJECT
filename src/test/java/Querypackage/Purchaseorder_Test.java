package Querypackage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.objectrepository.CreatePurchaseOrderPage;
import com.objectrepository.CreateorganizationPage;
import com.objectrepository.HomePage;
import com.objectrepository.PurchaseOrderPage;

import Generic.Base_class;
import Generic.Java_utility;
import Generic.Webdriver_utility;

public class Purchaseorder_Test extends Base_class{

	@Test(groups={"Smoketest"})
	public void purchaseorder() throws InterruptedException
	{
		HomePage hp=new HomePage(driver);
		hp.HomepagePurchase(driver);

		PurchaseOrderPage pg=new PurchaseOrderPage(driver);
		pg.getPlusicon().click();

		Webdriver_utility wb=new Webdriver_utility();
		CreatePurchaseOrderPage cp=new CreatePurchaseOrderPage(driver);
		cp.getSubject().sendKeys("purchase order of  alloy wheels");
		cp.getVendornameplussign().click();
		wb.switchwindow(driver,"Vendors");
		driver.findElement(By.xpath("//a[.='MRF TYRES']")).click();
		wb.switchwindow(driver, "PurchaseOrder");
		cp.getBillingAddress().sendKeys("5D-61");
		cp.getShippingAddress().sendKeys("45f,abc nagar");
		cp.getItemadditionicon().click();
		wb.switchwindow(driver, "Products");
		driver.findElement(By.xpath("//a[.='Alloy Wheels']")).click();
		wb.switchwindow(driver,"PurchaseOrder");
		cp.getQty().sendKeys("3");
		cp.getSavebtn().click();
		Thread.sleep(3000);

	}

	@Test(groups="RegressionTest")
	public void createorganisation() throws InterruptedException
	{    HomePage hp=new HomePage(driver);
		CreateorganizationPage crp=new CreateorganizationPage(driver);
		hp.Homepagegeneric();
		
		crp.getCreateorgbutton().click();
		
		Java_utility ju=new Java_utility();
		String orgname = "Saphire"+ju.Ran_data();
		System.out.println(orgname);
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(orgname);
//		driver.findElement(By.xpath("//input[@name='employees']")).sendKeys("nikita");
//		driver.findElement(By.xpath("//input[@name='email2']")).sendKeys("abc@gmail.com");
//		driver.findElement(By.xpath("//input[@name='website']")).sendKeys("www.sapphire.in");
//		crp.getMemberofplusicon().click();
//		Set<String> id = driver.getWindowHandles();
//	    for(String we:id)
//	    {
//	 	  String title = driver.switchTo().window(we).getTitle();
//	 	  if(title.contains("Accounts"))
//	 	  {
//	 		  break;
//	 	  }
//	    }
//		
//		driver.findElement(By.xpath("//a[.='sellow491']")).click();
//		
//		Alert a=driver.switchTo().alert();
//		String ale = a.getText();
//		System.out.println(ale);
//		a.accept();
//		String ele = driver.getWindowHandle();
//		System.out.println(ele);
//		driver.switchTo().window(ele);
//		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9999934343");
//		driver.findElement(By.xpath("//input[@name='fax']")).sendKeys("88788");
//		
//		driver.findElement(By.xpath("//input[@name='otherphone']")).sendKeys("9879879191");
//		driver.findElement(By.xpath("//input[@name='email1']")).sendKeys("xyz@gmail.com");
//
//		driver.findElement(By.xpath("//input[@name='ownership']")).sendKeys("world");
//		Thread.sleep(1000);
//		
//		driver.findElement(By.xpath("//input[@name='siccode']")).sendKeys("56998");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@name='annual_revenue']")).sendKeys("4million");
//		Thread.sleep(1000);
		crp.getSavebtn().click();
		Thread.sleep(3000);
	}
}


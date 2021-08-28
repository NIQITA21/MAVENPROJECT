package AssignmentVtiger;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.objectrepository.CreatePurchaseOrderPage;
import com.objectrepository.HomePage;
import com.objectrepository.Loginpage;
import com.objectrepository.PurchaseOrderPage;

import Generic.Framework_constants;
import Generic.PropertyFileUtility;
import Generic.Webdriver_utility;

public class TC_15_Purchase {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver= new ChromeDriver();
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		PropertyFileUtility g1 = new PropertyFileUtility();
		
		Loginpage lp=new Loginpage(driver);
		String UN = g1.Readfromprop("un", Framework_constants.Propertyfilepath);
		String PWD = g1.Readfromprop("pwd",Framework_constants.Propertyfilepath);
		lp.login(UN,PWD);
		
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
		cp.getQty().sendKeys("3");
		cp.getListprice().sendKeys("4000");
		cp.getSavebtn().click();
		Alert a=driver.switchTo().alert();
		a.accept();
		hp.Signout(driver);
	}

}

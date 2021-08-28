package AssignmentVtiger;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

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


public class TC10_PURCHASE  {
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
		cp.getAddServicebtn().click();
	    cp.getServiceicon1().click();
		wb.switchwindow(driver, "Services");
		driver.findElement(By.xpath("//a[.='Wheels service']")).click();
	    wb.switchwindow(driver,"PurchaseOrder");
		cp.getUpwardarrow().click();
		
		
}
}

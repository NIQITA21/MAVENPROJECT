package Querypackage;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.objectrepository.CreateorganizationPage;
import com.objectrepository.HomePage;
import com.objectrepository.Loginpage;

import Generic.PropertyFileUtility;

public class Assignment1 extends PropertyFileUtility {
public static void main(String[] args) throws InterruptedException, IOException {
	WebDriver driver= new FirefoxDriver();
	driver.get("http://localhost:8888/index.php?action=Login&module=Users");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	
	PropertyFileUtility g1 = new PropertyFileUtility();
	
	Loginpage lp=new Loginpage(driver);
	String UN = g1.Readfromprop("un", Propertyfilepath);
	String PWD = g1.Readfromprop("pwd", Propertyfilepath);
	lp.login(UN,PWD);
	
	HomePage hp=new HomePage(driver);
	hp.getOrganizationbtn().click();
	
//	driver.findElement(By.xpath("//input[@type='text']")).sendKeys(g1.Readfromprop("un"));
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//input[@id='submitButton']")).click();

//	driver.findElement(By.xpath("//a[.='Organizations']")).click();
	
	CreateorganizationPage crp=new CreateorganizationPage(driver);
	crp.getCreateorgbutton().click();
	
//	driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("sapphire");
	driver.findElement(By.xpath("//input[@name='employees']")).sendKeys("nikita");
	driver.findElement(By.xpath("//input[@name='email2']")).sendKeys("abc@gmail.com");
	driver.findElement(By.xpath("//input[@name='website']")).sendKeys("www.sapphire.in");
	crp.getMemberofplusicon().click();
	Set<String> id = driver.getWindowHandles();
    for(String we:id)
    {
 	  String title = driver.switchTo().window(we).getTitle();
 	  if(title.contains("Accounts"))
 	  {
 		  break;
 	  }
    }
	
	driver.findElement(By.xpath("//a[.='sellow491']")).click();
	
	Alert a=driver.switchTo().alert();
	String ale = a.getText();
	System.out.println(ale);
	a.accept();
	String ele = driver.getWindowHandle();
	System.out.println(ele);
	driver.switchTo().window(ele);
	driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9999934343");
	driver.findElement(By.xpath("//input[@name='fax']")).sendKeys("88788");
	
	driver.findElement(By.xpath("//input[@name='otherphone']")).sendKeys("9879879191");
	driver.findElement(By.xpath("//input[@name='email1']")).sendKeys("xyz@gmail.com");

	driver.findElement(By.xpath("//input[@name='ownership']")).sendKeys("world");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//input[@name='siccode']")).sendKeys("56998");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@name='annual_revenue']")).sendKeys("4million");
	Thread.sleep(1000);
	Thread.sleep(1000);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	for(int i=0;i<=2;i++){
	js.executeScript("window.scrollBy(0,500)");
	Thread.sleep(1000);
	}
	Thread.sleep(1000);
	crp.getSavebtn().click();
	hp.getSignout().click();
//    driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
	

	

	

	

	

	

	
	
}
}

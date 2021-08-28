package Querypackage;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.dom4j.DocumentException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Generic.Framework_constants;
import Generic.XMLFileUtility;

public class Assignment3 extends XMLFileUtility{
	public static void main(String[] args) throws InterruptedException, DocumentException {
				WebDriver driver= new ChromeDriver();
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		XMLFileUtility xml=new XMLFileUtility();
		
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(xml.readxml(Framework_constants.XMLPath));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();

		driver.findElement(By.xpath("//a[.='Organizations']")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("selloow");
		driver.findElement(By.xpath("//img[@language='javascript']")).click();
		driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
//		String parentid = driver.getWindowHandle();
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
		
		
		
		

}
}
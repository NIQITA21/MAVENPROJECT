package Querypackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.objectrepository.Loginpage;

import Generic.Framework_constants;
import Generic.PropertyFileUtility;

public class Vtiger_ToolTip {
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
		WebElement tooltip = driver.findElement(By.xpath("//img[@title='Open Calendar...']"));
		String textoftooltip = tooltip.getAttribute("title");
		System.out.println(textoftooltip);
        driver.close();
}
}

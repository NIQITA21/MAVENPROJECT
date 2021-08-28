package Querypackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Generic.Framework_constants;
import Generic.JSONFileUtility;
import Generic.Java_utility;

public class Assignment2 extends JSONFileUtility {
	public static void main(String[] args) throws InterruptedException, IOException, ParseException {
		WebDriver driver= new ChromeDriver();
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		JSONFileUtility json=new JSONFileUtility();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(json.readfrom_json("username",Framework_constants.JSONPath));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();

		driver.findElement(By.xpath("//a[.='Organizations']")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		Thread.sleep(2000);
		
		Java_utility r1=new Java_utility();
		int Randomnum = r1.Ran_data();
		String orgname = "sellow"+Randomnum;
		System.out.println(orgname);
		
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(orgname);
		WebElement ele = driver.findElement(By.xpath("//select[@name='industry']"));
		Select s=new Select(ele);
		s.selectByIndex(3);
	   WebElement drop = driver.findElement(By.xpath("//select[@name='accounttype']"));
	   Select s1=new Select(drop);
	   s1.selectByIndex(2);
	   WebElement d = driver.findElement(By.xpath("//select[@name='rating']"));
	   Select s2=new Select(d);
	   s2.selectByIndex(1);
	   driver.findElement(By.xpath("//input[@value='  Save  ']")).click();

	   

		
		

}
}

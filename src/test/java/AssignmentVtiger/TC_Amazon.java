package AssignmentVtiger;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Amazon {
	public static void main(String[] args) throws InterruptedException, IOException {
		int expected=15000;
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles under 15000");
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		driver.findElement(By.xpath("//span[.='Redmi']")).click();
		driver.findElement(By.xpath("//span[.='Featured']")).click();
		driver.findElement(By.xpath("//a[.='Price: High to Low']")).click();
		List<WebElement> list = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		String price = list.get(1).getText();
		System.out.println(price);
		StringBuffer string=new StringBuffer(price);
		string.deleteCharAt(2);
		System.out.println(string);
		String pricestring=new String(string);
		
//		int length = price.length();
//		System.out.println(length);
		int priceint=Integer.parseInt(pricestring);
		if(priceint<expected)
		{
		     System.out.println("tc pass");
		}
driver.close();
	}
}
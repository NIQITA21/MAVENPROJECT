package Querypackage;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Booksassignment {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("smokes and whiskey");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(1000); 
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		for(int i=0;i<=2;i++)
		{
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(1000);
		}
		
		driver.findElement(By.xpath("//span[.='Smokes And Whiskey']")).click();
		Set<String> browsers = driver.getWindowHandles();
		ArrayList<String> l = new ArrayList<String>(browsers);
		int z = l.size();
		System.out.println(z);
		String wh = l.get(1);
	    driver.switchTo().window(wh);
		String text = driver.findElement(By.xpath("(//span[@class='a-color-base'])[2]")).getText();
		System.out.println(text);
	    driver.close();
		
		
}
}
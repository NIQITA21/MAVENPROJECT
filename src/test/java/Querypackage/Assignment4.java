package Querypackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		driver.findElement(By.xpath("//a[.='Contacts']")).click();
		driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("NIkita");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Tewari");
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		for(int i=0;i<=2;i++){
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		}
		 WebElement h = driver.findElement(By.xpath("//input[@name='imagename']"));
          h.sendKeys("C:\\Users\\NIKITA\\screenshot\\amazon.jpeg");
		

		

	}
}

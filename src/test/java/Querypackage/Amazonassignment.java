package Querypackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Amazonassignment {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbo")).sendKeys("headphones");
		Thread.sleep(1000);
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='s-suggestion']"));
		int y = ele.size();
		System.out.println(y);
		for(WebElement wh:ele)
		{
			String f = wh.getText();
			System.out.println(f);
		}



	}

}

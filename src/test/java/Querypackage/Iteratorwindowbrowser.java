package Querypackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iteratorwindowbrowser {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
		
		Set<String> allwh=driver.getWindowHandles();
		System.out.println(allwh.size());
		
		Iterator<String> wh = allwh.iterator();
		
		while(wh.hasNext())
		{
			String window = wh.next();
			System.out.println(driver.switchTo().window(window).getTitle());
			if(driver.getTitle().equals("Tech Mahindra"))
			{
			driver.close();
			}
		}
}
}
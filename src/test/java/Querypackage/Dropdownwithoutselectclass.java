package Querypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdownwithoutselectclass {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.findElement(By.xpath("//a[.='Select Product Type']")).click();
		List<WebElement> l1 = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
		int size = l1.size();
		System.out.println(size);
		
		for(int i=0;i<size;i++)
		{
		   l1.get(3).click();
		 WebElement ele = driver.findElement(By.xpath("//a[.='Select Product']"));
		ele.click();
		List<WebElement> hw = driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li"));
		int a = hw.size();
		System.out.println(a);
		for(int j=0;j<=hw.size();j++)
		{     
			String d = hw.get(j).getText();
			System.out.println(d);
			hw.get(1).click();
			break;
		}
		 String t1 = l1.get(i).getText();
		    System.out.println(t1); 

		}
	}
}


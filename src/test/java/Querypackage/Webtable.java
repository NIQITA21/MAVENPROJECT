package Querypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_table_intro");
	driver.switchTo().frame("iframeResult");
	List<WebElement> list = driver.findElements(By.xpath("//table/tbody/tr[*]"));
	int size = list.size();
	System.out.println(size);
	
	for(int i=2;i<size;i++)
	{
		for(int j=1;j<3;j++)
		{
			System.out.println(""+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]")).getText()+"");
		}
		System.out.println();
	}
}
}

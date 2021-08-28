package Querypackage;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MMT extends Dataprovider {
	@Test(dataProvider="getvalues")
	 public  void selectcities(String src,String dest) throws InterruptedException {
	  Date dateobj = new  Date();


	  // Wed Aug 04 16:39:01 IST 2021
	  //  0     1     2     3            4      5

	  // Wed Aug 04 2021

	  String currentdate = dateobj.toString();

	  String[] arr = currentdate.split(" ");

	  String day = arr[0];
	  String month = arr[1];
	  String todaysdate = arr[2];
	  String year=arr[5];

	  String MMT_DAte= day+" "+month+" "+todaysdate+" "+year; 

	  System.out.println(MMT_DAte);

	  WebDriver driver = new ChromeDriver();

	  driver.get("https://www.makemytrip.com/");

	  driver.manage().window().maximize();

	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	  Actions action = new Actions(driver);
	  action.moveByOffset(10, 10).click().perform();

	  driver.findElement(By.id("fromCity")).sendKeys(src);
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//div[text()='"+src+"']")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.id("toCity")).sendKeys(dest);
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//div[text()='"+dest+"']")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
	  Thread.sleep(1000);
	  int count =0;
	  
	  while(count<=11) {
	   try {
	    driver.findElement(By.xpath("//div[@aria-label='Mon Nov 08 2021']")).click();
	    break;
	   } 
	   catch (Exception e) 
	   {
	    driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
	    count++;
	   }
	  }
	  //  driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
	  //  Thread.sleep(1000);
	  //  driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
	  //  Thread.sleep(1000);

	 }

	}


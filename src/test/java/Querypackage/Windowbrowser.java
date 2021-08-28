package Querypackage;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowbrowser {
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.naukri.com/");
			Thread.sleep(2000);
//			String parent_id=driver.getWindowHandle();
			Set<String> allwh=driver.getWindowHandles();
			for(String we : allwh)
			{
				driver.switchTo().window(we);
				String title=driver.getTitle();
				System.out.println(title);
			    if(title.equals("Tech Mahindra"))
			    {
			    	driver.switchTo().window("Tech Mahindra");
			    }
			    driver.close();
			}

	}
	}


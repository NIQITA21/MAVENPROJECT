package Generic;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Webdriver_utility {

	/**
	 * This method is going to selectdropdown by using value
	 * @param element
	 * @param value
	 */

	public void selectdropdown(WebElement element,String value)
	{
		Select s=new Select(element);
		s.selectByValue(value);
	}

	/**
	 * This method is going to select the dropdown by index
	 * @param element
	 * @param index
	 */
	public void selectdropdown(WebElement element,int index)
	{
		Select s=new Select(element);
		s.selectByIndex(index);
	}

	/**
	 * This method is going to select the dropdown by using address of element
	 * @param text
	 * @param element
	 */

	public void selectdropdown(String text,WebElement element)
	{
		Select s=new Select(element);
		s.selectByVisibleText(text);
	}

	/**
	 * This method is used to switch to frame by using index
	 * @param driver
	 * @param index
	 */
	public void switchframe(WebDriver driver,int index)
	{
		driver.switchTo().frame(index);
	}
	/**
	 * This method is used to switch to frame by using id
	 * @param driver
	 * @param id
	 */

	public void switchframe(WebDriver driver,String id)

	{
		driver.switchTo().frame(id);
	}
	/**
	 * This method is used to switch to frame by using element address
	 * @param driver
	 * @param element
	 */
	public void switchframe(WebDriver driver,WebElement element)
	{
		driver.switchTo().frame(element);
	}

	/**
	 * This method is used to switch to particular window based on title
	 * @param driver
	 * @param title
	 */
	public void switchwindow(WebDriver driver,String title )

	{
		Set<String> window = driver.getWindowHandles();
		Iterator<String> windows = window.iterator();

		while(windows.hasNext())
		{
			String abc = windows.next();
			String currenttitle = driver.switchTo().window(abc).getTitle();
			if( currenttitle.contains(title))
			{
				break;
			}

		}
	}


	/** 
	 * This method is used to mouse hover to element
	 * @param driver
	 * @param element
	 */
	public void	movetoelement(WebDriver driver,WebElement element)

	{
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}


	/**
	 * This method is used to perform right click action
	 * @param driver
	 * @param element
	 */
	public void rightclick(WebDriver driver,WebElement element)

	{
		Actions act=new Actions(driver);
		act.contextClick(element).perform();
	}
	/**
	 * This method is used to perform drag and drop action
	 * @param driver
	 * @param element
	 * @param source
	 * @param target
	 */
	public void draganddrop(WebDriver driver,WebElement element, WebElement source,WebElement target)
	{
		Actions act=new Actions(driver);
		act.dragAndDrop(source, target).perform();
	}
	/**
	 * This method is used to double click
	 * @param driver
	 * @param element
	 */
	public void doubleclick(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.doubleClick(element).perform();

	}
	/** 
	 * This method is used for wait for only findelements and findelement 
	 * @param driver
	 */
	public void implicitwait(WebDriver driver )

	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	/**
	 * This method is used to perform explicitwait by using title
	 * @param driver
	 * @param title
	 */
	public void explicitwait(WebDriver driver,String title)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.titleContains(title));
	}


}

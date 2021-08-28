package Generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


import com.objectrepository.HomePage;
import com.objectrepository.Loginpage;


public class Base_class {

	public WebDriver driver;
	Webdriver_utility wb=new Webdriver_utility();
	PropertyFileUtility g1 = new PropertyFileUtility();
	public static  WebDriver staticdriver;

	@Parameters("BROWSER")
	@BeforeClass(groups={"RegressionTest","SmokeTest"})
	public void launchbrowser(String BROWSER) throws IOException
	{  
		//				String browser=g1.Readfromprop("Browser", Framework_constants.Propertyfilepath);
		if(BROWSER.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("Firefox")){
			driver=new FirefoxDriver();
		}
		driver.get(g1.Readfromprop("url", Framework_constants.Propertyfilepath));
		driver.manage().window().maximize();
		wb.implicitwait(driver);
		staticdriver=driver;
	}
	@BeforeMethod(groups={"RegressionTest","SmokeTest"})
	public void Login() throws IOException
	{    
		Loginpage lp=new Loginpage(driver);
		String UN = g1.Readfromprop("un", Framework_constants.Propertyfilepath);
		String PWD = g1.Readfromprop("pwd",Framework_constants.Propertyfilepath);
		lp.login(UN,PWD);

	}

	@AfterMethod(groups={"RegressionTest","SmokeTest"})
	public void logout() throws InterruptedException
	{
		HomePage hp=new HomePage(driver);
		hp.Signout(driver);
	}

	@AfterClass(groups={"RegressionTest","SmokeTest"})
	public void closebrowser()
	{

		driver.close();
	}
	public static String getScreenshot(String name) throws IOException{;

	File src=((TakesScreenshot)staticdriver).getScreenshotAs(OutputType.FILE);
	String destfile=System.getProperty("user.dir")+"/Screenshots/"+name+".png";
	File dst = new File(destfile);
	FileUtils.copyFile(src, dst);
	return destfile;
	}

}

package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extentreports {

	
WebDriver driver=new ChromeDriver();
ExtentTest test;
ExtentHtmlReporter reporter;
ExtentReports reports;



  @BeforeSuite
  public void setup()
{
	reporter=new ExtentHtmlReporter(Framework_constants.Extentreportpath+".html");
	reporter.config().setDocumentTitle("SDET_21");
	reporter.config().setTheme(Theme.DARK);
	reporter.config().setReportName("SmokeTC");
	
	reports=new ExtentReports();
	 reports.attachReporter(reporter);
	 
	 reports.setSystemInfo("BUILDNO", "1.1");
	 reports.setSystemInfo("envi", "QA");
	 reports.setSystemInfo("platform","windows");
	 
} 
	 @Test
	 public void test11()
	 {
		 test=reports.createTest("test1");
		 driver.get("https://www.facebook.com/");
		 System.out.println(driver.getTitle());
	 }
	 
	 @AfterSuite
	 public void close(){
		 reports.flush();
	 }
	
}

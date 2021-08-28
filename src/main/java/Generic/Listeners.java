package Generic;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Listeners implements ITestListener{
	ExtentHtmlReporter reporter;
	ExtentReports reports;
	ExtentTest test;
	public void onTestStart(ITestResult result) {
		test = reports.createTest(result.getMethod().getMethodName());//to create entries for all @test annotations

	}
	// TODO Auto-generated method stub

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS,result.getMethod().getMethodName()+"is PASSED");
		// TODO Auto-generated method stub
	}	

	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, result.getName()+" is failed");//will get  the name of method that failed
		test.log(Status.FAIL, result.getThrowable());// will print the error in report

		try {
			String path = Base_class.getScreenshot(result.getName());//path of error
			test.addScreenCaptureFromPath(path);//extent report method to take screenshot of the path where error is present
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
	}

	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, result.getMethod().getMethodName()+"Skipped");
		// TODO Auto-generated method stub
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onStart(ITestContext context) {
		Java_utility jv=new Java_utility();
		String date=jv.date();

		reporter=new ExtentHtmlReporter(Framework_constants.Extentreportpath+date+".html");
		reporter.config().setDocumentTitle("SDET_21");
		reporter.config().setTheme(Theme.DARK);
		reporter.config().setReportName("SmokeTC");

		reports=new ExtentReports();
		reports.attachReporter(reporter);

		reports.setSystemInfo("BUILDNO", "1.1");
		reports.setSystemInfo("envi", "QA");
		reports.setSystemInfo("platform","windows");
		reports.setSystemInfo("Repertername", "nikita");
		// TODO Auto-generated method stub
	}

	public void onFinish(ITestContext context) {
		reports.flush();
		// TODO Auto-generated method stub
	}

}

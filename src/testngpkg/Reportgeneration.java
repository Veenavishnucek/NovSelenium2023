package testngpkg;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reportgeneration {
	ChromeDriver driver;
	String baseurl= "https://www.facebook.com";
	ExtentHtmlReporter reporter;
	ExtentTest test;
	ExtentReports extent;
	
	@BeforeTest
	public void bfrtst()
	{
		reporter= new ExtentHtmlReporter("./reports/myreport1.html");
		reporter.config().setDocumentTitle("Automation report");
		reporter.config().setReportName("Functional Test");
		reporter.config().setTheme(Theme.DARK);
		
		extent= new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("hostname", "localhost");
		extent.setSystemInfo("os", "windows11");
		extent.setSystemInfo("Testername", "veena");
		extent.setSystemInfo("Browsername", "chrome");
        driver= new ChromeDriver();
	}
	
	@BeforeMethod
	public void bfrmthd()
	{
		driver.get(baseurl);
	}

	@Test
	public void fbtitleverification()
	{
		test= extent.createTest("fbtitleverification");
		String exp= "Facebook";
		String actual= driver.getTitle();
		Assert.assertEquals(actual,exp);
	}
	
	@AfterTest
	public void flush()
	{
		extent.flush();
	}
	
	@AfterMethod
	public void browserclose(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE )
		{
			
          test.log(Status.FAIL, "test case failed is"+result.getName());
          test.log(Status.FAIL, "test case failed is"+result.getThrowable());
		}
		else if(result.getStatus()==ITestResult.SKIP )
		{
	          test.log(Status.SKIP, "test case skipped is"+result.getName());
		}
		else if(result.getStatus()==ITestResult.SUCCESS )
		{
	          test.log(Status.PASS, "test case passed is"+result.getName());
		}

		
	}
}



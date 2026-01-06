package listner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class listner implements ITestListener {
public  ExtentReports report;
public ExtentTest test;
	@Override
	public void onTestStart(ITestResult result) {
		ExtentSparkReporter spark=new ExtentSparkReporter("C:\\Users\\ADMIN\\eclipse-workspace\\NINZACRMQSP\\src\\test\\resources\\extentreport\\ninzaqspReport.html");
		spark.config().setDocumentTitle("CRM");
		spark.config().setReportName("me");
		spark.config().setTheme(Theme.STANDARD);
		
		ExtentReports report=new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("BROWSER", "chrome");
		
		
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
		Reporter.log(result.getMethod().getMethodName()+"test case started",true);
	ExtentTest	test=report.createTest("result.getMethod().getMethodName()");
	test.log(Status.INFO, "method started");
	test.log(Status.INFO, "<button> text </button> ");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		Reporter.log(result.getMethod().getMethodName()+"test case success",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		Reporter.log(result.getMethod().getMethodName()+"test case failure",true);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
		Reporter.log(result.getMethod().getMethodName()+"test case skipped",true);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
		report.flush();
		
	}
	

	
	
	
	
	

}

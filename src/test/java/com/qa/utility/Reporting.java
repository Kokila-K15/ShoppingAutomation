package com.qa.utility;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporting extends TestListenerAdapter{

	public ExtentHtmlReporter htmlReporter;
	public ExtentReports exReports;
	public ExtentTest xTest;
	
	public void onStart(ITestContext testContext) {
		String DateStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String repName = "Test-Report-"+DateStamp+".html";
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/Reports/"+repName);
		exReports = new ExtentReports();
		
		exReports.attachReporter(htmlReporter);
		
		htmlReporter.config().setDocumentTitle("Test Automation");
		htmlReporter.config().setReportName("Functional Test Report");
		htmlReporter.config().setTheme(Theme.DARK);
		htmlReporter.config().setAutoCreateRelativePathMedia(true);
	}
	
	public void onFinish(ITestContext testContext) {
		
		exReports.flush();
	}
	
	public void onTestSuccess(ITestResult tr) {
		
		xTest = exReports.createTest(tr.getName());
		xTest.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));
		xTest.log(Status.PASS, "Test is Passed");
		
	}
	
    public void onTestFailure(ITestResult tr) {
		
		xTest = exReports.createTest(tr.getName());
		xTest.log(Status.FAIL, MarkupHelper.createLabel(tr.getName(), ExtentColor.RED));
		xTest.log(Status.FAIL, "Test is Failed");
		xTest.log(Status.FAIL, tr.getThrowable());
		String SSName=System.getProperty("user.dir")+"/Screenshots/"+tr.getName()+".png";
		
		File file = new File(SSName);
		
		if(file.exists()) {
			
			try {
				xTest.fail("Screenshot for the test failed is :" + xTest.addScreenCaptureFromPath(SSName));
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
    
    public void onTestSkipped(ITestResult tr) {
		
		xTest = exReports.createTest(tr.getName());
		xTest.log(Status.SKIP, MarkupHelper.createLabel(tr.getName(), ExtentColor.AMBER));
		xTest.log(Status.SKIP, "Test is Skipped");
		
	}
}

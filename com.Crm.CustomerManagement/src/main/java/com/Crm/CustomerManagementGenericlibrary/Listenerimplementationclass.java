package com.Crm.CustomerManagementGenericlibrary;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Listenerimplementationclass extends Baseclass implements ITestListener {
	ExtentReports report;
	ExtentTest test;
	@Override
	public void onTestStart(ITestResult result) {
		String name = result.getName();
		report.createTest(name);
		
	}
	@Override
	public void onTestSucess(ITestResult result) {
		String name = result.getName();
	test.log(Status.PASS,name+"....test passed");
	}
@Override
	public void onTestfailure(ITestResult result) {
	String name = result.getName();
		TakesScreenshot t=(TakesScreenshot)driver;
		File src=t.getScreenshotAs(OutputType.FILE);
		Javautality j=new Javautality();
	String dateandtime = j.getDateAndTime("dd-MM-yyyy   dd-mm-ss");
	File dest=new File("./Screenshots/"+name+" "+dateandtime+".png");
		//j.getDateAndTime("hh-mm-ss");
		try {
			Files.copy(src.toPath(), dest.toPath());
		} catch ( IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		test.log(Status.FAIL,name+"....test failed");
	}

//	@Override
//	public void onTestFailure(ITestResult result) {
//		// TODO Auto-generated method stub
//		ITestListener.super.onTestFailure(result);
//	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String name = result.getName();
		test.log(Status.SKIP,name+"....test skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		ExtentSparkReporter reporter=new ExtentSparkReporter("./Reports/excecutionReport.html");
		reporter.config().setDocumentTitle("vtiger");
		reporter.config().setReportName("vtiger execution report");
		reporter.config().setTheme(Theme.DARK);
		 report= new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("url", "http://localhost:8888/index.php?module=Accounts&action=index");
		report.setSystemInfo("os", "windows");
		report.setSystemInfo("Browser", "Edge");
		report.setSystemInfo("testengineer", "Sreedhar Valmiki");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush();
	}
	

}

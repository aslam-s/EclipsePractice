package com.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener {
	public ExtentSparkReporter sparkreporter;
	public ExtentReports extent;
	public ExtentTest test;

	public void onStart(ITestContext context) {
		sparkreporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/Reports/myreports.html"); // path
		sparkreporter.config().setDocumentTitle("Automation Report"); // title of report
		sparkreporter.config().setReportName("Functional testing");// name of report
		sparkreporter.config().setTheme(Theme.STANDARD); // Theme //dark

		extent = new ExtentReports();
		extent.attachReporter(sparkreporter);

		extent.setSystemInfo("computer name", "localhost");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Tester name", "Aslam");
		extent.setSystemInfo("OS", "Windows10");
		extent.setSystemInfo("Browser name", "Chrome");

	}

	public void onTestSuccess(ITestResult result) { // test passed
		test = extent.createTest(result.getName()); // create new entery in the report
		test.log(Status.PASS, "Test Case passed is :" + result.getName()); // update status pass/fail

	}

	public void onTestFailure(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.FAIL, "Test Case Failed is :" + result.getName());
		test.log(Status.FAIL, "Test Case Failed cause is :" + result.getThrowable());
	}

	public void onTestSkipped(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.SKIP, "Test Case skipped is :" + result.getName());
	}

	public void onFinish(ITestContext context) {
		extent.flush();
	}
}

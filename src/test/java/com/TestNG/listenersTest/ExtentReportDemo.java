package com.TestNG.listenersTest;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportDemo {
  @Test
  public void testReport()
  {
	  //create instance of ExtentReports class
	  ExtentReports extent=new ExtentReports();
	  
	  //add path to report
	  ExtentSparkReporter spark=new ExtentSparkReporter(System.getProperty("user.dir")+"//Reports//AutomationTestReport.html");
	  
	  //add configuration
	  
	  spark.config().setDocumentTitle("AutomationReport");
	  spark.config().setReportName("Sprint 1 Report for build1");
	  spark.config().setTheme(Theme.DARK);
	  
	  
	  //attached the report
	  extent.attachReporter(spark);
	  
	  //create test
	  ExtentTest test=extent.createTest("Test1");
	  
	  
	  //add log
	  test.log(Status.PASS, "Test Case is pass");
	  test.log(Status.FAIL, "Test Case is Fail");
	  test.log(Status.INFO, "Test Case information");
	  test.log(Status.WARNING, "Test Warning");
	  
	  //flush()
	  extent.flush();
	  
  }
}

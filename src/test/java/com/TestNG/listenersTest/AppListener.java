package com.TestNG.listenersTest;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class AppListener implements ITestListener
{

	
	public void onTestStart(ITestResult result)
	{
		System.out.println("OnTestStart() Listeners started on Test execution: "+result.getName());
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("onTestSuccess() executes on pass Test: "+result.getName());
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("onTestFailure() executes on Fail Test: "+result.getName());

	}
	
	
	
	
}

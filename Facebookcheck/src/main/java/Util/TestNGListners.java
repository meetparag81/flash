package Util;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListners extends BrowserFactory implements ITestListener 
{

	public void onFinish(ITestContext result) 
	{
		//System.out.println("Testcase started and details are"+ result.getName()
		
	}

	public void onStart(ITestContext result) 
	{
		//System.out.println("Testcase started and details are"+ result.getName()
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		//System.out.println("Testcase started and details are"+ result.getName()
		
	}

	public void onTestFailure(ITestResult result) 
	{
		//result.getName() will give me details of which testcase is failed
		 System.out.println("Testcase failed  is"+ result.getName());
		if(ITestResult.FAILURE ==result.getStatus() )
			Testutil.takescreenshot(driver, result.getName());
		
	}

	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("Testcase skipped  is"+ result.getName());
		if(ITestResult.FAILURE ==result.getStatus() )
			Testutil.takescreenshot(driver, result.getName());
		
	}

	public void onTestStart(ITestResult result) 
	{
		//System.out.println("Testcase started and details are"+ result.getName()
		
	}

	public void onTestSuccess(ITestResult result) 
	{
		//System.out.println("Testcase started and details are"+ result.getName()
		
	}
	



}

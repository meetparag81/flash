package Com_FB_QA_Util;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.TestResult;

import Com_FB_QA_Base.TestBase;

public class TestNGListners extends TestBase implements ITestListener
{

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) 
	{
		
		
	}

	public void onTestFailure(ITestResult result) 
	{
		if(TestResult.FAILURE==result.getStatus())
		{
			TestUtil.takescreenshot(driver, result.getName());
		}
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

}

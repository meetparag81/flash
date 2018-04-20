package Com_FB_QA_Util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;

import Com_FB_QA_Base.TestBase;

public class TestUtil extends TestBase 
{
	public static long Page_load_Timeout= 20;// this is taken as long because the ageLoadTimeout methods takes long as a input 
	public static long implicit_wait_timeout = 30;
	
	public void switchtoframe()
	{
		driver.switchTo().frame("Mainpannel");
	}
	
	public void handlealert()
	{
		driver.switchTo().alert().accept();
	}
	
	public static void takescreenshot(WebDriver driver, String screenshotname)  
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		try 
		{
			FileUtils.copyFile(source, new File(currentDir + "/screenshots"+ screenshotname +".png"));
		} 
		catch (IOException e) 
		{
			System.out.println("Exception are" + e.getMessage());
			e.printStackTrace();
		}
				
			System.out.println("screenshot taken");
	}
			
			public static void takeScreenshotAtEndOfTest1()
			{
				File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				String currentDir = System.getProperty("user.dir");
				try 
				{
				FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots1/" + System.currentTimeMillis() + ".png"));
				}
				catch (IOException e) 
				{
					System.out.println("Exception are" + e.getMessage());
					e.printStackTrace();
				}
			
			
			
	
}
}

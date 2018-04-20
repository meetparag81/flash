package Com.Browser;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
@Listeners(Com_FB_QA_Util.TestNGListners.class)
public class BaseClass 
{
        
        
	WebDriver driver;
	
	@BeforeClass
	public void setupApplication()
	{
		System.setProperty("webdriver.gecko.driver","G:\\Javaprogramming\\Selenium\\Selenium Setup\\geckodriver.exe");
		driver = new FirefoxDriver();
                
		
		//driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
	}
	
	
	@AfterClass
	public void closeApplication()
	{
		driver.quit();
			
	}
	
	
	
}

package Com.Browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


public class BaseTest
{
	WebDriver driver;
	@BeforeClass
	public void SetupApplication(String Browser,String url)
	{
	
		System.setProperty("webdriver.gecko.driver","G:\\Javaprogramming\\Selenium\\Selenium Setup\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		//driver.manage().window().maximize();
	}
	
	@AfterClass
	public void closeApplication()
	{
		Reporter.log("====Browsersesion Ended===", true);
		driver.close();
		
	}

}

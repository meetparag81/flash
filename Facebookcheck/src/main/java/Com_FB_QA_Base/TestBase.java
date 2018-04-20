package Com_FB_QA_Base;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.EventListener;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.annotations.Listeners;

import Com_FB_QA_Util.TestUtil;

@Listeners(Com_FB_QA_Util.TestNGListners.class)
public class TestBase 
{
	 public static WebDriver driver;
	  public static Properties prop;
	  public static WebDriverEventListener e_driver;
	    public TestBase() 
	    {
	    	try 
				{
					 prop = new Properties();
					 FileInputStream ip = new FileInputStream("G:\\Javaprogramming\\Facebookcheck\\src\\main\\java\\Com_FB_QA_Config\\Config.properties");
					prop.load(ip);
				} 
	    	catch (Exception e) 
	    	{
					// TODO Auto-generated catch block
					e.printStackTrace();
	    	}
		}
	    
	  
	  public static void initalization()
	  {
		  String browsername=prop.getProperty("browser");
			 if(browsername.equals("firefox"))
			 {
				 System.setProperty("webdriver.gecko.driver","G:\\Javaprogramming\\Selenium\\Selenium Setup\\geckodriver.exe");
					driver = new FirefoxDriver(); 
			 }		 
			 else if(browsername.equals("chrome"))
			 {
				 System.setProperty("webdriver.chrome.driver" ,"G:\\Javaprogramming\\Selenium\\Selenium Setup\\chromedriver\\chromedriver.exe");
					driver = new ChromeDriver(); 
			 }
			 System.out.println("Browserlaunched");
			
			//driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_load_Timeout, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.implicit_wait_timeout, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
			
			
		  
	  }

	
	  
			 
	 

}

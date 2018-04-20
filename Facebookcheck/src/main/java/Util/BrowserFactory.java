package Util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;

public class BrowserFactory 
{
	static WebDriver driver;
	public static WebDriver startBrowser(String BrowserName,String url)
	{
		
		if(BrowserName.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","G:\\Javaprogramming\\Selenium\\Selenium Setup\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(BrowserName.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(BrowserName.equalsIgnoreCase("IE"))
		{
			driver = new InternetExplorerDriver();
		}
		driver.get(url);
		return driver;
	}

}

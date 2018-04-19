package SeleniumImportant;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindBrokenLink 
{
	public static void main(String[]args)
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "G:\\Javaprogramming\\Selenium\\Selenium Setup\\chromedriver\\for 65\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		List<WebElement>links= driver.findElements(By.tagName("a"));
		System.out.println("No of links are"+ links.size());
		for(int i=0; i<=links.size();i++)
		{
			WebElement ele = links.get(i);
					String url = ele.getAttribute("href");
		}
		
		
		
		
		
	}
	public void verifylinkactive(String linkurl)
	{
		
			try {
				URL url = new URL(linkurl);
			} 
			catch (MalformedURLException e) 
			{
				
				e.printStackTrace();
			}
			finally
			{
				System.out.println("execute the finally ");
			}
			
	}
}
	
	
	
	
	


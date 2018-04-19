package Practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Swichcase1
{

	public static void main(String[] args) throws InterruptedException 
		{
				System.setProperty("webdriver.gecko.driver","G:\\Javaprogramming\\Selenium\\Selenium Setup\\geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				driver.get("https://www.google.com");
				
				/*List<String> hrefs = new ArrayList<String>();
				List<WebElement> anchors = driver.findElements(By.tagName("a"));
				
				for ( WebElement anchor : anchors ) 
				{
				    hrefs.add(anchor.getAttribute("href"));
				    
				}
				for ( String href : hrefs )
				{
					driver.get(href);
					
					href.charAt(1)
				    System.out.println("Link names"+ href);*/
				    
				}
				
			/*List<WebElement>links=driver.findElements(By.tagName("a"));
			System.out.println("Linksizeare" + links.size());
			for(int i=1;i<=links.size()-1;i++)
			{
				
				String name= links.get(i).getText();
			
					switch(name)
					{
					 case "FORUM":
					
					links.get(i).click();
					System.out.println("clicked on forum");
					break;
					
						
					 case "HOME":
						{
						links.get(i).click();
						System.out.println("clicked on home");
						break;
						}
						
				}
			}
		}*/
		
		}
	




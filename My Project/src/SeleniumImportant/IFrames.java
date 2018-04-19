package SeleniumImportant;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrames 
{
	
	public static void main(String[]args)
{
	WebDriver driver;
	
	System.setProperty("webdriver.chrome.driver", "G:\\Javaprogramming\\Selenium\\Selenium Setup\\chromedriver\\for 65\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.w3schools.com/");
	int size = driver.findElements(By.tagName("iframe")).size();
	System.out.println("frames are" + size);
	System.out.println(driver.switchTo().frame(0).getTitle());
	
	
}

}

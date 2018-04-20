package JavaBasic;

import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calender 
{

	public static void main(String[] args)
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "G:\\Javaprogramming\\Selenium\\Selenium Setup\\chromedriver\\chromedriver.exe");
		driver =  new ChromeDriver();
		driver.get("https://www.redbus.in");
		WebDriverWait wait= new WebDriverWait(driver, 30);
		driver.findElement(By.xpath("//*[@id='search']/div/div[3]/span")).click();
		List<WebElement>calender=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//table[@class='rb-monthTable first last']//td")));
		int datenodes=calender.size();
		
		for(int i=1;i<datenodes;i++)
		{
			if(calender.get(i).equals("12")) 
			{
				calender.get(i).click();
			}
		}
	}

}

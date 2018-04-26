package Programmes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Googlesearch {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver" ,"G:\\Javaprogramming\\Selenium\\Selenium Setup\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// ChromeDriver driver1 = new ChromeDriver(); can do object of chromedriver.
		 driver.get("https://www.google.co.in");
		 WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement searchbox= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(("//input[@id='lst-ib']"))));
		searchbox.sendKeys("NarendraModi");
		searchbox.sendKeys(Keys.ENTER);
		
		 WebElement search = driver.findElement(By.tagName("a"));
		 String search1= search.getAttribute("value");
		 System.out.println(search1);
		 if(search1.equals("Narendra Modi - Forbes"))
		 {
			 search.click();
		 }
		 else
		 {
			 driver.findElement(By.xpath("//span[text()='Next']")).click();
		 }
		 
	}

}

package IframeDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Iframe 
{
  @Test
  public void TestIframe() 
  {
	  System.setProperty("webdriver.gecko.driver" , "G:\\Javaprogramming\\Selenium\\Selenium Setup\\geckodriver.exe");
	  WebDriver driver = new FirefoxDriver();
	  driver.get("https://www.w3schools.com/html/html_iframe.asp");
	  WebElement frame = driver.findElement(By.xpath("//frame[@src= 'default.asp']"));
	  driver.switchTo().frame("");
	  driver.findElement(By.xpath("(//i[@class = 'fa'])[2]")).click();
	  
	  
	  
  }
}

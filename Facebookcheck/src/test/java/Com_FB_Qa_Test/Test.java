package Com_FB_Qa_Test;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test 
{
	public static WebDriver driver;
	    	
	public static void main(String[] args) throws IOException, Exception 
	{
		  
		Properties prop = new Properties();
		FileInputStream ip =  new FileInputStream("G:\\Javaprogramming\\Maven5\\src\\main\\java\\Com_FB_QA_Config\\Config.properties");
		 prop.load(ip);
		 System.out.println(prop.getProperty("browser"));
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
		 driver.get(prop.getProperty("url"));
		 driver.findElement(By.xpath(".//input[@id='email']")).sendKeys("paragborawake81@gmail.com");
		 driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("paragborawake81");
		 driver.findElement(By.xpath(".//input[@value ='Log In']")).click();
		WebElement name= driver.findElement(By.xpath("//span[contains (text(), 'Parag')]"));
		System.out.println("Navigatebutton"+ name.isDisplayed());
		System.out.println(name.getText());
		 //Thread.sleep(2000);
		WebElement logout= driver.findElement(By.xpath("//div[@id='userNavigationLabel']"));
				System.out.println("Logout button" + logout.isDisplayed());
		logout.click();
		System.out.println("Logoutpage" + driver.getTitle());
	}
	
		
	
	
	
	 
	
	 

}

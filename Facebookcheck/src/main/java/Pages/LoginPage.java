package Pages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	  WebDriver driver;
	 /* By id = By.xpath(".//*[@id='email'][@name='email']");
	 By password = By.xpath("//input[@id='pass']");*/
	 By login = By.xpath("//input[@value='Log In']");

	 public LoginPage(WebDriver driver)
	 {
		 this.driver=driver;
	 }
	 
	 public void Login(String un,String pass)
{
	driver.findElement(By.xpath(".//*[@id='email'][@name='email']")).sendKeys(un);
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pass);
	
}
public  void LoginClick()
{
	driver.findElement(login).click();
}

}


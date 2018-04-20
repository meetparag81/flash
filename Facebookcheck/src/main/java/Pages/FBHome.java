package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FBHome 
{
	@FindBy(how= How.XPATH,using=".//*[@id='email']")
	 WebElement username;
	@FindBy(how= How.XPATH,using="//input[@id='pass']")
	 WebElement password;
	
	@FindBy(how = How.XPATH,using=".//input[@value ='Log In']")
	 WebElement login_button;
	@FindBy(how= How.XPATH,using = "//div[@id='userNavigationLabel']")
	WebElement AtNavigation;
	@FindBy(how= How.XPATH,using = ".//*[@id='js_cs']/div/div/ul/li[12]/a/span/span")
	WebElement Logout;

WebDriver driver;
 	public FBHome(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
  public void LogintoFB(String un,String psw) 
	{
		username.sendKeys(un);
		password.sendKeys(psw);
		
	
	}
  public void Clickonbutton()
  {
	  login_button.click();
  }
  
	  
	  public void atNavigation()
	  {
		  login_button.click();
	  }
	  	  
	  public void clickonLogout()
	  {
		  Logout.click();
	  }
  
}

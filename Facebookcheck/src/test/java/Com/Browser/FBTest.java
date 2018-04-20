package Com.Browser;


import java.io.IOException;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Pages.FBHome;
import Util.BrowserFactory;
import Com_FB_QA_Util.TestUtil;


@Listeners(Com_FB_QA_Util.TestNGListners.class)
public class FBTest
{
	WebDriver driver;
	
	//FBHome FB_page=PageFactory.initElements(driver, FBHome.class);
	@Test	
	public void LogintoFB() throws Exception 
	{
		//called specific browser
		driver = BrowserFactory.startBrowser("firefox", "https://www.facebook.com");
		 
		
		FBHome FB_page=PageFactory.initElements(driver, FBHome.class);
		// created pageobject by using pagefactory to call the methods
		FB_page.LogintoFB("paragborawake81@gmail.com", "paragborawake81");
		
		Thread.sleep(2000);
		FB_page.Clickonbutton();		
		
	}	
	@Test	
	public void Navigatetologout()   
	{
		FBHome FB_page=PageFactory.initElements(driver, FBHome.class);
		FB_page.atNavigation();
		//Testutil.takescreenshot(driver, "Navigation");
		FB_page.clickonLogout();
		
	}
	
	
}

package com_FB_Qa_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import Com_FB_QA_Base.TestBase;


public class LoginPage extends TestBase 
{
	@FindBy(how= How.XPATH,using=".//input[@id='email']")
	 WebElement username;
	@FindBy(how= How.XPATH,using="//input[@id='pass']")
	 WebElement password;
	
	@FindBy(how = How.XPATH,using=".//input[@value ='Log In']")
	WebElement login_button;
	 

	
	
	
	public LoginPage( ) 
	{
		// initalizing the objects
	PageFactory.initElements(driver, this);
	}
	
  
	public String validateloginpagetitle()
	{
		return driver.getTitle();
		
	}
	
	public  HomePage LogintoFB(String un,String psw) 
	{
		username.sendKeys(un);
		password.sendKeys(psw);
		login_button.click();
		
		return  new HomePage(); 
	}
  
	  
  
	



  
	  
	  
	  
	  	  
	  

}

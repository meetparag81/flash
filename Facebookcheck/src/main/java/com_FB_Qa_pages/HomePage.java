package com_FB_Qa_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Com_FB_QA_Base.TestBase;

public class HomePage extends TestBase
{
	@FindBy(how= How.XPATH, using = "//span[contains (text(), 'Parag')]")
	 private WebElement Username;
	@FindBy(how= How.XPATH,using = "//span[contains (text(), 'Log Out')]")
	 private WebElement Logout;
	@FindBy(how= How.XPATH,using = "//div[@id='userNavigationLabel']")
	private WebElement AtNavigation;
	
	public HomePage( ) 
	{
		// initalizing the objects
	PageFactory.initElements(driver, this);
	}
	
	public String usertitle() 
	{
		System.out.println(Username.isDisplayed());
	//System.out.println(Username.getText());
	return Username.getText();
		
	}
	
	public void clickonNavigationlink()
	  {
		
		AtNavigation.click();
	
	  }
	
	public void clickonLogout()
	  {
		  Logout.click();
	  }
	public String Logouttitle() 
	{
		String Logouttitle= driver.getTitle();
		return Logouttitle;
	}

	
	
}
	
	

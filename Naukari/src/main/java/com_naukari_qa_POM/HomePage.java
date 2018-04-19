package com_naukari_qa_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com_naukari_qa_Base.TestBase;
import junit.framework.Assert;

public class HomePage extends TestBase
{
	
	@FindBy(xpath="//button[@class='w205'][@type='submit']")  WebElement viewupdate;
	//button[@class='w205'][@type='submit']
	@FindBy(xpath=("(//a[contains( text(), 'Edit')])[2]"))  WebElement edit;
	 ////".//*[@id='rPanel']/div/div[1]/div[2]/h1/a"
	@FindBy(xpath="//b[text()='Save Apply Setting']")  WebElement save;
	//button[@value='Save Changes']
	
	@FindBy(xpath= "//span[@id='confirmMessage']") WebElement msg;
	//span[contains( text(),'Your profile has been updated successfully')]
	
	@FindBy(xpath="//div[contains(text(), 'My Naukri')]")WebElement MyNaukari;
	
	@FindBy(xpath=".//a[@title ='Log Out']")WebElement Logout;
	 
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String TestHomePageTitle()
	{
		String Actual= driver.getTitle();
			 return Actual;
	}
	
	public String Clickonviewandupdate()
	{
		WebDriverWait wait  = new WebDriverWait(driver, 20);
		WebElement updatebutton = wait.until(ExpectedConditions.visibilityOf(viewupdate));
		updatebutton.click();
		String Actual= driver.getTitle();
		 return Actual;
		
	}
	
	public String Clickoneditlink() throws Exception
	{
		edit.click();		
		String Actual= driver.getTitle();
		return Actual;
		
	}
	public String UpdateMessage() throws Exception 
	{
		save.click();
		Thread.sleep(2000);		
		String Actual= msg.getText();
		return Actual;	
		
	}
	
	
	
	public String Logout()
	{
		Actions act = new Actions(driver);
		act.moveToElement(MyNaukari).perform();
		Logout.click();
String Actual = driver.getTitle();
		
		return Actual;
		
	}
	

}

package com_naukari_qa_Test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import com_naukari_qa_util.TestUtil;
import com_naukari_qa_Base.TestBase;
import com_naukari_qa_POM.HomePage;
import com_naukari_qa_POM.LoginPage;


public class Homepagetest extends TestBase
{
	HomePage hp;
	  LoginPage lp;
	TestUtil TestUtil;
	
	
	Homepagetest()
	{
		super();
	}
	@BeforeClass
	public void Setup()
	{
		TestBase.Initallization();
		TestUtil = new TestUtil();
		lp= new LoginPage();
		TestUtil.switchWindow();
		lp.VerifyLoginPage();
		hp = lp.LogintoNaukari("paragborawake81@gmail.com", "borawake81");
		
		 
	}
	
	@Test(priority=1)
	public void verifyHomePageTitleTest()
	{
		hp.TestHomePageTitle();
		
		String Actual= hp.TestHomePageTitle();
		String Expected = "Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com";
		//Assert.assertEquals(Actual, Expected);
		System.out.println("Homepage is Seen");
	}
	
	@Test(priority=2)
	public void ViewandUpdateButtonTest() throws Exception
	{
		hp.Clickonviewandupdate();
		String Actual= hp.Clickonviewandupdate();
		String Expected = "Profile|Mynaukri";
		//Assert.assertEquals(Expected, Actual);	
		System.out.println("Page is on update page");
	}
	@Test(priority=3)
	public void EditLink() throws Exception
	{
		hp.Clickoneditlink();
		String Actual= hp.Clickoneditlink();
		String Expected = "Update Profile|Mynaukri";
		//Assert.assertEquals(Actual, Expected);
				
	}
	@Test(priority=4)
	public void Updatetexttest() throws Exception
	{
		hp.UpdateMessage();
		
		
	}
	
	@Test(priority=5)
	public void LogoutTest()
	{
		hp.Logout();
		
		String Actual  = hp.Logout();
		String Expected = "My Naukri";	
		Assert.assertEquals(Actual, Expected);
		System.out.println("testcase completed");		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}

package Com_FB_Qa_Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com_FB_QA_Base.TestBase;

import com_FB_Qa_pages.LoginPage;

public class LoginPageTest extends TestBase 
{
	LoginPage lp;
	public LoginPageTest() 
	{
		super();
	}	
	
	@BeforeMethod
	public void SetUp()
	{
		TestBase.initalization();
		lp = new LoginPage(); 
	}
	@Test(priority=1)
	public void LoginPageTitletest()
	{
	String title=lp.validateloginpagetitle();
	String expected = "Facebook � log in or sign up";
	Assert.assertEquals(title,expected);
	
	}
	@Test(priority=2)
	public void givecredentials()
	{
		lp.LogintoFB(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	


@AfterMethod
public void tearDown()
{
	driver.quit();
}


}


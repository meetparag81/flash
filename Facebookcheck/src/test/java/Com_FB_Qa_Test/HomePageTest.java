package Com_FB_Qa_Test;

import org.testng.annotations.Test;

import Com_FB_QA_Base.TestBase;
import Com_FB_QA_Util.TestUtil;
import com_FB_Qa_pages.HomePage;
import com_FB_Qa_pages.LoginPage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class HomePageTest extends TestBase  
{
	LoginPage lp;
	HomePage hp;
	TestUtil Util;
	public HomePageTest()
	{
		super();
	}
  
  @BeforeMethod
  public void setup() 
  {
	  TestBase.initalization();
	   lp = new LoginPage();
	   Util = new TestUtil();
	  //login page login to fb is returning object of home page hence we can store it in refrance of hp
	hp = lp.LogintoFB(prop.getProperty("username"), prop.getProperty("password"));
	  
	  
  }
  @Test(priority=1)
  public void UsernameonPageTest() throws Exception 
  {
	  
	
	  
	  String Actual= hp.usertitle();
	   
	 Assert.assertEquals(Actual, "Parag", "Loginwithcorrectcredentials");
  }
	 @Test(priority=2)
	  public void clickonNavigation() throws Exception
	  {
		  //Util.handlealert();
		 //Thread.sleep(2000);
		 hp.clickonNavigationlink();
	  }
	 @Test(priority=3)
	 public void Logout() throws Exception
	  {
		 //Thread.sleep(2000);
		 hp.clickonLogout();
	  }
	 @Test(priority=4)
	 public void LogoutTitle() throws Exception
	 {
		 Thread.sleep(2000);
		 hp.Logouttitle();
		 String Actual = hp.Logouttitle();
		String Expected= "Logout";		 
	 Assert.assertEquals(Actual, Expected);
	 }
	 
	 
		 
  @AfterMethod
  public void driverclose()
  {
	  driver.quit();
  }

}

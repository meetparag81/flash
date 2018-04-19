package com_naukari_qa_Test;
/*package com_naukari_qa_Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com_naukari_qa_Base.TestBase;
import com_naukari_qa_POM.LoginPage;
import com_naukari_qa_util.TestUtil;



public class LoginTest  extends TestBase
{
	String sheetname = "Data";
	
	LoginTest()
	{
		super();
	}
	
	@BeforeMethod
	  public void setup() 
	  {
		TestBase.Initallization();
		TestUtil.switchWindow();
		
	
	  }
		
		   
	
	
	
	@DataProvider
	public Object[][] getNaukariTestData()
	{
		Object[][]data= TestUtil.getTestData(sheetname);
		return data;
		
	}
	@Test
	public void ClickonLogin() throws Exception
	{
		Thread.sleep(2000);
		LoginPage.VerifyLoginPage();
	}
	
	@Test
	public void Logintest() throws Exception
	{
		
		LoginPage.LogintoNaukari("paragborawake81","borawake81");
	}
	
	 @AfterClass
	  public void Teardown()
	  {
		 // driver.quit();

	  }
}
*/
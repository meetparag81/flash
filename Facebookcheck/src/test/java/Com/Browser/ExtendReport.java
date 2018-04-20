package Com.Browser;

import java.io.File;

import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtendReport 
{
	ExtentReports extent;
	ExtentTest loggers;
	@BeforeTest
	public void starttest()
	{
	extent = new ExtentReports(System.getProperty("user.dir")+ "/test-output/STMExtendreport.html" , true);
	extent.addSystemInfo("HostName", "https://www.facebook.com/");
	extent.addSystemInfo("Enviornment", "Automationtesting");
	extent.addSystemInfo("UserName", "ParagB");
	extent.loadConfig(new File(System.getProperty("user.dir")+ "//Extent-config.xml"));
	}

}

package Constructor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Parent 
{
	WebDriver driver;
	Properties prop;
	Parent()
	{
		FileInputStream ip;
		prop= new Properties();
		try {
			ip = new FileInputStream("");
		} catch (FileNotFoundException e) 
		{
			
		}
	}
	

}

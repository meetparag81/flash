package pot;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ParellalTest 
{
  @Test
  public void Testone() 
  {
	  System.out.println("firsttest");
  }
  
  @Test
  public void TestSecond() 
  {
	  System.out.println("Secondtest");
  }
  @BeforeTest
  public void beforeTest() 
  {
	  
  }

  @AfterTest
  public void afterTest()
  {
	  
  }

}

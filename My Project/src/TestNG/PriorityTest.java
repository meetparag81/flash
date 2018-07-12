package TestNG;

import org.testng.annotations.Test;

public class PriorityTest 
{
	@Test (priority=0)
	public void E()
	{
		
	}
	@Test (priority=-2)
	public void F()
	{
		
	}
	
	@Test (priority=1)
	public void A()
	{
		
	}
	@Test (priority=1)
	public void B()
	{
		
	}
	@Test (priority=1)
	public void C()
	{
		
	}
	@Test (priority=1)
	public void D()
	{
		
	}
	
	

}

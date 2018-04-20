package JavaBasic;

public class CDVstatic 
{
	int a,b;
	
	public static void sum(int A, int B)
	{
		//this.a= A;// can't instanttiate  the instance variable 
		
	}
	public static void main(String[]args)
	{
		CDVstatic obj= new CDVstatic();
		obj.sum(10, 20);
		
		
	}
	

}

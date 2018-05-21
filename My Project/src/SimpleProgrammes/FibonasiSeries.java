package SimpleProgrammes;

public class FibonasiSeries 
{
	
	public static void main(String[] args)
	{
		int number = 10;
		int result=0;
		int	first=1;
		int current = 2;
		System.out.println("fibonaciseries:" );
		System.out.print("0" + " "+"1");
		for(int i=2; i<10; i++)
		{
			result= first +current;
			first=current;
			current=result;
			
			System.out.print(" "+result);
		}
		System.out.println(" "+result);
		
		int n1=0,n2=1,n3,i,count=10;    
		 System.out.print(n1+" "+n2);//printing 0 and 1    
		    
		 for(i=2;i<count;i++)//loop starts from 2 because 0 and 1 are already printed    
		 {    
			 n3=n1+n2;    
		  System.out.print(" "+n1);    
		  n1=n2;    
		  n2=n3;
		System.out.print(n3);
	}
	
	
	

}
}

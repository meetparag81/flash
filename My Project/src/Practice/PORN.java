package Practice;

public class PORN 
{

	public static void main(String[] args) 
	{
		int i = 1;
		
		if(i>0)
		{
		System.out.println("No is P ");
		}
		else if(i<0)
		{
			System.out.println("Ansis N");
		}
		else
			System.out.println("Anis zero");
		
		System.out.println("\n even nos----------------");
		
		int limit = 50;
		for(int j1=1; j1 <= limit; j1++)
	    {
	      if( j1 % 2 == 0)
	            {
	             System.out.print(j1 + " ");
	            }
	    }
		System.out.println("\n Odd no ------------------------");
		int k;
		int num = 50;
		for(k=2; k<=num;k++) 
		{
			if(k % 2!=0)
			{
			System.out.println(k + " ");
			}
		}
		System.out.println("\n Paridom no ------------------------");
		
		int r;
		int num1 = 121;
		int s;
		int t=num1;
		
		for(;num1>0;)
		{
		r = num1%10;
		num1=num1/10;
		s= (num1*10)+r;
		}
		if(t==num1)
		{
			System.out.println("No is Paridrome");
		}
		else
		{
			System.out.println("No is not Paridrome");
		}
		System.out.println("PrimeNo---------------");
		
		int n= 24;
		int ans = 0;
		for(int o=2;o<=n/2;o++)
		{
			ans = n%o;
			
		}
		if(ans==0)
			{
				System.out.println("No is not prime");
			}	
			else
			{
				System.out.println("No is  Prime");
			
			}
		System.out.println("\n factorial-----------");
		
		int num11 = 9;
		int i1;
		int f = 1;
		
		for(i1=num11;i1>=1;i1--)
		{
			f=f*i1;
		}
		System.out.println(f);
		
		
	}
	

}

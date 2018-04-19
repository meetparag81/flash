package SimpleProgrammes;

public class PEOFP 
{

	public static void main(String[] args)
	{
		int num = 27;
		int i; 
		int ans = 0;
		for(i=2;i<=num/2;i++) 
		{
			ans = num%i;			
		}
		if(ans==0)
		{
		System.out.println("no is not prime");		
		}
		else
		{
			System.out.println("No is  prime");
		}
		
		System.out.println("/Prime nos---------------------------");
		
		/*nt k,j1;
		int sum1 =k;
		for(k=1;k<=100;k++)
		{
			for(j1=2;j1<=i;j1++)
			{
			if(k%j1==0)	
			{
				boolean flag = false;
			}
		}
			
				 
		}
		
		if(sum1%2==1);
		{
			System.out.println(k);
		}*/

	}

}

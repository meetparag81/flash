package SimpleProgrammes;

public class Prime 
{

	public static void main(String[] args)
	{

		int num = 1;
		int ans = 0;
		int i;
		
		for(i=2;i<=num/2;i++)
		{
			ans= num%i;
		}
		if(ans==0)
		{
			System.out.println("Number is not a prime No");
		}
		else 
		{
			System.out.println("Number is a prime No");
		}
			
		
		
		
		
		
		
		
		
		/*for(int i=2;i<=num/2;i++)
			{
				int count = 0;
				if(num%num == 0 && num%i==0)
				{
					count++;
				
				}
				if(count<3)
				{
					System.out.println("prime no");
				}
				else
				{
					System.out.println("not a prime no");
				}
					
			}
		
		int num1 = 5 ;
		 boolean flag = false;
		
		for(int i = 2;i<num1/2;i++)
		{	
			if(num1%i==0)
			{
			flag = true;
			break;
			}			
		}
		if(!flag)
		System.out.println("No is  prime");
		else
		System.out.println("No is not prime");*/
			
			
			
		}

	}


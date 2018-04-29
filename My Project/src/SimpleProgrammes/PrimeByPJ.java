package SimpleProgrammes;

public class PrimeByPJ 
{

	public static void main(String[] args)
	{
		int num =87;
		int i;
		int count=0;
		
		for(i=1;i<=num;i++)
		{ 
			if(num%i==0)
			{
				count++;
			}
					
		}
		if(count<3)
		{
			System.out.println("No is prime");
		}
		else
			System.out.println("No is not prime");
	}
	
	

}

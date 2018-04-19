package SimpleProgrammes;

public class PrimeNumbers {

	public static void main(String[] args)
	{
		int i,j; 
		boolean flag;
		
		for(i=1;i<=100;i++)
		{
		for( j=2;j<=i;j++)
			{
			if(i%j==0)
				{
					flag= false;
				break;
				}
			}
		
		}
		if(flag= true)
		{
			System.out.println(i);
		}
			
	}

}

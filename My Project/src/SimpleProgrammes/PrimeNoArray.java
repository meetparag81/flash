package SimpleProgrammes;

public class PrimeNoArray 
{
	
public static void main(String[]args)
	{
		int[] arr = new int[100];
		arr[0]=0;
		
		boolean isprime = true;
			
			
			for(int i=2;i<=100;i++)
			{
				
				if(arr[i]%2==0)
				{
					isprime= true;
					break;
				}
				else
				isprime= false;					
				System.out.println(arr[i]+ " ");
			
		
		}
			
	
	}
}

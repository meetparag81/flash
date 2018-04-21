package pot;

public class PrimeSelf {

	public static void main(String[] args) 
	{
	for(int i=1;i<=100;i++)	
	{
		boolean isprime=true;
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
				
			{
				isprime=false;
				break;
				//System.out.println("No"+ i +" is not a prime" );
			}
			/*else
			{
				System.out.println("No"+ i +" is  prime");
			}*/
		}
		if(isprime)
		{
			System.out.println(i+" ");
		}
		
	}

	}

}

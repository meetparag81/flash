package pot;

public class PrimeByAmit {

	public static void main(String[] args) {
		
		for(int i=2;i<=100;i++)
		{
			if(i%2==0 || i%3==0|| i%5==0 || i%7==0 )
			{
				if(i==3||i==5||i==7)
				{
					System.out.println( i );
				}
				//System.out.println(i + "is not prime no");
			}
			
			else
			{
				System.out.println(i  );
			}
		}

	}

}

package Practice1;

public class DivisibleBy3and5
{

	public static void main(String[] args) 
	{
		 int i,j;
		
		for(i=1; i<100; i++)
		{
			if(i%3 == 0 && i%5 == 0)
			{
				System.out.println(i);
			}
		}

	}

}

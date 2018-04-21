package pot;

public class PrimeNoinArray {

	public static void main(String[] args)
	{
		int a[]= new int[100];
		for(int i =1; i<=100;i++)
		{
			for(int j = 2;j<i;j++)
			{
				if (i%j== 0)
				{
					System.out.println("Prime no is "+ i);
					break;
				}
				
				
			}
				
				
		}
	}

}

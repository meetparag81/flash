package Practice1;

public class Pattern3 
{

	public static void main(String[] args) 
	{
		int i,j;
		
		int row = 5;
		
		for(i=1;i<=row;i++)
		{
			int num= i;	
			
			for(j=1;j<=i;j++)
			{
				System.out.print(num+" ");
				num = num +row-j;
		}
			System.out.println();

	}

}
}

package Patterns;

public class FirstPattern 
{
/*	1
	12
	123
	1234*/
	
	

	public static void main(String[] args) 
	{
		System.out.println();
		// the no of columns is depend on no of rows
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1; j<=i;j++)
			{
				System.out.print(j);// this will print  at 1
			}
			System.out.println("");// to come on next line
			
			
			
			
		}
		
	}

}

package Patterns;

public class SecondPattern 
{
	/*1
	  0 1
	  1 0 1
	  0 1 0 1
	  1 0 1 0 1*/
	
	

	public static void main(String[] args) 
	
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)// here we want on first row the single value, so as i increases the value increases
			{
				if((i+j)%2==0)
				{
					System.out.print("1");// if we see if we add 2 row first column addition become 3, which is odd,so in that case 
					//+"0" is printed 
				}
				else
				{
					System.out.print("0");
			
		}
			
				}
				System.out.println(" ");
			}
		

	}

}

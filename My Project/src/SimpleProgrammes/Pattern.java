package SimpleProgrammes;

public class Pattern
{

	public static void main(String[] args) 
	{
	/*int i; // for no of rows
	 int j;// for number of rows
	
		for(i=1;i<=4;i++)
		{
			for(j=1;j<=4;j++)
			{
				System.out.println("*");
			}
			System.out.println("\n");
		}*/
		
		int i, j;
        for(i=1; i<=4; i++)
        {
            for(j=1; j<=4; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
		System.out.println("--------------");
		
		int i1, j1;
        for(i1=0; i1<=4; i1++)
        {
            for(j1=0; j1<=i1; j1++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-----------");
        
        int i2,j2;
        for(i2=1;i2<=4;i2++)
        {
        	for(j2=1;j2<=4;j2++)
        	{
        		if(i2==1||i2==4||j2==1||j2==4);
        		{
        		System.out.println("*");
        		}
        		
        		{
        			System.out.println(" ");	
        		}
        			
        	}
        	
        	
        }
	}
}

package Practice1;

public class Pattern2//notcorrect

// want to write following pattern 
/*1 2 3 4
2 3 4 1
3 4 1 2
4 1 2 3*/

{

	public static void main(String[] args)
	{
		int i, j ;
		
		for(i= 0; i<=4;i++)
		{
			for(j=0;j<=i;j++)
			{
				if(i==1 || i==4 || j==1 || j==4)
					{
						System.out.print(" 1" + "2" + "3" + "4");
					}
				/*else if(i==2 ||j==2)
				{
					System.out.print("2"+ "3" + "4" +"1");	
				}*/
			}
		}
		System.out.println();

	}

}

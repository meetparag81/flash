package Practice1;

public class Pattern 
{

	public static void main(String[] args) 
	{
		int i, j;// i is used for row and j is used for column 
        for(i=1; i<=10; i++)
        {
            for(j=1; j<=10; j++)
            {
                System.out.print("- ");// here we only used print not print ln because println type output on next line.
            }
            System.out.println();// this step is used to go to next row of a line

        }
	}
}



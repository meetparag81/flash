package Practice1;

/*1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5*/

public class Pattern4 {

	public static void main(String[] args)
	{
		/*int i ,j;
		
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}*/
		//}
		//System.out.println();
		
		int i, j, num;
        for(i=0; i<5; i++)
        {
            num=1;
            for(j=0; j<=i; j++)
            {
                System.out.print(num+ " ");
                num++;
            }
            System.out.println();

	}

}
}

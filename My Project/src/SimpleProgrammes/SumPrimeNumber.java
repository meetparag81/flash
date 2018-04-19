package SimpleProgrammes;

import java.util.Scanner;

public class SumPrimeNumber 
{

	public static void main(String[] args) 
	{
		for(int i = 2; i <=10; i++)
		{
			int count=0;
			int sum = 0;
			for(int j=1; j<=i; j++)
			{
				if(i%j == 0) //(13%13 == 0)  
				{
					count++;
					
				}
				
			}
			if(count < 3)
			{
				sum = sum +i;
				System.out.println(i);
				break;
				
				
			}
			sum = sum+i;
			System.out.println(sum);
		
		
        /*for(int i1=2;i1<r;i1++)
        {
            int flag=0;
            for(int j=2;j<i1;j++)
            {
                if(i1%j==0)
                    flag=1;
            }
            if(flag==0)
            {
                System.out.print(i1+" ");
                sum=sum+i1;
            }
        }
        System.out.println("Sum = "+sum);
		*/
					
	}
		
		
				

	}
	
}

	



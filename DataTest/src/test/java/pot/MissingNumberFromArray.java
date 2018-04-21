package pot;

public class MissingNumberFromArray 
{

	public static void main(String[] args) 
	{
		int sum = 0;
		int s[] = {1,2,4,5,6};
		
		for(int i=0;i<s.length;i++)
		{
			sum = sum +s[i];
			
		}
		System.out.println(sum);
		int sum1=0;
				for(int j=1;j<=6;j++)
				{
					sum1=sum1+j;
				}
		
		System.out.println("missing no=" + (sum1-sum));
	}

}



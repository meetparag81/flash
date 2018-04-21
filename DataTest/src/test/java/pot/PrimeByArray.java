package pot;

public class PrimeByArray {

	public static void main(String[] args) {
		
		int a[]= new int[100];
		for(int i =1; i<=a.length;i++)
		{
			a[i] = i+1;
		}
			for(int i = 0;i<a.length-1;i++)
			{
			if(a[i]%2==0 || a[i]%3==0|| a[i]%5==0 || a[i]%7==0 )
			{
				if(a[i]==1||a[i]==3||a[i]==5||a[i]==7)
				{
					System.out.println( i );
				}
				
			}
			
			else
			{
				System.out.println("non prime no");
			}
		}

	}

}

package pot;

public class ReversetheNum 
{
	public static void main(String[] args)
	{
		int num= 12345;
		int rev =0;
		while(num!=0)
		{
			rev= rev*10+num%10;//0*10 +12345%10 = 5 then, 5*10+1234%10 = 50+4 = 54
			num = num/10;//
		}
		System.out.println(rev);
	}
	
	

}

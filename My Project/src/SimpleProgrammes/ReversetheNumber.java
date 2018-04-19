package SimpleProgrammes;

public class ReversetheNumber 
{
	public static void main(String[] args)
		{
			int num= 121;
			int rev =0;
			while(num!=0)
			{
				rev= rev*10+num%10;
				System.out.println("Reverse Number is"+ rev);
				num = num/10;
				System.out.println("Number is"+ num);
			}
			System.out.println(rev);
	
	
		}
}

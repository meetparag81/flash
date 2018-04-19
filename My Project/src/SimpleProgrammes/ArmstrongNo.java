package SimpleProgrammes;

public class ArmstrongNo 
{

	public static void main(String[] args) 
	{
		int n=371;
		int temp = n;
		int arm = 0;
		int r;
		for(;n!=0;n/=10)
		{
			r=n%10;
			arm=arm+(r*r*r);
		}
		if(arm==temp)
			{
			System.out.println("Armstrong");
			
			}
		else
			System.out.println("not armstrong");

}
}

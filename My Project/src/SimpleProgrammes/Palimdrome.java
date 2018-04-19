package SimpleProgrammes;

public class Palimdrome 
{

	public static void main(String[] args) 
	{
		int n = 12121;
		int r;// used for reminder
		int s = 0;// is used for reverse number
		int t= n;// t want to store the original no because after loop n will be zero
		
		for(;n>0;)
		{
			r= n%10;// want reminder 
			n= n/10;// want break 195 to 19, hence this step used)			
			s = s*10+r;// want to 
		}
		if(t == s)
		{
		System.out.println("No is Palidrome");
		}
		else 
		{
			System.out.println("No is not palidrome");
		}
			
				

	}

}

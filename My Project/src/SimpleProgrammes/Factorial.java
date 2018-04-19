package SimpleProgrammes;

public class Factorial {

	public static void main(String[] args)
	{
		int num = 9;
		int i;
		int f = 1;
		
		for(i=num;i>=1;i--)
		{
			f=f*i;
		}
		System.out.println(f);

	}

}

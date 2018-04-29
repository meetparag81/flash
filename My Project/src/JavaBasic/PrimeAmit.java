package JavaBasic;

public class PrimeAmit
{
	public static void main(String[]args)
	{
	boolean flag;
	for(int i=1;i<=10; i++)
	{
		flag=true;
		
		for(int j =2;j<i-1;j++)
		{
			if(i%j==0)
			{
				flag=false;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println(i);
		}
	}
	

}
}

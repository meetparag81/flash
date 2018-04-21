package trycatch;

public class Exceptions {

	public static void main(String[] args)
	{
		try{
			int a = 10;
			double b= a/0;
			System.out.println("b");
		}
		catch(ArithmeticException e)
		{
			System.out.println("You should not divide a number by zero");
		}
		finally
		{
			System.out.println("finally block always executed");
		}
		
		

	}

}

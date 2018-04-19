package String;

import java.util.Scanner;

public class Switch
{

	public double Addition(double x,double y)
	{
		double z;
		return  z = x+y;
		
	}
	
	public double Sutraction(double x,double y)
	{
		double z;
		return  z = x-y;
		
	}
	
	public double Division(double x,double y)
	{
		double z;
		return  z = x/y;
		
	}
	public double Multiplication(double x,double y)
	{
		double z;
		return  z = x*y;
		
	}
	
	public static void main(String[] args)
	{
		String Operation = "Operation";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter operation:"); 
		Operation= sc.next();
		Switch s = new Switch();
		
		switch(Operation)
		{
		case"Add":
			System.out.println(s.Addition(10, 20));
			break;
		case"Sub":
			System.out.println(s.Sutraction(20, 30));
			break;
		case"Multi":
			System.out.println(s.Multiplication(10, 20));
			break;
		case"Div":
			System.out.println(s.Division(10, 20));
			break;
			default:
				System.out.println("invalidinput");
			
		}
	}
	
}
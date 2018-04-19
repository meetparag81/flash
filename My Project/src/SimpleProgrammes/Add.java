package SimpleProgrammes;

import java.util.Scanner;

public class Add 
{
	public Add(int x,int y)
	{
		int z =x+y;
		System.out.println("Addition is:"+ z);
	}

	public static void main(String[] args) 
	{
	Add a = new Add(10,20);
	// second way to do addition
	int p,q,r;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 1st Number:");
	p= sc.nextInt();
	System.out.println("Enter scond number");
	q = sc.nextInt();
	 r= Addition(p,q);
	 System.out.println("Addition is:"+ r);
	 
	 // third way to do addition
	 
	 int a1, b1,c1;
	 System.out.println("Enter 1st Number:");
		a1= sc.nextInt();
		System.out.println("Enter scond number");
		b1 = sc.nextInt();
		while(a1--!=0)
		{
			b1++;
		}
		System.out.println("Addition is:"+ b1);
	}

	public static int Addition(int x, int y) 
	{
		return x+y;
		
		
	}

	
	
	

}

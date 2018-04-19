package SimpleProgrammes;

import java.util.Scanner;

public class Add1 
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
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


	}



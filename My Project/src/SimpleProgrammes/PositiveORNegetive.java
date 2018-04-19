package SimpleProgrammes;

import java.util.Scanner;

public class PositiveORNegetive 
{

	public static void main(String[] args) 
	{
		/*Scanner sc = new Scanner(System.in);
		
		System.out.println("Numbers:");
		 int input = sc.nextInt();
		 
		 if(input>0)
		 {
			 System.out.println("number is positive");
		 }
		 else if(input<0)
		 {
			 System.out.println("No is Negetive");
		 }
		 else
		 {
			System.out.println("No is zero");
		 }*/
	
	Scanner in = new Scanner(System.in);
    System.out.print("Input number:");
    
    int input = in.nextInt();

    if (input > 0)
    {
        System.out.println("Number is positive");
    }
    else if (input < 0)
    {
        System.out.println("Number is negative");
    }
    else
    {
        System.out.println("Number is zero");
    }
 }
}
    // has to be add exception handling  code
	



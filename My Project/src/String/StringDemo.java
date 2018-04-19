package String;

import java.util.Scanner;

public class StringDemo 
{

	public static void main(String[] args) 
	{
		double x=0;
		double y=0;
		String operation;
		String originalValue;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input your string value: ");
		originalValue = sc.next();
		
		/*StringMethods sm = new StringMethods();
		//String reversedValue = sm.reverseString(originalValue);
		System.out.println("Reversed String is: "+reversedValue);
		
		boolean isPalindrome = sm.checkPalindrome(originalValue);
		if(isPalindrome == true)
		{
			System.out.println(originalValue + " is a Palindrome");
		}
		else
		{
			System.out.println(originalValue + " is not a Palindrome");
		}*/
		
		/*String creditCardNumber = "1458251432142548";
		System.out.println("Last 4 characters are: " +sm.returnLast4characters(creditCardNumber));*/
		
		System.out.print("Input the First Number: ");
		x = sc.nextDouble();
		System.out.print("Input the Second Number: ");
		y = sc.nextDouble();
		System.out.print("Input the type of Operation (+,-,*,/): ");
		operation = sc.next();
		Calculator c = new Calculator();
		
		switch (operation)
		{
			case "+":
				System.out.println("Addition is: " + c.Addition(x, y));
				break;
			
			case "-":
				System.out.println("Substraction is: " + c.Division(x, y));
				break;
				
			case "*":
				System.out.println("Multiplication is: " + c.Multipication(x, y));
				break;
				
			case "/":
				System.out.println("Division is: " + c.Division(x, y));
				break;
				
			default:
				System.out.println("Invalid input");


		}
	
	}
	
}

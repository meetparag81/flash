package pot;

import java.util.Arrays;

public class LargestAndSmallestNo 
{
	public static void main(String[] args)
	{
	 int numbers[]= {1,55,-10,-60,22222};
	int largest = numbers[0];
	int smallest = numbers[0];
	for(int i=0;i<numbers.length;i++)
	{
		if(numbers[i]>largest)
		{
			largest = numbers[i];
		}
		else if(numbers[i] < smallest) 
		{
			smallest = numbers[i];
			
		}
		
	}
	System.out.println("givenarray is"+ Arrays.toString(numbers));
	System.out.println("Largest number is" + largest );
	System.out.println("Smallest number is" + smallest );
		
	}
	

}

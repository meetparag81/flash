package ArrayPrograme;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class LargestElementInArray 

{
// first way to execute the 
	public static void main(String[] args) 
	{
		int array[] = {60,20,40,50,-1};
		
		int temp = array[0];
			
		for(int i=0;i<array.length;i++ )
			{
				if (temp > array[i])
				{
				temp = array[i];
				}		
			}
		System.out.println(temp);
		
		// second method
		ArrayList<Integer>arraylist = new ArrayList<>();
		arraylist.add(10) ;
		arraylist.add(20) ;
		arraylist.add(50);
		arraylist.add(60);
		
	//Collections.sort(arraylist);
//System.out.println(arraylist);

int e= arraylist.size();
//System.out.println(e);
//System.out.println(arraylist.get(arraylist.size()-1));

	}

}

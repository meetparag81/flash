package pot;

import java.util.HashMap;
import java.util.Set;

public class duplicatecharacterMethod2 {

	public static void main(String[] args) 
	{
		String s = "Apple";
		HashMap<Character, Integer>charcount = new HashMap<>();// create a map to add character and its values
		char[] StringArraychar= s.toCharArray();// Converts this string to a new character array.
		  
		for(char c :StringArraychar)
		{
			if(charcount.containsKey(c))// check charcount map contains any characteror not a character already present in Map
			{
				charcount.put(c, charcount.get(c)+1);
			}
			else
			{
				charcount.put(c, 1);
			}
			
			Set<Character>characterString = charcount.keySet();
			for(Character ch:characterString )
			{
				if(charcount.get(ch)>1)
				{
					System.out.println("ch:"+charcount.get(ch));
				}
			}
		}
			

		}
		


	}



package pot;

import java.util.HashMap;
import java.util.Set;

public class Duplicatewordintext {

	public static void main(String[] args)
	{
		String s= "My name is Parag and I am an engineer"; 
		
		String[] words = s.split("");
		HashMap<String, Integer>wordMap = new HashMap<>();
		for(String str:words)
		{
			if(wordMap.get(str)!= null) // check wether the word is available in the Map
			{
				wordMap.put(str, wordMap.get(str)+ 1);
			}
			else
			{
				wordMap.put(str, 1);
			}
		}
		
		Set<String> str2= wordMap.keySet();// to take ket and how many times it is repeated
		for(String str: str2)
		{
			System.out.println("word:"+ str+": repeated" + wordMap.get(str) + "times");
			
		}
	}

}

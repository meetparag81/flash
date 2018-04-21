package pot;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharacterInString 
{
	

	public static void main(String[] args)
	{
		/*int dup[] = {Apple};
		int  Duplicate= char[0];
		
		for(int i=0;i<dup.length;i++)
		{
		if(dup[0]==Duplicate)
		{
			System.out.println("word is duplicate");
		}
		
		}*/
		
		/*String s = "Apple";
		String Dup = "";
		char c=s.charAt(0);
		System.out.println(c);
		for(int i=s.length()-1;i>0;i++)
			
		{
			Dup = Dup+s.charAt(i);
			System.out.println(Dup);
			
			
		}*/
		int count=0;
		String str = "w3schools";
		char[]c = str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			for(int j= i+1;j<str.length();j++)
			{
				if(c[i]==c[j])// compare each word with another
				{
					System.out.println(c[j]);
					count++;
					break;
				}
			}
			
		}
		System.out.println(count);// number of duplicates
		
		
		System.out.println("===========find out vowel from the given string======");
		
		String s = "good";
		int count1=0;
		char[]arr= s.toCharArray();
		
		for(int i=0;i<s.length();i++)
		{
			if(arr[i]=='a' || arr[i]=='i' || arr[i]=='e' || arr[i]=='o' || arr[i]=='u')
			{
				String newstring= s.replaceAll("[aeiou]", "&");
				System.out.println(newstring);
				break;
				
			}
			//System.out.println(newstring);
		}
		
	}
}
		

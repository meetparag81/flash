package String;

public class ReverseString 
{

	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer("Reverse Example");
		System.out.println("Orignal StringBuffer Content :"+ sb);
		
		sb.reverse();
		System.out.println("Reverse StringBuffer Content :"+ sb);
		
		String str1 = "Strings are imutable";
		String str2 = "Strings are imutable";
		String str3 = "Integer are imutable";
		int result = str1.compareTo(str2);
				System.out.println(result);
		int result1 = str2.compareTo(str3);
		System.out.println(result1);
		String s = "Strings are immutable";
		s= s.concat(" all the time");
		System.out.println(s);

	}

}

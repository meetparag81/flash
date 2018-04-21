package pot;

public class RemoveSpecialChar {

	public static void main(String[] args) 
	{
		// use regular expression [^0-9a-zA-Z]
		String s = "start@@@@@^%@** java";
		s = s.replaceAll("[^0-9a-zA-Z]" , "");
		
		System.out.println(s);

	}

}

package pot;

public class Reversestring 
{

	public static void main(String[] args) 
	{
		String s = "parag";
		String Rev = "";
		int len = s.length();
		//System.out.println(len);
		for(int i = len-1;i>=0;i--)
		{
			Rev = Rev + s.charAt(i);
			
		}
		System.out.println(Rev);
		// string biffer
		StringBuffer sf = new StringBuffer(s);
		System.out.println(sf.reverse());

	}

}

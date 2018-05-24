package SimpleProgrammes;

public class ReverseTheStringAndFindDuplicateNos 
{
	
	
	
	
	public static void main(String[] args) 
	{
		
		String s = "Selenium";
		int strcount = s.length();
		String rev = "";
		int i=0;
char[]inp = s.toCharArray();

int count = 0;
		for (  i=0; i <strcount; i++) 
		{
			for(int j=i+1;j<strcount;j++)
			{
				
				if(inp[i]==inp[j])
				{
					System.out.println(inp[j]);
					count++;
					break;
				}
				
			}
			//System.out.println(rev= rev+inp[i]);
			
			
			
			
		}
		
		System.out.println("No of duplicates"+ count);
		

	}
}


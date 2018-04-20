package JavaBasic;

public final class ClassWithFinalkeyword 
{
	int a= 5; int b =4,c;
	
	public int Add(int a, int b)
	{
		c= a+b;
		System.out.println(c);
		return c;
	}

	public static void main(String[]args)
	{
		ClassWithFinalkeyword obj = new ClassWithFinalkeyword();
		obj.Add(10, 20);
	}
}

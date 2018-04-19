package Practice;

public class Swap<Mydate> {
	int a;
	int b;
	int temp;
	Mydate date;
	public static void Swap(int a, int b) 
	{
		int temp = 0;
		temp = a;
		a= b;
		b= temp;
		
		System.out.println("value after swapping are=" +a +"and" +b );
		
	}
	
	public static void Swapd(MyDate d, MyDate d1) 
	{
		MyDate temp = null;
		temp = d;
		d= d1;
		d1= temp;
	
		
		System.out.println("value after swapping are=" +d +"and" +d1 );
	}

	public static void main(String[] args)
	
	{
	int a = 10;
	int b = 20;	
	MyDate d = new MyDate();
	MyDate d1 = new MyDate();
		
		System.out.println("value before swapping are=" +a +"and" +b);
		System.out.println("value before swapping are=" + d +"and" +d1);
		Swap(a, b);
		Swapd(d, d1);
	}
		
		
	
}

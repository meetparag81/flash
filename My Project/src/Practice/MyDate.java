package Practice;

public class MyDate 
{
 int day;
 int month;
 int year;


public void enterDate(int d, int m, int y)
{
	this.day = d;
	this.month = m;
	this.year = y;
}
public void enterDate()
{
 this.day = 01;
 this.month = 04;
 this.year= 1965;
}

@Override
public String toString()
{
	return "MyDate [day=" + day + ", month=" + month + ", year=" + year + "]";
}
public static void main(String[] args)
{
MyDate d = new MyDate();
System.out.println(d);
}
}


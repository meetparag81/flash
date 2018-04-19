package Exercise;


class MyDate
{
	private int date, month, year;
	
	public void enterDate(int d, int m, int y)
	{
		date = d;
		month = m;
		year = y;
	}
	public void enterDate()
	{
	 this.date = 01;
	 this.month = 04;
	  this.year= 1965;
	}
	
	public void showDate()
	{
		System.out.println("Date is: " + date + "/" + month + "/" + year);
	}
	
	public static void main(String[] args) 
	{
	MyDate d= new MyDate();
	d.enterDate(10, 04, 1981);
	d.showDate();
	MyDate d1= new MyDate();
	}
}
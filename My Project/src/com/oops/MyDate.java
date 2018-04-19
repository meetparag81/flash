package com.oops;

public class MyDate 
{
	private int date;
	private int month;
	private int year;
	
	public MyDate(int date, int month, int year)
	{
	this.date = date;
	this.month = month;
	this.year = year;
			
	}
	public int getDate()
	{
		return date;
	}
	
	public void setDate()
	{
		this.date = date;
	}
	public int getMonth()
	{
		return month;
	}
	public void setMonth()
	{
		this.month = month;
	}
	public int getyear()
	{
		return year;
	}
	public void setyear()
	{
		this.year = year;
	}
		
	
@Override
	public String toString() 
		{
	
		return "MyDate [" + date + "/ " + month + "/"+ year+" ]";
		}
public static void main(String[] args) 
	{
		MyDate d1 = new MyDate(04, 02, 2001); 
		System.out.println(d1);
	}
}
	
	
	


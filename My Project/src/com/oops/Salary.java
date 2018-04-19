package com.oops;

public class Salary 
{

	private double basic;
	private double hra;
	private double da;
	
	public Salary()
	{
		
	}
	public Salary(double basic)
	{
		this.basic = basic;
		this.hra = basic*0.4;
		this.da = basic*0.2;
		
	}
	
	
	public double getBasic()
	{
		return basic;
	}
	public void setBasic(double basic) 
	{
		this.basic = basic;
	}
	public double getHra()
	{
		return hra;
	}
	public void setHra(double hra)
	{
		this.hra = hra;
	}
	public double getDa()
	{
		return da;
	}
	public void setDa(double da)
	{
		this.da = da;
	}
	
	
	@Override
	public String toString() 
	{
		return "Salary [basic=" + basic + ", hra=" + hra + ", da=" + da + "]";
	}
	
	
	
}

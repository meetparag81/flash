package com.oops;

public class DailyWorker extends Employee 
{
	private static MyDate empSalary;
	private double workHrs;
	private double ratePerHr;
	
	public  <Address> DailyWorker(String empName, double workHrs, double ratePerHr, Address empAddress, MyDate empBirthDate)
	{	
		super.setEmpName("Daily employee");
		Employee.count++;
		super.setCount(count);
		this.workHrs = workHrs;
		this.ratePerHr = ratePerHr;
		super.setEmpAdress(empAdress);
	}

	@Override
	public double calculateSalary() 
	{
		return workHrs * ratePerHr;
	}
}

package com.oops;

public class MyEmployee 
{
	public static void main(String[] args) 
	{
		Employee[] employee = new Employee[3];
		
		employee[0] = new Employee(0, "Employeenew", new MyDate(10, 10, 1983), new MyDate(25,05,2010), new Salary(25000), new Adress());
				
		employee[1] = new Manager("Manager", new MyDate(10, 10, 1980),new MyDate(11, 11, 2016), new Salary(30000), new Adress(), 0);
		
		employee[2] = new DailyWorker("Daily Worker",30,5000, new Adress(101,"shastriroad","pune",411011), new MyDate(10,10,1983));
				
Employee.getAllEmployeeDetails(employee);// static method used, generally used by adding class name.method name
	}
}
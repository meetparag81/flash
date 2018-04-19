package com.oops;

public class Employee
{
	private int empId;
	private String empName;
	private MyDate empBirthDate;
	private MyDate empJoiningDate;
	private Salary empSalary;
	Adress empAdress;
	static int count = 100;
	
	public Employee()
	{
		super();
	}
	public Employee(int empId, String empName,MyDate empBirthDate,MyDate empempJoiningDate,Salary empSalary, Adress empAdress)
	{
		count++;
		this.empId = count;
		this.empName = empName;
		this.empBirthDate = empBirthDate;
		this.empJoiningDate = empempJoiningDate;
		this.empSalary = empSalary;
		this.empAdress = empAdress;
		
	}
	public double calculateSalary()
	{
		return empSalary.getBasic() + empSalary.getDa() + empSalary.getHra();
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public MyDate getEmpBirthDate() {
		return empBirthDate;
	}
	public void setEmpBirthDate(MyDate empBirthDate)
	{
		this.empBirthDate = empBirthDate;
	}
	public MyDate getEmpJoiningDate()
	{
		return empJoiningDate;
	}
	public void setEmpJoiningDate(MyDate empJoiningDate)
	{
		this.empJoiningDate = empJoiningDate;
	}
	public Salary getEmpSalary()
	{
		return empSalary;
	}
	public void setEmpSalary(Salary empSalary)
	{
		this.empSalary = empSalary;
	}
	public Adress getEmpAdress()
	{
		return empAdress;
	}
	public void setEmpAdress(Adress empAdress)
	{
		this.empAdress = empAdress;
	}
	public static int getCount()
	{
		return count;
	}
	public static void setCount(int count) 
	{
		Employee.count = count;
	}
	public static void getAllEmployeeDetails(Employee employee[])
	{
		System.out.println("All employee details are: ");
		System.out.println("----------------------------------\n");
		for(Employee e : employee)
		{
			System.out.println("Emp. ID: " + e.getEmpId());
			System.out.println("Name: " + e.getEmpName());
			System.out.println("Salary: " + e.calculateSalary());
			if(e instanceof Manager)
			{
				System.out.println("Special Allowance is: " + ((Manager) e).getSpecialAllowance());
			}
			System.out.println("Address: " +  e.empAdress);
			System.out.println("BirthDate: " + e.getEmpBirthDate());
			
			System.out.println();
		}
	}
}
	


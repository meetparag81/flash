package com.oops;

public class Manager extends Employee 
{
	private double specialAllowance;

	public Manager(String empName, MyDate empBirthDate, MyDate empJoiningDate, Salary empSalary,
			Adress empAddress, int empId) 
	{
		super(empId, empName,empBirthDate,empJoiningDate,empSalary, empAddress);
	}

	@Override
	public double calculateSalary() 
	{
		this.specialAllowance = super.getEmpSalary().getBasic() * 0.3;
		return super.calculateSalary()+ specialAllowance;
	}

	public double getSpecialAllowance() 
	{
		return specialAllowance;
	}

	public void setSpecialAllowance(double specialAllowance) {
		this.specialAllowance = specialAllowance;
	}
	
}
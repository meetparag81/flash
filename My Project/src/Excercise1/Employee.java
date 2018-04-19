package Excercise1;

public class Employee 
{
	int EmpId;
	double basic,hra,da;
	String empname;
public Employee(int EmpId,double basic,String empname)
	{
		this.EmpId = EmpId;
		this.empname = empname;
		this.basic = basic;
		this.hra = basic*0.4;
		this.da = basic*0.2;
	}
	@Override
	public String toString()
	{
	return "Employeenew [EmpId=" + EmpId + ", basic=" + basic + ", hra=" + hra + ", da=" + da + ", empname=" + empname
			+ "]";
	}


	
public double calculatesalary()
	{
		return basic+ hra+da;
	}

}

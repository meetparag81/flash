package Exercise;

public class Employee
{
private int empID;
private String empName;
private double empSalary; 
private static int empCount=100;
	public Employee()
	{
	this.empID= empCount;
	}
	public Employee(int empID, String empName, double empSalary)
	{
	empCount++;
	this.empID = empCount;
	this.empName = empName;
	this.empSalary = empSalary;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Employee1 [empID=" + empID + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}

}

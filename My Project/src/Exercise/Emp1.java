package Exercise;

public class Emp1 
{
	private int EmpID;
	private String Name;
	private int salary;
	private static int empcount = 100;
	
	public Emp1()
	{
		empcount++;
		this.EmpID= empcount;
		this.Name ="Suresh";
		this.salary = 100000;
	 	
	
	}
	public Emp1(int EmpID, String name, int Salary)
	{
		empcount++;
		this.EmpID = empcount;
		this.Name = name;
		this.salary= 10000;
	}
	
	
	public int getEmpID()
	{
		return EmpID;
	}
	public void setEmpID()
	{
		this.EmpID = EmpID;
	}
	public String getName() 
	{
		return Name;
	}
	public void setName(String name) 
	{
		this.Name = name;
	}
	public int getSalary()
	{
		return salary;
	}
	public void setSalary(int salary) 
	{
		this.salary = salary;
	}
	
	@Override
	public String toString() 
	{
		return "Emp1 [EmpID=" + EmpID + ", Name=" + Name + ", salary=" + salary + "]";
	}
	public static void main(String[] args) 
	{
		Emp1 e = new Emp1();
		Emp1 e1 = new Emp1(100,"parag",20000);
		System.out.println(e);
		System.out.println(e1);
	}

}

package Excercise1;

public class Employee1 
{
	private int empid; 
	private int Basic;
	private double HRA;
	private double da;
	private String name;
	private static int empcount = 100;
	
	
	public Employee1()
	{
		empcount++;
		this.empid= empcount;
		this.name= "Suresh";
		this.Basic= 10000;
	}
	public Employee1(int empid,int Basic,String name)
	{
		empcount++;
		this.empid= empcount;
		this.name= name;
		this.Basic= Basic;
		this.HRA = Basic*0.5;
		this.da = Basic*0.2; 
		
	}
	
	public int getEmpid()
	{
		return empid;
	}
	public void setEmpid(int empid)
	{
		this.empid = empid;
	}
	public int getBasic()
	{
		return Basic;
	}
	public void setBasic(int salary) 
	{
		this.Basic = salary;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	@Override
	public String toString() 
	{
		return "Emp1 [empid=" + empid + ", Basic=" + Basic + ", name=" + name + "]";
	}
	public static void main(String[] args) 
	{
		Employee1 e = new Employee1();	
		Employee1 e1=new Employee1(201, 20000, "parag");
		//System.out.println(e.getEmpid());
		System.out.println(e + "\n" + e1);
		//e1.setEmpid(500);
		System.out.println(Employee1.empcount);// correct syntax because employee count defines to employee class not to data type
	}
}

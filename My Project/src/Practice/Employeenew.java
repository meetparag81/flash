package Practice;

import com.oops.Employee;

public class Employeenew 
{
private static final double Baisic = 0;
private	int EmpID; 
private String Name;
private int Age;
private String Designation;
private double Basic;
 private double HRA;
 private double da;
 public static int count = 100;
 
 public static int EmpCount()
 {
	
	 return count;
}







public Employeenew( )
	{
	count++;
	EmpID = count;
	this.EmpID = EmpID;
	this.Name = "Ganesh";
this.Age = 30;
this.Basic =10000;
this.HRA = 0.4*Basic;
this.da = 0.2*Basic;
this.Designation = "Manager";

}

		public Employeenew(int EmpID,String Name,int Age,String Destination) 
		{
			this.EmpID = EmpID;
			this.Name = Name;
			this.Age = Age;
			this.Designation =Destination;
			this.Basic = Basic;
			this.HRA= HRA;
			this.da = da;
		}
public double calculateSalary() 
{
	HRA = Basic*0.4;
	da = Baisic*0.2;
	 return HRA;
}



		public void setEmpID(int empID)
		{
			EmpID = empID;
		}

		public String getName()
		{
			return Name;
		}

		public void setName(String name) 
		{
			Name = name;
		}

		public int getAge()
		{
			return Age;
		}

		public void setAge(int age) 
		{
			Age = age;
		}

		public String getDesignation() 
		{
			return Designation;
		}

		public void setDesignation(String designation)
		{
			Designation = designation;
		}

		
public double getHRA()
		{
			return HRA;
		}


		public double getBasic()
		{
	return Basic;
}

public void setBasic(double basic)
{
	Basic = basic;
}

public int getEmpID()
{
	return EmpID;
}

		public void setHRA(double hRA)
		{
			HRA = Baisic*0.4;
			
		}

		public double getDa() {
			return da;
		}

		public void setDa(double da) {
			this.da = da;
		}
		
		

@Override
		public String toString() 
		{
			return " [ EmpID=" + EmpID + ", Name=" + Name + ", Age=" + Age
					+ ", Designation=" + Designation + ", Basic=" + Basic + ", HRA=" + this.HRA + ", da=" + this.da +  "]";
		}


public static void main(String[] args)
		{
			Employeenew e = new Employeenew(100,"parag",30,"engieer"); 
			Employeenew e1 = new Employeenew();
			Employee.setCount(count);
			
			System.out.println(e +"\n"+ e1);
			System.out.println(e.calculateSalary());
			System.out.println("Total Employee count="+ Employeenew.EmpCount());
		}
		
}
		

		





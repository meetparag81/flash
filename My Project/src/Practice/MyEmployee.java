package Practice; 

public class MyEmployee 
{
	

	public static void main(String[] args)
	{
		Employeenew emp = new Employeenew();
		Employeenew emp1 = new Employeenew(101,"Manish",60,"Manager");
		
		emp.setEmpID(1);
		emp.setDesignation("Engineer");
		emp.setAge(40);
		emp.setName("Nemur");
		emp.setHRA(1000);

		//System.out.println("Employee details are:"+ emp.getEmpID() + "\n"+ emp.getAge() + "\n"+ emp.getName() + "\n"+ emp.getDesignation() + "\n"+ emp.getHRA());//
		System.out.println("Salary is:"+ emp.calculateSalary());
		System.out.println(emp + "\n" + emp1);
		System.out.println(Employeenew.EmpCount());	
	}
}
		
	

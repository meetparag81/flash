package Exercise;

public class Employeeexecution 
{
	public static void main(String args[]) 
	{
	Employee emp1= new Employee();// default parameter
			
			emp1.setEmpID(101);
			emp1.setEmpName("Parag");
			emp1.setEmpSalary(10000);
			
			
			
			System.out.println("Employee1 details are:"+ "\n"+emp1.getEmpID() + "\n"+emp1.getEmpName()+"\n"+emp1.getEmpSalary());
			System.out.println(emp1);
	}	
				

}


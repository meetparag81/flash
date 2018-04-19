package Practice;

public class Puppy 
 
{
	int puppyAge;
public Puppy(String Name)
	{
	System.out.println("name is:" + Name);
	}
public int getPuppyAge()
{
	System.out.println("Puppy age is :"+puppyAge);
	return puppyAge;
}
public void setPuppyAge(int puppyAge) 
{

	this.puppyAge = puppyAge;
}

public static void  main(String[]args)
{	
Puppy c = new Puppy("Tommy");
c.setPuppyAge(2);
c.getPuppyAge();
System.out.println("Variable Value :" + c.puppyAge);
}



}

package JavaBasic;

public class Java {
	String myvar ="" ;
public void Mymethod()
{
	String myvar = "local";
	System.out.println(myvar);
}
	public static void main(String[] args) 
	{
		Java j = new Java();
		j.Mymethod();
		System.out.println(j.myvar);

	}

}

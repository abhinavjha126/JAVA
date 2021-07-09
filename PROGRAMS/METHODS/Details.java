package METHODS;
class Employee1
{
	int salary;
	String name;

	public int getSalary() 
	{
		return salary;
	}
	public String getName()
	{
		return name;
	}
    public void setName(String n)
    {
    	name=n;
    }
}
public class Details 
{
	public static void main(String[] args) 
	{
		Employee1 Abhinav=new Employee1();
		
		Abhinav.setName("KABALI");
		Abhinav.salary=15000;
		System.out.println(Abhinav.getSalary());
		System.out.println(Abhinav.getName());
	}

}

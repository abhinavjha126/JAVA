package METHODS;
class Employee3
{
	private int salary=20000;
	public Employee3()
	{                               
		salary=15000;                  //CONSTRUCTOR 1               
	}                                                              
	public Employee3(int n)                                        
	{                                                              
		salary=16000;                  //CONSTRUCTOR 2             
	}
    public int getSalary()
    {
    	return salary;
    }
}
public class CONSTRUCTORS
{
	public static void main(String[] args) 
	{
		Employee3 obj=new Employee3(9);
		System.out.println(obj.getSalary());
	}

}

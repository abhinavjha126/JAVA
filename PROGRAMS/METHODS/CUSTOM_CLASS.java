package METHODS;
class Employee
{
	int id1=15;
	String name1;
	void details()
	{
		System.out.println("MY ID IS: "+id1);
		System.out.println("MY NAME IS: "+name1);
	}
}
public class CUSTOM_CLASS 
{
	public static void main(String[] args)
	{
		Employee Harry=new Employee();         //Instantiating a new Employee Object
		System.out.println("This is our new Custom Class");
    	Harry.id1=16;
		Harry.name1="Code With Harry";     
		System.out.println(Harry.id1);
		System.out.println(Harry.name1);
		Harry.details();
	}

}

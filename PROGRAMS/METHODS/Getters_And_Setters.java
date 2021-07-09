package METHODS;
class Employee2
{
	private int id=45;
	private String name="KABALI";

	public String getName() 
	{
		return name;
	}
//	public void setName(String n)
//	{
//		name=n;
//	}
    public int getId()
    {
    	return id;
    }
//    public void setId(int a)
//    {
//    	id=a;
//    }
}
public class Getters_And_Setters
{
	public static void main(String[] args) 
	{
		Employee2 obj=new Employee2();
		//obj.a=14;
		
		//obj.setName("HELLO KABALI");
		System.out.println(obj.getName());
		//obj.setId(37);
		System.out.println(obj.getId());
	}

}

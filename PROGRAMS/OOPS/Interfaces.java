package OOPS;
interface Parent3
{
     public double volume();
	 default void area()
	 {
		 System.out.println("THE AREA ");
	 }
}
interface Rectangle1
{
	public int a=45;
    public double volume1();
    public double area1();
}
class Child3 implements Rectangle1,Parent3
{
	public int a=50;
	Child3()
	{
		System.out.println("I AM A NON PARAMETERISED CONSTRUCTOR OF CYLINDER");
	}
	public double volume()
	{
		return 1;
	}
	public double volume1()
	{
		return 1;
	}
	public double area1()
	{
		return 2;
	}
}
public class Interfaces
{
	public static void main(String[] args) 
	{
		//int a=55;
	Child3 obj=new Child3();
	Parent3 obj1=new Child3();
	Rectangle1 obj2=new Child3();
	System.out.println(obj1.volume());
//	System.out.println(obj1.area());
	System.out.println(obj.a);
	}

}

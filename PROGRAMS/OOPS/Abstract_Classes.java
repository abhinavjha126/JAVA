package OOPS;
/*
 * THIS CLASS IS TO DEMONSTRATE WHAT javadoc is
 * @author Abhinav
 * @version 16.0.2
 * @since 2002
 * @see <a href=https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/util/Calendar.html>Java Docs</a>
 */
abstract class Parent
{
	Parent()
	{
		System.out.println("I AM A NON PARAMETERISED CONSTRUCTOR OF CIRCLE");
	}
	abstract public double volume();
	abstract public double area();
	public double surfacearea()
	{
		return 1;
	}
	
}
class Child2 extends Parent
{
	Child2()
	{
		System.out.println("I AM A NON PARAMETERISED CONSTRUCTOR OF CYLINDER");
	}
	public double volume()
	{
		return 1;
	}
	public double area()
	{
		return 1;
	}
}
class Child5 extends Parent
{
	Child5()
	{
		System.out.println("I AM A NON PARAMETERISED CONSTRUCTOR OF CYLINDER");
	}
	public double volume()
	{
		return 1;
	}
	public double area()
	{
		return 1;
	}
}
public class Abstract_Classes
{
	public static void main(String[] args) 
	{
	//Parent obj1=new Parent();   --->ERROR
	Child2 obj1=new Child2();
	Parent obj=new Child2();
	System.out.println(obj.volume());
	System.out.println(obj1.surfacearea());
	}

}

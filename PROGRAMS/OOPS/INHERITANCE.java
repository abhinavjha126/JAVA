package OOPS;
class Animal
{
	public int a=34;
	protected int b=69;
	int c=45;
	private int d =23;
	public void walk()
	{
		System.out.println("THE ANIMALS HAVE LEG");
		
	}
	public void see()
	{
		System.out.println("THE ANIMALS HAVE EYES");
		
	}
	public void live()
	{
		System.out.println("THE ANIMALS HAVE LIVING");
		
	}
}
class dog extends Animal
{
	public void bark()
	{
		System.out.println("THE DOG BARKS "+c);
		
	}
}
public class INHERITANCE
{
public void main(String[] args)
{
	dog obj1=new dog();
	obj1.bark();			
}
}

package OOPS;
class Circle
{
	int r;
	Circle()
	{
		System.out.println("I AM A DEFAULT CONSTRUCTOR OF CIRCLE");
	}
	Circle(int r)
	{
		this.r=r;
		System.out.println("I AM A NON PARAMETERISED CONSTRUCTOR OF CIRCLE");
	}
	public double area()
	{
		return Math.PI*this.r*this.r;
	}
}
class Cylinder2 extends Circle
{
	int h;
	Cylinder2(int r,int h)
	{
		//super(r);
		this.h=h;
		System.out.println("I AM A NON PARAMETERISED CONSTRUCTOR OF CYLINDER");
	}
	public double volume()
	{
		return Math.PI*this.r*this.r*this.h;
	}
}
public class Cylinder_Extends_Circle 
{
	public static void main(String[] args) 
	{
	//Circle obj=new Circle();
	Cylinder2 obj1=new Cylinder2(5,6);
	System.out.println(obj1.area());
	}

}

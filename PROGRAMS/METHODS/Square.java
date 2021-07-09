package METHODS;
class Square1
{
	int a=14;

	public void sides() 
	{
		System.out.println("Side is: "+a);
	}
	public double area()
	{
		System.out.print("Area is: ");
		return a*a;
	}
    public double perimeter()
    {
    	System.out.print("Perimeter is: ");
    	return 4*a;
    }
}
public class Square 
{
	public static void main(String[] args) 
	{
		Square1 obj=new Square1();
		obj.a=15;
		
		obj.sides();
		System.out.println(obj.area());
		System.out.println(obj.perimeter());
	}

}

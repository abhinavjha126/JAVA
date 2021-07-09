package OOPS;
class Numbers
{
	int a;
	Numbers()
	{
		System.out.println("I AM AN CONSTRUCTOR OF A");
	}
	Numbers(int a)
	{
		System.out.println("I AM AND OVERLOADED CONSTRUCTOR OF A");
	}
	Numbers(int a,int b)
	{
		System.out.println("I AM AND OVERLOADED-OVERLOADED CONSTRUCTOR OF A");
	}
	void Numbers1()
	{
		System.out.println("NUMBER 1");
	}
	void Numbers2(int a)
	{
		System.out.println("NUMBER 2");
	}
	void Numbers3(int a,int b)
	{
		System.out.println("NUMBER 3");
	}
}
class Alphabets extends Numbers
{
	int a;
	void Numbers(int a)              //CONSIDERED AS METHOD
	{
		System.out.println("I AM AND OVERLOADED CONSTRUCTOR OF B");
	}
	Alphabets()
	{
		super(5);
		System.out.println("I AM AN CONSTRUCTOR OF B");
	}
	@Override
	void Numbers2(int a)
	{
		System.out.println("ALPHABETS NUMBERS 2");
	}
	void Alphabets2(int a,int b)
	{
		System.out.println("ALPHABETS 2");
	}
}
public class this_and_super
{
        public static void main(String[] args)
         {
	// Numbers obj=new Numbers();
	 Alphabets obj1=new Alphabets();
//	 obj.Numbers2(6);
//	 obj1.Numbers2(5);
         }
}

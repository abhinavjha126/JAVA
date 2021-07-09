package METHODS;
public class METHOD_OVERLOADING 
{
 void foo()
{
	System.out.println("GOOD MORNING BRO!");
}
 void foo(int a)
{
	System.out.println("GOOD MORNING "+a+" BRO");
}
 int foo(int a,int b)
{
	System.out.println("GOOD MORNING "+a+" BRO");
	System.out.println("GOOD MORNING "+b+" BRO");
	return 3;
}
public static void main(String[] args)
{
	METHOD_OVERLOADING obj=new METHOD_OVERLOADING();
	obj.foo();
	obj.foo(3000);
	obj.foo(3000,4000);
}
}

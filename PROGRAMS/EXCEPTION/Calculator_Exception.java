package EXCEPTION;
import java.util.Scanner;
 class Cannotdivideby0 extends Exception
{
	@Override
	public String toString()
	{
		return "THE NUMBER CANNOT DIVIDE BY ZERO";
	}
}
 class MaxinputException extends Exception
 {
 	@Override
 	public String getMessage()
 	{
 		return "PLEASE ENTER THE SMALLER VALUE";
 	}
 }
public class Calculator_Exception 
{
	public static int addition(int a,int b) throws MaxinputException
	{
			if(a>100000 || b>100000)
			{
				throw new MaxinputException();
			}
			return a+b;
	}
			
	public static int substraction(int a,int b) throws MaxinputException
	{
		try {
			return a-b;
			}
		catch(Exception e)
		{
		   System.out.println(e);
	     }
		return 0;
	}
	public static int multiplication(int a,int b) throws MaxinputException
	{
		if(a>7000 || b>7000)
		{
			throw new MaxinputException();
		}
		return a*b;
	}
	public static int division(int a,int b) throws MaxinputException,Cannotdivideby0
	{
		if(a>100000 || b>100000)
		{
			throw new MaxinputException();
		}
		if(b==0)
		{
			throw new Cannotdivideby0();
		}
		return a/b;
	}
	public static void main(String[] args) throws MaxinputException,Cannotdivideby0
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=sc.nextInt();
		System.out.println("Enter the value of b");
		int b=sc.nextInt();
		sc.close();
     	System.out.println("THE ADDITION VALUE IS "+addition(a,b));
		System.out.println("THE SUBSTRACTION VALUE IS "+substraction(a,b));
		System.out.println("THE MULTIPLICATION VALUE IS "+multiplication(a,b));
		System.out.println("THE DIVISION VALUE IS "+division(a,b));
	    
    }
}

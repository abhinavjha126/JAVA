package my_programs;
import java.util.*;
public class Prime_Numbers 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		sc.close();
		int i;
		if(n==1) 
		{
			System.out.println("Prime starts from 2");
		}
		for(i=2;i<n;i++)
		{
		  if(n%i==0)
		  {
			System.out.println("Number is Not Prime");
		    break;
		  }
		}
		if(n==i)
		{
			System.out.println("Number is Prime");
		}
	}
}




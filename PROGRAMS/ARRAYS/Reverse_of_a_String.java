package ARRAYS;
import java.util.*;
public class Reverse_of_a_String
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE STRING");
		String s=sc.nextLine();
		sc.close();
		String rev="";
		int len=s.length();
		for(int i=len-1;i>=0;i--)
		{
           rev=rev+s.charAt(i);
		}
		System.out.println("THE REVERSED STRING IS: "+rev);
}
}

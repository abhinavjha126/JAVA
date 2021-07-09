package ARRAYS;
import java.util.*;
public class Palindrome
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE STRING");
		String s=sc.nextLine();
		sc.close();
		String s1=s;
		String rev="";
		int len=s1.length();
		for(int i=len-1;i>=0;i--)
		{
           rev=rev+s.charAt(i);
		}
		if(s1.equalsIgnoreCase(rev))
				System.out.println("PALINDROME");
		else
			System.out.println("NOT PALINDROME");
}
}

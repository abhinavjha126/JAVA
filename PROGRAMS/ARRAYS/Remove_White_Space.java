package ARRAYS;
import java.util.*;
class Remove_White_Space
{
	public static void main(String[]args) 
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("ENTER THE STRING");
	    String str=sc.nextLine();
	    sc.close();
		String str1=str.replaceAll(" ","");
		System.out.println("THE REMOVED WHITE SPACE STRING IS\n"+str1);
	}		
	}
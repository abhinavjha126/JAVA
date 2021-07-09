package CONDITIONAL_STATEMENTS;
import java.util.*;
public class General
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
     System.out.println("Enter the value of n");
     int n=sc.nextInt();
     int s=0;
     sc.close();
     for(int i=1;i<=10;i++)
     {
    	 s=s+(n*i);
     }
     System.out.println(s);
}
}

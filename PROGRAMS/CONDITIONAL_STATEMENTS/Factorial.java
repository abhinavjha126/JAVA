package CONDITIONAL_STATEMENTS;
import java.util.*;
public class Factorial 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
     System.out.println("Enter the value of n");
     int n=sc.nextInt();
     sc.close();
     for(int i=1;i<=10;i++)
     {
    	 System.out.format("%d * %d = %d",n,i,n*i);
    	 System.out.println();
     }
}
}

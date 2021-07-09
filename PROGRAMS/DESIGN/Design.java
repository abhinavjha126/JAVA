package DESIGN;
import java.util.Scanner;
public class Design 
{
	public static void main(String[] args) 
	{
     Scanner sc=new Scanner(System.in);
     System.out.println("ENTER THE NUMBER");
     int n=sc.nextInt();
     sc.close();
     for(int i=0;i<n;i++)
    {
	    for(int k=n-i-1;k>=1;k--)
	    {
		   System.out.print(" ");
	    }
	    for(int j=0;j<=i;j++)
	    {
	       System.out.print(i);	
	    }
	    for(int m=1;m<=i;m++)
	    {
	    	System.out.print(i);
	    }
	     System.out.println();
    }
}
}

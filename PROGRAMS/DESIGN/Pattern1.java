package DESIGN;
import java.util.Scanner;
public class Pattern1
{
	static int i;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		sc.close();
		for(i=1;i<=(n/2)+1;i++)
		{
			for(int k=n/2-i+1;k>=1;k--)
			{
            System.out.print(" ");
		    }
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
            System.out.println();
	    }
		for(i=1;i<=(n/2)+1;i++)
		{
          for(int m=1;m<=i;m++)
           {
        	System.out.print(" ");
           }
          for(int s=n/2-i+1;s>=1;s--)
           {
	        System.out.print("* ");
            }
           System.out.println();
	   }
}
}

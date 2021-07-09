package DESIGN;
import java.util.*;
public class Design_1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("ENTER THE NUMBER");
		int n=sc.nextInt();
		sc.close();
		for(int i=1;i<=n/2+1;i++)
		{
			for(int k=n/2-i+1;k>=1;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int m=2;m<=i;m++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=n/2;i++) 
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int j=n/2-i+1;j>=1;j--)
			{
				System.out.print("*");
			}
			for(int m=n/2-i+1;m>=2;m--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

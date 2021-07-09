package DESIGN;
import java.util.Scanner;
public class Pattern3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		sc.close();
		char ch='A';
		for(int i=1;i<=(n/2)+1;i++)
		{
			int m=0;
			int p=-1;
			for(int k=(n/2)-i+1;k>=1;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(ch+m));
				m++;
			}
			p++;
			for(int s=i;s>1;s--)
			{
				System.out.print((char)(ch+p-1));
			}
			System.out.println();
		}
}
}

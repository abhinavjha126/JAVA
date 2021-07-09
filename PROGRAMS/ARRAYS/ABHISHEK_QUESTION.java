package ARRAYS;
import java.util.Scanner;
public class ABHISHEK_QUESTION
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER OF STRING ELEMENTS YOU WANT TO ENTER");
		int n=sc.nextInt();
		String a[]=new String[n];
		System.out.println("ENTER THE STRING");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextLine();
		}
		sc.close();
	}
}

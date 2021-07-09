package general_programs;
import java.util.Scanner;
public class Palindrome
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
				System.out.println("ENTER THE NUMBER");
				int n=sc.nextInt();
				sc.close();
				int t=n;
				int s=0;
				while(n>0)
				{
					s=(s*10)+(n%10);
				    n=n/10;
				}
				    if(s==t)
					System.out.println("NUMBER ENTERED "+t+" IS PALINDROME");
				    else
					System.out.println("NUMBER ENTERED "+t+" IS NOT PALINDROME");
	}

}

package my_programs;
import java.util.Scanner;
public class Even_Odd 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE VALUE OF N");
		int n=sc.nextInt();
		sc.close();
		if(n%2==0)
		{
			System.out.print("NUMBER IS EVEN");
		}
		else
		{
			System.out.print("NUMBER IS ODD");
		}

	}

}

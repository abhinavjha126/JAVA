package Exercise_7;
import java.util.Scanner;
public class Check_Integer_Or_Not 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		boolean a=sc.hasNextInt();
		sc.close();
		if (a==true)
		{
		System.out.println("THE NUMBER ENTERED IS AN INTEGER");
	}
		else
		{
			System.out.println("THE NUMBER ENTERED IS NOT AN INTEGER");
		}
}
}
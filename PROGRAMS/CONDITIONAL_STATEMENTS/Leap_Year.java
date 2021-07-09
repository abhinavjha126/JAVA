package CONDITIONAL_STATEMENTS;
import java.util.Scanner;
public class Leap_Year
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE YEAR");
		int n =sc.nextInt();
		sc.close();
		if(n%4==0 || n%100==0)
			System.out.println("LEAP YEAR");
			else
				System.out.println("NOT A LEAP YEAR");
		}
	}


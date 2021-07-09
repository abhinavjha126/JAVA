package Exercise_7;
import java.util.Scanner;
public class Kilometer_to_miles
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE VALUE OF KILOMETER");
		double d=sc.nextDouble();
		sc.close();
		double m=(d*0.62137);
		System.out.println("VALUE IN MILES: "+m);
	}

}

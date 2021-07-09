package Exercise_7;
public class Sum_of_numbers
{
	public static void main(String[] args)
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("ENTER THE FIRST NUMBER");
		int a=sc.nextInt();
		System.out.println("ENTER THE SECOND NUMBER");
		int b=sc.nextInt();
		System.out.println("ENTER THE THIRD NUMBER");
		int c=sc.nextInt();
		sc.close();
		int d=(a+b+c);
		System.out.println("THE SUM OF THE NUMBERS: ");
		System.out.println(d);	
	}

}

package Exercise_7;
public class Print_Hello
{
	public static void main(String[] args)
	{
	java.util.Scanner sc=new java.util.Scanner(System.in);
	System.out.println("ENTER THE NAME");
	String name =sc.nextLine();
	sc.close();
	System.out.println("Hello "+name+" have a good day");
}
}

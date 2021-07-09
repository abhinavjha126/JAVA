package general_programs;
import java.util.Scanner;
public class Prime_Numbers 
{
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("ENTER THE NUMBER");
	int n=sc.nextInt();
	sc.close();
	if(n==1)
	{
		System.out.println("ENTER NUMBER GREATER THAN 1");
	}
	for(int i=2;i<=n;i++)
	{
		boolean s=true;
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
				s=false;
			break;
		    }
	     }
	   if(s)
		 System.out.print(i+" ");
}
}
}
package METHODS;
import java.util.*;
public class FIBONACCI 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE FIBONACCI LIMIT");
		int n=sc.nextInt();
		int m=0,s=1;
		System.out.print(m+" "+s+" ");
		int sum=0;
		for(int i=1;i<=n;i++)
		{
          sum=m+s;
          System.out.print(sum+" ");
          m=s;
          s=sum;
		}
		sc.close();
	}

}

package DESIGN;
import java.util.Scanner;
public class Pattern4
{
	public static void main(String[] args)
	{
    Scanner sc=new Scanner(System.in);
    System.out.println("ENTER THE NUMBER");
    int n=sc.nextInt();
    sc.close();
    int m=1;
    int o=8;
    for(int i=1;i<=n/2+1;i++)
    {	
	    for(int k=o;k>=1;k--)
	    {
	      System.out.print(" ");
	    }
	    o=o-i;
        for(int j=1;j<i;j++)
        {
	       int s=i-1+m;
           System.out.print(s);
         }
        m=m+i;
        for(int l=1;l<=1;l++)
        {
        	if(i==3)
        	System.out.print(" "+i);
        	else
        		System.out.print(i);
        }
        System.out.println();
	}

}
}
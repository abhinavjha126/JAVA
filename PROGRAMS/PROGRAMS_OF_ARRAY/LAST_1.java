package PROGRAMS_OF_ARRAY;
import java.util.*;
public class LAST_1 
{
	static int[][] abc()
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the Order");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int ar[][]=new int[n][m];
		System.out.println("Enter "+m*n+" Elements");
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}
		return ar;
	}
    static void display(int a[][])
   {
    	for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"("+i+","+j+")");
			}
			System.out.println();
		}
   }
    public static void main(String[] args)
    {
    	int ar[][]=abc();
    	System.out.println("Entered Matrix");
    	display(ar);
    	for(int i=0;i<ar.length;i++)
    	{
    		int rsum=0;
    		int csum=0;
    		for(int j=0;j<ar.length;j++)
    		{
    			rsum+=ar[i][j];
    			csum+=ar[j][i];
    		}
    		System.out.println(i+1+" Row sum is: "+rsum);
    		System.out.println(i+1+" Column sum is: "+csum);
        }
    }
}
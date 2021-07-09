package PROGRAMS_OF_ARRAY;
public class LAST_3 
{
static int[][] abcd()
{
	java.util.Scanner sc=new java.util.Scanner(System.in);
	System.out.println("Enter the Order");
	int n=sc.nextInt();
	int m=sc.nextInt();
	int a[][]=new int[n][m];
	System.out.println("Enter "+n*m+" Elements");
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
		  a[i][j]=sc.nextInt();
	    }
    }
	return a;
}
static void display(int a[][])
{
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			System.out.print(a[i][j]+"("+i+","+j+")"+" ");
		}
		System.out.println();
    }
}
	public static void main(String[] args) 
	{
		int a[][]=abcd();
		System.out.println("Entered Matrix");
		display(a);
	}
}
	

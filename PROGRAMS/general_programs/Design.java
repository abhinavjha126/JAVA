package general_programs;
public class Design 
{
	public static void main(String[] args) 
	{
		int n=4;
		for(int i=1;i<=n;i++)
		{
			for(int j=n-i;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(k);
			}
			for(int m=i-1;m>=1;m--)
			{
				System.out.print(m);
			}
			System.out.println();
		}
		for(int i=1;i<=n-1;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=n-i;k++)
			{
				System.out.print(k);
			}
			for(int m=n-(i+1);m>=1;m--)
			{
				System.out.print(m);
			}
			System.out.println();
	}
}
}

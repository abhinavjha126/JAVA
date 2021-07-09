package CONDITIONAL_STATEMENTS;
import java.util.Scanner;
class TEST1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER OF ELEMENTS YOU WANT TO ENTER");
		int n=sc.nextInt();
		System.out.println("ENTER ALL THE ELEMENTS");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		sc.close();
		int sum=0;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
		     if(a[i]>a[j])
		     {
		    	 int temp=a[i];
		    	 a[i]=a[j];
		    	 a[j]=temp;//{2,3,4,6,8}
			 }
		    }
	    } 
		for(int i=a.length-1;i>0;i--)
		{
			sum=sum+(a[i]-a[i-1]);
	    }
		System.out.println("THE SUM IS:"+sum);
    }
}
  
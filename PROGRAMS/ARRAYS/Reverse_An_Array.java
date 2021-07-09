package ARRAYS;
public class Reverse_An_Array 
{
	public static void main(String[] args)
	{
		int[] a= {1,2,3,4,5,6};
		int b= (int)Math.floorDiv(a.length,2);
		for(int i=0;i<b;i++)
		{
			int temp=a[i];
			a[i]=a[a.length-i-1];
			a[a.length-i-1]=temp;
		}
		for(int x:a)
		{
			System.out.print(x);
		}
	}
}

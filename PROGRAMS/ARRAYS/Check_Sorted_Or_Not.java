package ARRAYS;
public class Check_Sorted_Or_Not
{
	public static void main(String[] args) 
	{
		int[] a= {1,5,36,85,129,5};
		boolean isSorted=true;
		for(int i=0;i<a.length-1;i++)
		{
		     if(a[i]>a[i+1])
		     {
		     isSorted=false;
		     break;
		     }
		}
		if(isSorted)
        System.out.print("ARRAY IS SORTED");
		else
		System.out.println("ARRAY IS NOT SORTED");
	}
}
 
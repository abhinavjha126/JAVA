package ARRAYS;
public class Max_Element_In_Array
{
	public static void main(String[] args)
	{
		int[] a= {13,67,36,35,9,36,46,79,07,38,25};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
        System.out.print(a[a.length-1]);
	} 

}

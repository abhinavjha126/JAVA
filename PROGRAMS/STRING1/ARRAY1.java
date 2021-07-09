package STRING1;
public class ARRAY1
{
public static void main(String[] args)        //ABHINAV JHA
{
	java.util.Scanner sc=new java.util.Scanner(System.in);
	System.out.println("ENTER THE SIZE");
	int a=sc.nextInt();
	int arr[]=new int[a];
	System.out.println("ENTER THE "+a+" ELEMENTS");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<arr.length;i++)
	{
		System.out.println("arr ["+i+"] ----> "+arr[i]);
    }
	}	
}

package PROGRAMS_OF_ARRAY;
public class Palindrome 
{
static void display(int a[])
  {
	for (int i=0;i<a.length;i++)
	  {
	  System.out.print(a[i]+",");
	  }
	System.out.println();
  }
static int rev1(int n)
{
	int rev=0;
	while(n>0)
	{
		int r=n%10;
		rev=rev*10+r;
		n=n/10;
	}
	return rev;
}
public static void main(String[] args)
{
	int a[]= {232,12,78,898,34543,45};
	display(a);
	int count=0;
	for (int i=0;i<a.length;i++)
	{
		if(a[i]==rev1(a[i]))
			count++;
    }
	System.out.println("-----------------------");
	System.out.println("No of palindrome: "+count);
}
}
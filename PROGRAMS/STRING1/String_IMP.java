package STRING1;
public class String_IMP
{
public static void main(String[] args)
    {
	java.util.Scanner sc=new java.util.Scanner(System.in);         //ABHINAV JHA
	System.out.println("Enter the String");
	String a=sc.nextLine();
	sc.close();
	String[] b=a.split(" ");
	System.out.println(b);
	for(int i=0;i<b.length;i++)
	   {
		System.out.println("No. of characters in "+b[i]+" is "+b[i].length());
	   }
	System.out.println();
    }
}

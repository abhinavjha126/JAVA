package ARRAYS;
import java.util.*;
public class Sum_of_Alpha_Numeric_String
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE STRING");
		String s=sc.nextLine();
		char[] ch=s.toCharArray();
		int sum=0;
		sc.close();
		for(int i=0;i<ch.length;i++)
		{
           if(ch[i]>=48 && ch[i]<=57)
           {
        	   sum=sum+ch[i]-48;
           }
		}
System.out.println("THE SUM OF ALPHA NUMERIC STRING IS= "+sum);
}
}

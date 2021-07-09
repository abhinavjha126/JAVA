package ARRAYS;
import java.util.*;
public class Occurence_Of_Each_Character
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE STRING");
		String s=sc.nextLine();
		sc.close();
		char[]ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int count=1;
			if(ch[i]!=' ')
			{
			for(int j=i+1;j<ch.length;j++)
			  {
                  if(ch[i]==ch[j])
                  {
        	   count++;
                ch[j]=' ';
                  }
              }
			}
          System.out.println("THE NUMBER OF TIMES "+s.charAt(i)+" OCCURED IS "+count);
        }
	}
}

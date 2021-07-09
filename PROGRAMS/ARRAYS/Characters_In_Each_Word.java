package ARRAYS;
import java.util.*;
public class Characters_In_Each_Word
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE STRING");
		String s=sc.nextLine();
		String nst="";
		int nc=0;
		sc.close();
		for(int i=0;i<s.length();i++)
		{
           if(s.charAt(i)==' ')
           {
        	   nst=nst+" "+nc+" ";
        	   nc=0;
           }
           else
           {
        	   nc++;
        	   nst=nst+s.charAt(i);
           }
		}
		nst=nst+" "+nc;
System.out.println("THE NUMBER OF CHARACTERS IN EACH WORD IN A STRING IS "+nst);
}
}

package ARRAYS;
import java.util.*;
public class LC_UC_DIGITS_SPACE_SC
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE STRING");
		String s=sc.nextLine();
		sc.close();
		int uc=0,lc=0,digits=0,space=0,sc1=0;
		char[]ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>=65 && ch[i]<=90)
				uc++;
			else if(ch[i]>=97 && ch[i]<=122)
				lc++;
			else if(ch[i]>=48 && ch[i]<=57)
				digits++;
			else if(ch[i]==' ')
					space++;
			else
				sc1++;
		}
		System.out.println("NO. OF UPPERCASE CHARACTERS: "+uc);
		System.out.println("NO. OF LOWERCSE CHARACTERS: "+lc);
		System.out.println("NO. OF DIGITS: "+digits);
		System.out.println("NO. OF SPACES: "+space);
		System.out.println("NO. OF SPECIAL CHARACTERS: "+sc1);
		}
}
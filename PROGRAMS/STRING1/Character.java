package STRING1;
public class Character 
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("ENTER THE STRING");
		String s1=sc.nextLine();
		char[] ch=s1.toCharArray();
		String nst="";
		int nc=0;
		for(int i=0;i<s1.length();i++)                   // PASCAL CONVENTION
		{
			if(s1.charAt(i)==' ')
			{
				nst=nst+" "+nc+" ";
				nc=0;
			}
			else
			{
				nc++;
				nst=nst+s1.charAt(i);
			}
		}
		nst=nst+" "+nc;
		System.out.println("NO OF CHARACTER: "+nst);
	}

}

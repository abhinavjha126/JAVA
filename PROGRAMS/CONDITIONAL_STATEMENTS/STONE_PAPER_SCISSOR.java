package CONDITIONAL_STATEMENTS;
import java.util.Random;
import java.util.Scanner;
public class STONE_PAPER_SCISSOR
{
	public static void main(String[] args) 
	{
     System.out.println("\t\t\t\t\tWELCOME TO THE GAME STONE,PAPER,SCISSOR\n");
     Scanner sc=new Scanner(System.in);
     Random rand=new Random();
     int upperbound=3;
     int count=0;
     int count1=0;
     for(int j=1;j<=5;j++)
     {
     System.out.print("ENTER VALUE FROM THE PLAYER:");
     int n=rand.nextInt(upperbound);
     int i=sc.nextInt();
     String d="";
     String m="";
     String a="STONE";
     String b="PAPER";
     String c="SCISSOR";
    {
    if(i==0)m=a;
          else if(i==1) m=b;
          else if(i==2)m=c;
    if(n==0)d=a;
          else if(n==1)d=b;
          else if(n==2) d=c;
     System.out.println(i+" THAT IS "+ m);
     System.out.println("THE RANDOM NUMBER CHOOSEN BY THE COMPUTER IS "+ n +" THAT IS "+ d);
 	 if(m==a && d==a || m==b && d==b || m==c && d==c)
	 	 {System.out.println("IT'S A TIE,PLAY AGAIN\n");}
 	 else if(m==a && d==b || m==b && d==c || m==c && d==a)
		 {System.out.println("COMPUTER WINS\n");count1=count1+1;}
	 else if(m==a && d==c || m==b && d==a || m==c && d==b)
		 {System.out.println("PLAYER WINS\n");count=count+1;} 
 }
	}
     if(count>count1)
    	 System.out.println("PLAYER WINS THE SERIES BY: "+count+"-"+count1);
     else if(count<count1)
    	 System.out.println("COMPUTER WINS THE SERIES BY: "+count1+"-"+count);
     else if(count==count1)
    	 System.out.println("SERIES TIED: "+count+"-"+count1);
	sc.close();
	}
}

package PROGRAMS_OF_ARRAY;
import java.util.*;
public class LAST_2 
{
static int[][] abc()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the order");
	int n=sc.nextInt();
	int m=sc.nextInt();
	int ar[][]=new int[n][m];
    System.out.println("Enter the "+n*m+" Elements");
    for(int i=0;i<ar.length;i++)
    {
	   for(int j=0;j<ar[i].length;j++)
	    {
	       ar[i][j]=sc.nextInt();
	    }
    }
	return ar;
}
  public static void display(int a[][])
{
	for(int i=0;i<a.length;i++)
    {
	   for(int j=0;j<a[i].length;j++)
	    {
		   System.out.print(a[i][j]+"("+i+","+j+")");
	    }
	   System.out.println();
}
}
     public static void main(String[] args)
     {
    	 int ar[][]=abc();
    	 System.out.println("Entered Matrix");                      //    6(0,0) 8(0,1) 5(0,2)
    	 display(ar);                                               //    5(1,0) 9(1,1) 2(1,2)
    	 System.out.println();
    	 {                                                          //    ar.length=2;
    		 for(int i=0;i<ar.length;i++)                           //    ar[i].length=3;
    		    {
    			   int big=ar[i][0];
    			   for(int j=i;j<ar[i].length;j++)
    			   {
    				  if(big<ar[i][j])
    	              big=ar[i][j];
    				  break;
    		       }
    			   System.out.println("In "+(i+1)+"st Row  Biggest Row Element is "+big);
    	        }
    		 for(int j=0;j<ar[0].length;j++)
    		 {
    			 int big=ar[0][j];
    		     for(int i=0;i<ar.length;i++)
			   {
    			  	if(big<ar[i][j])
    				   big=ar[i][j];
			   }
      					   System.out.println("In "+(j+1)+"st Column the Biggest Column Element is "+big);
 		       }		  
    	}
     }
 }

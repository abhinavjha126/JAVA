package IF_ELSE;
public class Swaping
{
	public static void main(String[] args) 
	{
     int a=10,b=20;
     //1)METHOD 1
     /*
     int t=a;
     a=b;
     b=t;
     System.out.println("THE VALUE OF a IS 10 AND VALUE OF b IS 20 ");
     System.out.println("AFTER SWAPPING,THE VALUE OF a IS "+a+" AND VALUE OF b IS "+b);
     */
     
     //2)METHOD 2
     /*
     a=a+b;
     b=a-b;
     a=a-b;
     System.out.println("THE VALUE OF a IS 10 AND VALUE OF b IS 20 ");
     System.out.println("AFTER SWAPPING,THE VALUE OF a IS "+a+" AND VALUE OF b IS "+b);
     */
     
     //3)METHOD 3
     /*
     a=a*b;
     b=a/b;
     a=a/b;
     System.out.println("THE VALUE OF a IS 10 AND VALUE OF b IS 20 ");
     System.out.println("AFTER SWAPPING,THE VALUE OF a IS "+a+" AND VALUE OF b IS "+b);
     */
     
     //4)METHOD 4
     a=a^b;
     b=a^b;
     a=a^b;
     System.out.println("THE VALUE OF a IS 10 AND VALUE OF b IS 20 ");
     System.out.println("AFTER SWAPPING,THE VALUE OF a IS "+a+" AND VALUE OF b IS "+b);
    //5)METHOD 5
     /*
     b=a+b-(a=b);
     System.out.println("THE VALUE OF a IS 10 AND VALUE OF b IS 20 ");
     System.out.println("AFTER SWAPPING,THE VALUE OF a IS "+a+" AND VALUE OF b IS "+b);
     */
	}

}

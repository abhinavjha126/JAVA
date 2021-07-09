
public class Percentage_of_students 
{
 public static void main(String[] args)
 {
	 java.util.Scanner sc=new java.util.Scanner(System.in);
	 System.out.println("ENTER TOTAL MARKS IN EACH SUBJECT");
	 float t=sc.nextFloat();
	 System.out.println("ENTER NUMBER OBTAINED IN PHYSICS");
	 float a=sc.nextFloat();
	 System.out.println("ENTER NUMBER OBTAINED IN CHEMISTRY");
	 float b=sc.nextFloat();
	 System.out.println("ENTER NUMBER OBTAINED IN BIOLOGY");
	 float c=sc.nextFloat();
	 System.out.println("ENTER NUMBER OBTAINED IN MATHS");
	 float d=sc.nextFloat();
	 System.out.println("ENTER NUMBER OBTAINED IN ENGLISH");
	 float e=sc.nextFloat();
	 sc.close();
	 float r= ((a+b+c+d+e)/(5*t))*100;
	 float s=r/10;
	 System.out.println("PERCENTAGE OBTAINED IS: "+ r);
	 System.out.println("CGPA OBTAINED IS: "+ s);
 }
}

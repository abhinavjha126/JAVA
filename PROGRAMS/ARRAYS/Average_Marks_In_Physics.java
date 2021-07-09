package ARRAYS;
public class Average_Marks_In_Physics
{
	public static void main(String[] args) 
	{
	int[] i= {40,60,98,30,65};
	float sum=0;
	for(int j:i)
	{
	   sum=sum+j;
	}
	float m=sum/i.length;
	System.out.println("THE AVERAGE OF PHYSICS MARKS IS "+m);
    }
}

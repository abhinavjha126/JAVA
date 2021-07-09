package SEARCHING_AND_SORTING;
public class Linear_Search 
{
	public static void main(String[] args) 
	{
	int[] i= {40,60,98,30,65};
	int m=62;
	boolean isInProgram=false;
	for(int j=0;j<i.length;j++)
	{
		if(i[j]==m)
		{
			System.out.println("NUMBER FOUND AT: "+j);
			isInProgram=true;
			break;
		}
	}
	if(isInProgram)
	System.out.println("THE NUMBER IS PRESENT IN THE ARRAY");
	else
		System.out.println("THE NUMBER IS NOT PRESENT IN THE ARRAY");
       }
}

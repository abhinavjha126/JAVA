package METHODS;
public class VarArgs 
{
static int sum(int ...args)
{
	 int result=0;
	for(int x:args)
	{
		result=result+x;
	}
	return result;
}
	public static void main(String[] args)
	{
		System.out.println("THE SUM OF 2 AND 5 IS "+sum(2,5));
		System.out.println("THE SUM OF 2 AND 5 AND 6 IS "+sum(2,5,6));
		System.out.println("THE SUM OF 2 AND 5 AND 18 AND 7 IS "+sum(2,5,18,7));
		System.out.println("THE SUM OF 2 AND 5 AND 6 AND 9 AND 17 IS "+sum(2,5,6,9,17));

	}

}

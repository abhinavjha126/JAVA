package METHODS;
public class FACTORIAL_USING_RECURSION 
{
//static int factorial(int n)                                            //USING RECURSION
//{
//	if(n==0 || n==1)
//		return 1;
//	else
//		return n*factorial(n-1);
//}
public static int factorial(int n)                                            //USING RECURSION
{
	int fact=1;
	while(n>0)
	{
		fact=fact*n;
		n--;
	}
	return fact;
}

	public static void main(String[] args) 
	{
		System.out.println("THE VALUE OF FACTORIAL 6 IS: "+factorial(6));
	}

}

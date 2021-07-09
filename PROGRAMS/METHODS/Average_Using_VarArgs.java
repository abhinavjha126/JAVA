package METHODS;
public class Average_Using_VarArgs 
{
float average(int ...args)
{
	float sum=0;
	for(int x:args)
	{
		sum+=x;
	}
	return sum/args.length;
}
	public static void main(String[] args)
	{
		Average_Using_VarArgs obj=new Average_Using_VarArgs();
		System.out.println("THE AVERAGE OF 5 AND 10 IS "+obj.average(5,10));
		System.out.println("THE AVERAGE OF 5 AND 10 AND 15 IS "+obj.average(5,10,15));
		System.out.println("THE AVERAGE OF 5 AND 10 AND 15 AND 25 AND 30 IS "+obj.average(5,10,15,25,30));
	}

}

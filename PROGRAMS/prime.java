
public class prime 
{
	public static void main(String[] args)
	{
		int n=1;
		for(int i=1;i<n;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
					System.out.println(i+" ");
			}
		}
		
	}

}

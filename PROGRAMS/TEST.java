class Test 
{
	public static void main(String[] args) 
	{
		int[] a= {4,3,3,2,1};
		for(int i=0;i<a.length-1;i++)
		{ 
			for(int j=i+1;j<a.length;j++)
			{
		     if(a[i]>a[j])
		     {
		    	 int temp=a[i];
		    	 a[i]=a[j];
		    	 a[j]=temp;//{1,2,3,3,4}
			 }
		   } 
	   }
		for(int e:a) {
			System.out.println(e);
		}
//		for(int i=a.length-1;i>=0;i--)
//		{
//			sum=sum+Math.abs(a[i]-a[i-1]);
//	    }
//
//		System.out.println("THE SUM IS:"+sum);
}
}
  
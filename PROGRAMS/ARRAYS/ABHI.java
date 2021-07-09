package ARRAYS;
public class ABHI
{
	public static void main(String[] args) 
	{
      String[] st= {"ABHINAV","PRIYA","AAPARNA","PRIYA","ABHISHEK"};
      for(int i=0;i<st.length;i++)
      {
    	for(int j=i+1;i<st[i].length();i++)
    	{
        if(st[i].charAt(i)>st[j].charAt(i))
        {
        	String temp=st[i];
        	st[i]=st[i+1];
        	st[i+1]=temp;   //{"ABHINAV","APARNA","PRIYA","PRIYA"}
        }
      System.out.println(st[i]);
       }
      System.out.println(st[4]);
      }
//      int count=1;
//      for(int i=0;i<st.length;i++)
//      {
//    	  for(int j=i+1;j<st.length;j++)
//    	  {
//           if(st[i].equals(st[j]))
//            {   
//        	     st[j]="";
//        	    count++;
//            }
//    	  }
//    	   if(st[i]!="")
//           System.out.println(st[i]+" "+count);
//    	   else
//           System.out.println();	
//      }
	}
}
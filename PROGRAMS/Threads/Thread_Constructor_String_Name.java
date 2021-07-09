package Threads;
class MyThr1 extends Thread
{
     MyThr1 (String name)
	{
		super(name);
		System.out.println("I AM A CONSTRUCTOR");
	}
	public void run()
	{
		while(true)
		{
			System.out.println("I AM AN OVERRIDING METHOD");
		  try
		    {
		     Thread.sleep(2000);
		    }
		  catch(InterruptedException e)
		 {
			System.out.println(e);
		 }
//		System.out.println("I AM AN OVERRIDING METHOD");
	     }
     }
}
public class Thread_Constructor_String_Name 
{
	public static void main(String[] args)
	{
		MyThr1 bullet1=new MyThr1("ABHINAV");
		bullet1.start();
//        System.out.println("THE ID OF THE Thread IS: "+bullet1.getId());
//        System.out.println("THE NAME OF THE Thread IS: "+bullet1.getName());
	}

}

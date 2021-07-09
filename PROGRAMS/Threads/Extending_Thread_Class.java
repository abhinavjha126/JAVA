package Threads;
class Abc extends Thread
{
	public void run()
	{
		int i=0;
		while (i<2)
		{
			try
		    {
		     Thread.sleep(200);
		    }
		  catch(InterruptedException e)
		 {
			System.out.println(e);
		 }
			System.out.println("MY COOKING THREAD IS RUNNING");
			i++;
		}
			
	}
}
class Abcd extends Thread
{
	public void run()
	{
		int i=0;
		while (i<2)
		{
			 try
			    {
			     Thread.sleep(2500);
			    }
			  catch(InterruptedException e)
			 {
				System.out.println(e);
			 }
			System.out.println("I AM SAD");
			i++;
		}
			
	}
}
public class Extending_Thread_Class 
{
	public static void main(String[] args)
	{
		Abc t1=new Abc();
		Abcd t2=new Abcd();
		t1.start();
//		try
//		{
//			t1.join();
//		}
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}
		
//		t1.setPriority(Thread.MAX_PRIORITY);
//		System.out.println(t1.getPriority());
		System.out.println(t2.getState());
		t2.start();
		System.out.println(t2.getState());
//          System.out.println("THE ID OF THIS THREAD t1 IS: "+t1.getId());
//          System.out.println("THE ID OF THIS THREAD t2 IS: "+t2.getId());
//         System.out.println("THE NAME OF THIS THREAD t1 IS: "+t2.getName());
	}
}

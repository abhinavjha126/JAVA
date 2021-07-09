package Threads;
class MyThreads3 implements Runnable
{
	public void run()
	{
		int i=1;
		while(i<5)
		{
		System.out.println("HI I AM RUNNABLE OF MyThreads3");
		i++;
		}
	}
}
class MyThreads4 implements Runnable
{
	public void run()
	{
		int i=1;
		while(i<5)
		{
		System.out.println("HI I AM RUNNABLE OF MyThreads4");
        i++;
		}
	}
}
public class Implementing_Runnable_Interface 
{
	public static void main(String[] args) 
	{
		MyThreads3 bullet1=new MyThreads3();
		Thread gun1=new Thread(bullet1);
		
		MyThreads4 bullet2=new MyThreads4();
		Thread gun2=new Thread(bullet2);
		
		gun1.start();
		gun2.start();

	}
}

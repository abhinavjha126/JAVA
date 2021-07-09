package Threads;
class Mythr5 extends Thread
{
	Mythr5(String name)
	{
		super(name);
	}
	@Override
	public void run()
	{
		int i=1;
		while(i<2)
		{
			System.out.println("THE THREAD IS: "+this.getName());
			i++;
		}
	}
	
}
public class Thread_Priorities 
{
public static void main(String[] args)
{
	Mythr5 t1=new Mythr5("BATESHWAR123456789987654321");
	Mythr5 t2=new Mythr5("RANJU");
	Mythr5 t3=new Mythr5("APARNA");
	Mythr5 t4=new Mythr5("PRIYA");
	Mythr5 t5=new Mythr5("ABHINAV");
	t1.setPriority(Thread.MAX_PRIORITY);
	t5.setPriority(Thread.MIN_PRIORITY+1);
	System.out.println(t1.getPriority());
	System.out.println(t2.getPriority());
	System.out.println(t3.getPriority());
	System.out.println(t4.getPriority());
	System.out.println(t5.getPriority());
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	t5.start();	
}
}

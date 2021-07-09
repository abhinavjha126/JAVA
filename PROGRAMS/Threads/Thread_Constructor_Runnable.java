package Threads;
class MyThr12 implements Runnable
{
	 int r;
     MyThr12 (int r)
	{
		this.r=r;
		System.out.println("I AM A CONSTRUCTOR: "+r);
	}
	public void run()
	{
		System.out.println("I AM AN OVERRIDING METHOD");
	}
}
public class Thread_Constructor_Runnable
{
	public static void main(String[] args)
	{
		MyThr12 bullet1=new MyThr12(5);
		Thread t1=new Thread(bullet1);
		MyThr12 bullet2=new MyThr12(5);
		Thread t2=new Thread(bullet1);
		t1.start();
        System.out.println("THE ID OF THE Thread IS: "+t1.getId());
        System.out.println("THE NAME OF THE Thread IS: "+t1.getName());
        t2.start();
        System.out.println("THE ID OF THE Thread IS: "+t2.getId());
        System.out.println("THE NAME OF THE Thread IS: "+t2.getName());

	}

}

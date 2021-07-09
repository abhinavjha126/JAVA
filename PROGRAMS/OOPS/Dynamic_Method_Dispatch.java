package OOPS;
class Phone
{
	void time()
	{
		System.out.println("IT'S 8 AM");
	}
	void on()
	{
		System.out.println("WELCOME MY PHONE IS ON");
	}
}
class Smartphone extends Phone
{
	@Override
	void on()
	{
		System.out.println("WELCOME MY SMARTPHONE IS ON");
	}
	void music()
	{
		System.out.println("PLAY MUSIC");
	}
}
public class Dynamic_Method_Dispatch
{
	public static void main(String[] args)
	{
		Phone obj5=new Phone();
		Phone obj=new Smartphone();
		obj.on();
		obj.time();
		obj5.time();
		//obj.music();
	}
}

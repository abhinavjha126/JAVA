package my_programs;
public class Celcius_To_Fahrenheit
{
	static double temp(float n)
	{
		 double f=n*1.8000+32.00;
		 return f;
	}
	public static void main(String[] args)
	{
		System.out.println("THE FAHRENHEIT TEMPERATURE IS:"+ temp(10));

	}

}

package GENERICS;

import java.util.ArrayList;

public class Generics 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> a=new ArrayList<>();
		a.add(65);
		a.add(45);
		try {
		int b=a.get(10);
		System.out.println(b);
		}
		catch(Exception e)
		{
			System.out.println("Index kum daal laude");
		}
		

	}

}

package COLLECTION;
import java.util.*;
public class ArrayList_COLLECTIONN 
{
	public static void main(String[] args) 
	{
//		ArrayList<Integer> l1=new ArrayList<>();
//		l1.add(0,6);
//		l1.add(0,7);
//		l1.add(1,4);
//		l1.add(1,9);
//		l1.add(0,5);
//		l1.add(0,2);
		ArrayList<Integer> l1=new ArrayList<>();
		ArrayList<Integer> l2=new ArrayList<>();
		l2.add(14);
		l2.add(0,25);
		l2.add(0,65);
		
		l1.add(6);
		l1.add(7);
		l1.add(0,5);
		l1.add(0,2);
		l1.addAll(l2);
		System.out.println(l1.contains(3));
		System.out.println(l1.clone()); 
    	l1.ensureCapacity(500);
//		l1.clear();
		System.out.println(l1.size());
		System.out.println(l1.indexOf(66));
		l1.trimToSize();
		System.out.println(l1.size());
		l1.remove(1);
//		l1.add(1,5);
		for(int i=0;i<l1.size();i++)
		{
			System.out.print(l1.get(i));
			System.out.print(",");
			
		}
	}
}

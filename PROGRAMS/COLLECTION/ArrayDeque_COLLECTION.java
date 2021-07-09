package COLLECTION;
import java.util.*;
public class ArrayDeque_COLLECTION 
{
	public static void main(String[] args)
	{
		ArrayDeque<Integer> l1=new ArrayDeque<>();
		ArrayDeque<Integer> l2=new ArrayDeque<>();
	l2.add(15);
	l2.add(25);
	l2.add(65);
	
	l1.add(6);
	l1.add(7);
	l1.add(5);
	l1.add(2);
	l1.addAll(l2);
	l1.addFirst(0);
	l1.offer(11);
	l1.clear();
//	l1.poll();
//	System.out.println(l1.listIterator(0));
	System.out.println(l1.getLast());
	System.out.println(l1.contains(3));
	System.out.println(l1.clone()); 
//	l1.ensureCapacity(500);                -------->NOT AVAILABLE IN LINKEDLIST
//	l1.clear();
	System.out.println(l1.size());
//	System.out.println(l1.indexOf(66));
//	l1.trimToSize();                         --------->NOT AVAILABLE IN LINKEDLIST
	System.out.println(l1.size());
	l1.remove(1);
//	l1.add(1,5);
//	for(int i=0;i<l1.size();i++)
//	{
//		System.out.print(l1.get(i));
//		System.out.print(",");
//
//     }
	}
}

package OOPS;
 class Monkey
{
	 void Jump()
	 {
		 System.out.println("MONKEYS JUMP");
	 }
    void Bite()
    {
	     System.out.println("MONKEYS BITE");
    }
}
 interface basicAnimal
 {
	 void eat();
	 void sleep();
 }
 class Human extends Monkey implements basicAnimal
{
	 @Override
	 public void eat()
	{
		System.out.print("BASIC ANIMALS EAT");
	}
	 @Override
	 public void sleep()
	 {
		 System.out.println("BASIC ANIMALS SLEEP");
	 }
}
public class Excercise_Abstract_Class 
{
public static void main(String[] args)
{
	Human obj=new Human();
//	obj.eat();
}
}

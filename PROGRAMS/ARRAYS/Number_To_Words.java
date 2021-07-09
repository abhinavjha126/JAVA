package ARRAYS;
import java.util.*;
public class Number_To_Words   
{
static String one[]= {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty"};
static String two[]= {"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
static void pw(int n,String st)
{
	if(n<=19)
		System.out.print(one[n]+" ");
	else
		System.out.print(two[n/10]+" "+one[n%10]+" ");
	if(n!=0)
		System.out.print(st+" ");
}
public static void main(String[] args)
{
	System.out.println("ENTER THE NUMBER");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	sc.close();
	pw(num/10000000,"crores");
	pw((num/100000)%100,"Lakhs");
	pw((num/1000)%100,"Thousand");
	pw((num/100)%10,"Hundred");
	pw(num%100,"");
}
}
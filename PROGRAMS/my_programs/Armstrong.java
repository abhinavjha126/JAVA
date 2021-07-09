package my_programs;
import java.util.Scanner;
import java.lang.Math;
public class Armstrong 
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number");
	int n=sc.nextInt();
	sc.close();
	int on=n;
	int count=0;
	double sum=0;
	while(n!=0)
	{
		int r=n%10;
		count++;
	}
	n=on;
	while(n!=0)
	{
		int r=n%10;
        sum=sum+ Math.pow(r,count);
        n=n/10;
	}
	if(on==sum)
    System.out.println("ARMSTRONG NUMBER");
	else
		System.out.println("NOT A ARMSTRONG NUMBER");
	}

}

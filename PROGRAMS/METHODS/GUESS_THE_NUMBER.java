package METHODS;
import java.util.Random;
import java.util.*;
class Game1
{
    private int num;
    int ui;
    int guess;
    int count=0;
    public Game1()
	{              
		Random rand=new Random();
		num=rand.nextInt(100);
	}                   
    public void takeUserInput()
    {
    	Scanner sc=new Scanner(System.in);
		ui=sc.nextInt();
		sc.close();
    }
    public int isCorrectNumber()
    {
    	Scanner sc=new Scanner(System.in);
    	if(num==ui)
    		System.out.println("Number Matched");
        if(ui>num)
        {
    		System.out.println("Number is Greater");
    		count++;
    			ui=sc.nextInt();
        }
    	if(ui<num)
    	{
            System.out.println("Number is Smaller");
            count++;
            ui=sc.nextInt();
        }
    	sc.close();
    	return count;
     }
    public int getGuess()
    {
    	return guess;
    }
    public void setGuess()
    {	
    	guess=count;
    }
public class GUESS_THE_NUMBER
{
	public void main(String[] args) 
	{	
	    System.out.println("The number of gusses is: "+getGuess());
	}

}
}

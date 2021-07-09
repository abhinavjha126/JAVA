package OOPS;
import java.util.Random;
import java.util.Scanner;
class Game1
{
    public int number;
    public int inputNumber;
    public int noOfGuesses=0;
    
//    public int getnoOfGuesses()
//    {
//    	return noOfGuesses;
//    }
//    public void setnoOfGuesses(int noOfGuesses)
//    {	
//    	this.noOfGuesses=noOfGuesses;
//    }
    public Game1()                                    //CONSTRUCTORS HAVE NO RETURN TYPE
	{              
		Random rand=new Random();
		this.number=rand.nextInt(100);
	}                   
    void takeUserInput()
    {
    	System.out.println("Guess the number");
    	Scanner sc=new Scanner(System.in);
		this.inputNumber=sc.nextInt();
    }
    boolean isCorrectNumber()
    {
    	noOfGuesses++;
    	if(inputNumber==number)
    	{
           System.out.format("Yes,you guessed it right,it was %d\n You guessed it in %d attempts",number,noOfGuesses);
           return true;
    	}
    	else if(inputNumber<number)
        {
    		System.out.print("Too Low...");
        }
        else if(inputNumber>number)
    	{
        	System.out.print("Too High...");
        }
    	return false;
    }
}
    
public class Game
{
	public static void main(String[] args) 
	{	
		
		Game1 g=new Game1();
		boolean b=false;
		while(!b)
		{
			g.takeUserInput();
			b=g.isCorrectNumber();
	        System.out.println();
	}
 }
}

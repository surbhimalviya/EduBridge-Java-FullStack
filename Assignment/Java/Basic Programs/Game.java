import java.util.*;
class Game
{
	public int number;
	public int inputNumber;
	public int noOfGuesses =0;
	
	public int getNoOfGuesses()
	{
		return noOfGuesses;
	}
public void setNoOfGuesses(int noOfGuesses)
{
	this.noOfGuesses= noOfGuesses;
}
Game()
{
	Random rand =new Random();
	this.number = rand.nextInt(15);
}
void takeUserInput(){
	System.out.println("Guess the number: ");
	Scanner sc=new Scanner(System.in);
	inputNumber =sc.nextInt();
	sc.close();
}
boolean isCorrectNumber()
{
	noOfGuesses++;
	if (inputNumber==number)
	{
	System.out.format("yes you guessed it right " +number +noOfGuesses);
	return true;
	}
	else if (inputNumber<number)
	{
		System.out.println("Too low");
	}
	else if(inputNumber>number)
	{
		System.out.println("Too high");
	}
	return false;
}
}
public class GamePrgm
{
	public Static void main(String[] args)
	{
		Game g=new Game();
		boolean b= false;
		while(b)
		{
			g.takeUserInput();
			b= g.isCorrectNumber();
		}
	}
}

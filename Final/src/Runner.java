
public class Runner
	{
	public static void main(String[] args)
		{
		TheMan.makeArray();
		TheMan.choosePhrase();
		TheMan.makeBlankArray();
		while (!TheMan.isGameOver) 
			{			
			TheMan.display();
			System.out.println(TheMan.phrase);
			TheMan.printBlanks();
			TheMan.askForGuess();
			TheMan.killMan();
			TheMan.check();
			}
		if (TheMan.numberOfLetters == 1)
			{
			System.out.println("You win! Good job!");
			}
		else if (TheMan.counter == 6)
			{
			System.out.println("You lose. Sorry");
			}
		}
	}

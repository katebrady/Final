
public class Runner
	{
	public static void main(String[] args)
		{
		TheMan.makeArray();
		TheMan.choosePhrase();
		TheMan.makeBlankArray();
		TheMan.display();
		TheMan.printBlanks();
		while (!TheMan.isGameOver) 
			{			
			System.out.println(TheMan.phrase);
			TheMan.askForGuess();
			TheMan.display();
			TheMan.killMan();
			TheMan.check();
			TheMan.printBlanks();
			TheMan.guessWholePhrase();
			}
		if (TheMan.numberOfLetters == 1)
			{
			System.out.println("You win! Good job!");
			}
		else if (TheMan.counter == 6)
			{
			System.out.println("You lose. Sorry");
			}
		else 
			System.out.println("YOu guessed it");
		}
	}

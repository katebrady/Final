
public class Runner
	{
	public static void main(String[] args)
		{
		Phrase.stuff();
		System.out.println();
		TheMan.makeArray();
		TheMan.makeBlankArray();
		TheMan.display();
		TheMan.printBlanks();
		while (!TheMan.isGameOver) 
			{			
			TheMan.askForGuess();
			TheMan.killMan();
			TheMan.display();
			TheMan.check();
			TheMan.printBlanks();
			TheMan.guessWholePhrase();
			}
		if (TheMan.numberOfLetters == 0)
			{
			System.out.println("You win! Good job!");
			}
		else if (TheMan.counter == 6)
			{
			System.out.println("You lose. Sorry. The phrase was: " + Phrase.thePhrase.substring(0,1) + Phrase.thePhrase.substring(1,Phrase.thePhrase.length()).toLowerCase());
			}
		else 
			System.out.println("YOu guessed it");
		}
	}

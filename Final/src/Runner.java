
public class Runner
	{
	public static void main(String[] args)
		{
		PlayerWord.playerChoosesWord();
		PlayerWord.printPlayerBlanks();
		System.out.println();
		TheMan.makeArray();
		TheMan.choosePhrase();
		TheMan.makeBlankArray();
		TheMan.display();
		TheMan.printBlanks();
		while (!TheMan.isGameOver) 
			{			
			System.out.println(TheMan.phrase);
			TheMan.askForGuess();
			TheMan.killMan();
			TheMan.display();
			TheMan.check();
			TheMan.printBlanks();
			
			}
		if (TheMan.numberOfLetters == 0)
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

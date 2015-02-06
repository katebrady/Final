
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
		System.out.println(":YIu");
		}
	}

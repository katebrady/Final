import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class TheMan
	{
	static ArrayList  blankArray = new ArrayList();
	static boolean isGameOver = false;
	static String guess;
	static int numberOfLetters;
	static String man[] = new String [6];
	static String arrayOne[] = {"DOG","FAIRY","ZEBRA","PENCIL","PRETZEL"};
	static String arrayTwo[] = {"SMELLS","LOOKS","IS","SEEMS","APPEARS"};
	static String arrayThree[] = {"GOOD","HEALTHY","LIVELY","INCREDIBLE","SALTY"};
	static String correctGuess;
	static String wrongGuess;
	static int counter;
	static int counter3;
	static String phraseGuess;
	static String[] alphabet = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	static ArrayList correctGuesses = new ArrayList();
	static ArrayList realArray = new ArrayList();
	static ArrayList anotherArray = new ArrayList();
	static ArrayList wholeGuessArray = new ArrayList();
	public static void makeArray()
		{
		for(int i = 0; i < man.length; i++)
			{
			man[i] = "";
			}
		}
	public static void display()
		{
		System.out.println("-----|");
		System.out.println("|" + "    |");
		System.out.println("| " + "   __");
		System.out.println("|" + man[0]);
		System.out.println("|" + man[2] + man[1] + man[3]);
		System.out.println("|" + man[4] + man[5] );
		System.out.println("|_________");
		System.out.println();
		}
	public static void makeBlankArray()
		{
		String first = Phrase.phrase.get(Phrase.randomNumber).getFirstWord();
		String second = Phrase.phrase.get(Phrase.randomNumber2).getSecondWord();
		String third =  Phrase.phrase.get(Phrase.randomNumber3).getThirdWord();
		for (int i = 0; i < first.length(); i++)
			{
			blankArray.add(first.substring(i, i+1));
			}
		for (int i = 0; i < second.length(); i++)
			{
			blankArray.add(second.substring(i, i+1));
			}
		for (int i = 0; i < third.length(); i++)
			{
			blankArray.add(third.substring(i, i+1));
			}
		for (int i = 0; i < blankArray.size(); i++)
			{
			anotherArray.add(blankArray.get(i));
			}
		Collections.sort(blankArray);
		for (int i = 0; i < alphabet.length; i++)
			{
			if (blankArray.contains(alphabet[i]))
				realArray.add(alphabet[i]);
			}
		}
	public static void printBlanks()
		{
		for(int i = 0; i < Phrase.thePhrase.length(); i++)
			{
			if (correctGuesses.contains(Phrase.thePhrase.substring(i, i+1)))	
				{
				System.out.print(Phrase.thePhrase.substring(i, i+1));
				}
			else if (!Phrase.thePhrase.substring(i, i+1).equals(" "))	
				System.out.print("_ ");
			else 
				System.out.print("  ");
			}
		System.out.println();
		}
	public static void askForGuess()
		{
		System.out.println();
		if (! (counter3 == 0))
			{
			System.out.println("These are the letters you have already guessed: " + correctGuesses);
			}
		Scanner userInput = new Scanner(System.in);
		System.out.println("What is your guess?");
		guess = userInput.nextLine().toUpperCase().replace(" ","");
		counter3++;
		for(int i = 0; i < alphabet.length; i++)
			{
			if (guess.equals(alphabet[i]))
				{
				if (correctGuesses.contains(guess))
					{
					wrongGuess = guess;
					}
				else if ((realArray.contains(guess)))
					{
					correctGuess = guess;
					correctGuesses.add(correctGuess);
					realArray.remove(correctGuess);
					}
				}
			}
		if (guess.equals(wrongGuess))
			{
			System.out.println("No, you already did that.");
			counter = counter + 1;
			}
		else if (guess.equals(correctGuess))
			{
			System.out.println("Nice one!");
			}
		else 
			{
			System.out.println("No.");
			counter = counter + 1;
			}
		}
	public static void killMan()
		{
		if (counter == 1)
			{
			man[0] = "   (__)";
			}
		else if (counter == 2)
			{
			man[0] = ("   (__)");
			man[1] = ("  || ");
			man[2] = ("  ");
			}
		else if (counter == 3)
			{
			man[0] = ("   (__)");
			man[1] = (" || ");
			man[2] = (" --");
			}
		else if (counter == 4)
			{
			man[0] = ("   (__)");
			man[1] = (" || ");
			man[2] = (" --");
			man[3] = ("--");
			}
		else if (counter == 5)
			{
			man[0] = ("   (__)");
			man[1] = (" || ");
			man[2] = (" --");
			man[3] = ("--");
			man[4] = ("   /");
			}
		else if (counter == 6)
			{
			man[0] = ("   (__)");
			man[1] = ("  || ");
			man[2] = ("--");
			man[3] = ("--");
			man[4] = ("   /");
			man[5] = (" \\");
			}
		}
	public static void guessWholePhrase()
		{
		if (!(numberOfLetters == 0) && !(counter == 6))
			{
			System.out.println("Would you like to guess the entire phrase? If so, type yes. If not, just hit enter.");
			Scanner userInput = new Scanner(System.in);
			phraseGuess = userInput.nextLine();
			if (phraseGuess.equalsIgnoreCase("yes"))
				{
				takeWholeGuess();
				}
			}
		}
	public static void takeWholeGuess()
		{
		int counter2 = 0;
		Scanner userInput = new Scanner(System.in);
		System.out.println("What do you think the phrase is?");
		String guessedPhrase = userInput.nextLine();
		guessedPhrase = guessedPhrase.toUpperCase().replace(" ","");
		
		for (int i = 0; i < guessedPhrase.length(); i++)
			{
			wholeGuessArray.add(guessedPhrase.substring(i,i+1));
			}
		for (int i = 0; i < wholeGuessArray.size(); i++)
			{
			if (wholeGuessArray.get(i).equals(anotherArray.get(i)))
				{
				counter2++;
				}
			}
		if  (counter2 == anotherArray.size())
			isGameOver = true;
		else
			{
			System.out.println("Nope, Sorry!");
			counter = counter + 1;
			TheMan.killMan();
			TheMan.display();
			TheMan.printBlanks();
			}
		}
	public static void check()
		{
		numberOfLetters = realArray.size();
		if (numberOfLetters == 0)
			{
			isGameOver = true;
			}
		if (counter == 6)
			{
			isGameOver = true;
			}
		}
	public static void greetUser()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Hello there! What is your name?");
		String playerName = userInput.nextLine();
		String greetArray[] = {"You look so good today!", "You are glowing today!",
					"You are looking lovely as always!","Wow, your skin looks flawless!",
					"I love that shirt!","Did you do something with your hair? It looks great!",
					"You have such a beautiful smile!"};
		int randomNumber = (int)(Math.random()*greetArray.length);
		System.out.println("Hello " + playerName + "! " + greetArray[randomNumber] + " Let's play Hangman! You have six wrong guesses before your man dies. Good luck!");
		}
	}
	

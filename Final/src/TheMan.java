import java.util.ArrayList;
import java.util.Scanner;
public class TheMan
	{
	boolean isGameOver = false;
	static String guess;
	static String man[] = new String [6];
	static String arrayOne[];
	static String arrayTwo[];
	static String arrayThree[];
	static String phrase;
	static String correctGuess;
	static int counter;
	static String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	static ArrayList  blankArray = new ArrayList();
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
	public static void choosePhrase()
		{
		String[] arrayOne = {"dog","fairy","zebra","pencil","pretzel"};
		String[] arrayTwo = {"smells","looks","is","seems","appears"};
		String[] arrayThree = {"good","healthy","lively","incredible","salty"};
		int randomNumber = (int)(Math.random()*arrayOne.length);
		int randomNumber2 = (int)(Math.random()*arrayTwo.length);
		int randomNumber3 = (int)(Math.random()*arrayThree.length);
		phrase = "The " + arrayOne[randomNumber] + " " + arrayTwo[randomNumber2] + " " + arrayThree[randomNumber3];
		}
	public static void printBlanks()
		{
		System.out.println(phrase);
		blankArray.add(phrase);
		for (int i; i < arrayOne.length)
		System.out.println(blankArray);
		for(int i = 0; i < phrase.length(); i++)
			{
			if (phrase.substring(i, i+1).equals(correctGuess))	
				System.out.print(guess);
			else if (!phrase.substring(i, i+1).equals(" "))	
				System.out.print("_ ");
			else 
				System.out.print("  ");
			}
		System.out.println();
		}
	public static void askForGuess()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("What is your guess?");
		guess = userInput.nextLine();
		for(int i = 0; i < phrase.length(); i++)
			{
			if (guess.equals(alphabet[i]))
				{
				if (phrase.contains(guess))
					{
					correctGuess = guess;
					}
				}
			}
		counter = 0;
		if (guess.equals(correctGuess))
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
			man[0] = ("  (__)");
			man[1] = (" || ");
			man[2] = ("  ");
			}
		else if (counter == 3)
			{
			man[0] = ("  (__)");
			man[1] = (" || ");
			man[2] = ("--");
			}
		else if (counter == 4)
			{
			man[0] = ("  (__)");
			man[1] = (" || ");
			man[2] = ("--");
			man[3] = ("--");
			}
		else if (counter == 5)
			{
			man[0] = ("  (__)");
			man[1] = (" || ");
			man[2] = ("--");
			man[3] = ("--");
			man[4] = ("  /");
			}
		else if (counter == 6)
			{
			man[0] = ("  (__)");
			man[1] = (" || ");
			man[2] = ("--");
			man[3] = ("--");
			man[4] = ("  /");
			man[5] = (" \\");
			}
		}
	public static void check()
		{
		}
	}
	

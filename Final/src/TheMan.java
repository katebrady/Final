import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class TheMan
	{
	static boolean isGameOver = false;
	static String guess;
	static int numberOfLetters;
	static String man[] = new String [6];
	static String arrayOne[] = {"DOG","FAIRY","ZEBRA","PENCIL","PRETZEL"};
	static String arrayTwo[] = {"SMELLS","LOOKS","IS","SEEMS","APPEARS"};
	static String arrayThree[] = {"GOOD","HEALTHY","LIVELY","INCREDIBLE","SALTY"};
	static String phrase;
	static String correctGuess;
	static String wrongGuess;
	static int counter;
	static int randomNumber;
	static int randomNumber2;
	static int randomNumber3;
	static String[] alphabet = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	static ArrayList  blankArray = new ArrayList();
	static ArrayList correctGuesses = new ArrayList();
	static ArrayList realArray = new ArrayList();
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
		randomNumber = (int)(Math.random()*arrayOne.length);
		randomNumber2 = (int)(Math.random()*arrayTwo.length);
		randomNumber3 = (int)(Math.random()*arrayThree.length);
		phrase = "THE " + arrayOne[randomNumber] + " " + arrayTwo[randomNumber2] + " " + arrayThree[randomNumber3];
		}
	public static void makeBlankArray()
		{
		blankArray.add("T");
		blankArray.add("H");
		blankArray.add("E");
		String firstWord = arrayOne[randomNumber];
		String secondWord = arrayTwo[randomNumber2];
		String thirdWord = arrayThree[randomNumber3];
		for (int i = 0; i < arrayOne[randomNumber].length(); i++)
			{
			blankArray.add(firstWord.substring(i, i+1));
			}
		for (int i = 0; i < arrayTwo[randomNumber2].length(); i++)
			{
			blankArray.add(secondWord.substring(i, i+1));
			}
		for (int i = 0; i < arrayThree[randomNumber3].length(); i++)
			{
			blankArray.add(thirdWord.substring(i, i+1));
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
		numberOfLetters = realArray.size();
		for(int i = 0; i < phrase.length(); i++)
			{
			if (correctGuesses.contains(phrase.substring(i, i+1)))	
				{
				System.out.print(phrase.substring(i, i+1));
				}
			else if (!phrase.substring(i, i+1).equals(" "))	
				System.out.print("_ ");
			else 
				System.out.print("  ");
			}
		System.out.println();
		}
	public static void askForGuess()
		{
		System.out.println(correctGuesses);
		Scanner userInput = new Scanner(System.in);
		System.out.println("What is your guess?");
		guess = userInput.nextLine().toUpperCase().replace(" ","");
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
		System.out.println("Would you like to guess the phrase?");
		Scanner userInput = new Scanner(System.in);
		phraseGuess = userInput.nextLine();
		
		}
	public static void check()
		{
		if (numberOfLetters == 1)
			{
			isGameOver = true;
			}
		if (counter == 6)
			{
			display();
			isGameOver = true;
			}
		}
	}
	

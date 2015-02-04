import java.util.Scanner;
public class TheMan
	{
	static String guess;
	static String man[] = new String [6];
	static String arrayOne[];
	static String arrayTwo[];
	static String arrayThree[];
	static String phrase;
	static String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
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
		System.out.println("-----|");
		System.out.println("|" + "    |");
		System.out.println("| " + "   __");
		System.out.println("| " + "  (__)");
		System.out.println("| " + "--" + "  || " + "--");
		System.out.println("  " + "  /" + " \\" );
		System.out.println("|_________");
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
		for(int i = 0; i < phrase.length(); i++)
			{
			if (phrase.substring(i, i+1).equals(guess))	
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
		for (int i = 0; i < alphabet.length; i++ )
			{
			if (guess.equals(alphabet[i]))
				{
				if (phrase.contains(guess))
					{
					System.out.println("Good one!");
					}
				else 
					{
					System.out.println("Oh, sorry, but you're dead wrong.");
					}
				}
			else
				{
				System.out.println("Who do you think you are? Try Again");
				askForGuess();
				}
			}
		}
	}

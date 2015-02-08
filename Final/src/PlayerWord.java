import java.util.Scanner;
import java.util.ArrayList;


public class PlayerWord 
	{
	static ArrayList letters = new ArrayList();
	public static void playerChoosesWord ()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("How many words is your phrase?");
		int words = userInput.nextInt();
		for (int i = 0; i < words; i++)
			{
			System.out.println("How many letters are in the " + (i+1) + " word?");
			int letterss = userInput.nextInt();
			letters.add(letterss);
			}
		System.out.println(letters);
		}
	public static void printPlayerBlanks()
		{
		for (int i = 0; i < letters.size(); i++)
			{
			for (int j = 0; j < (int) letters.get(i); j++ )
				{
				System.out.print("_ ");
				}
			System.out.print("  ");
			}
		}
	}	

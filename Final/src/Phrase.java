import java.util.ArrayList;


public class Phrase
	{
	static ArrayList <Phrase> phrase = new ArrayList <Phrase> ();
	String firstWord;
	String secondWord;
	String thirdWord;
	static String thePhrase;
	static int randomNumber;
	static int randomNumber2;
	static int randomNumber3;
	public Phrase (String nb , String t, String yu)
		{
		firstWord = nb;
		secondWord = t;
		thirdWord = yu;
		}
	public String getFirstWord()
		{
			return firstWord;
		}
	public void setFirstWord(String firstWord)
		{
			this.firstWord = firstWord;
		}
	public String getSecondWord()
		{
			return secondWord;
		}
	public void setSecondWord(String secondWord)
		{
			this.secondWord = secondWord;
		}
	public String getThirdWord()
		{
			return thirdWord;
		}
	public void setThirdWord(String thirdWord)
		{
			this.thirdWord = thirdWord;
		}
	public static void createPhrase()
		{
		phrase.add(new Phrase ("DAN","LOOKS", "WONDERFUL"));
		phrase.add(new Phrase ("SARAH","SEEMS","NICE"));
		phrase.add(new Phrase ("JANE","SMELLS","GOOD"));
		phrase.add(new Phrase ("ZACH","IS","HORRIBLE"));
		phrase.add(new Phrase ("JOE","APPEARS","AWFUL"));
		randomNumber = (int)(Math.random()*phrase.size());
		randomNumber2 = (int)(Math.random()*phrase.size());
		randomNumber3 = (int)(Math.random()*phrase.size());
		thePhrase =  phrase.get(randomNumber).getFirstWord() + " " + phrase.get(randomNumber2).getSecondWord() + " " + phrase.get(randomNumber3).getThirdWord();
		
		}
	
	}

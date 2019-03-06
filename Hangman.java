import java.util.Random;

public class Hangman
{
	private int misses, guesses, wins;
	private String letter, phrase;

	//A class that forms the list of phrases

	//A class that picks a random phrase from the list for the game
	//public String getPhrase() {
		//

	//}



	//A class that makes sure the phrase is valid (as in, it has only letters)
	public boolean isPhraseValid(String phrase) 
	{
		while (int i < phrase.length());
		{
			if (!((letterChecker(phrase.charAt(i)))) || (phrase.charAt(i).equals(" ")))
				break;
		}
		if (i == phrase.length())
			return true;
		else
			return false;

	}

	//A class that analyzes the total amount of unique letters in the phrase
	public String[] makeLetterList(String phrase) {
		boolean looping = true;
		String[] letterList = {};
		for (int i = 0; i < phrase.length(); i++) 
		{
			if ((letterChecker(phrase[i])) && (!(isInList(phrase.charAt(i), letterList))))
				letterList.append(phrase.charAt(i));
		}
		return(letterList);
	}

	//A class that determines if a letter is already in a list or not
	public boolean isInList(String item, String[] list) {
		for (int i = 0; i < list.length(); i++) {
			if (item.equals(list[i]))
				break;
			else
				continue;
		}
		if (i < list.length())
			return true;
		else
			return false;
	}


	//A class that will display a blocked-out version of the phrase
	public String blockedPhrase(String phrase)
	{
		for (int i = 0; i < phrase.length(); i++)
		{
			if (isPhraseValid(phrase))
			{
				if (letterChecker(phrase.charAt(i)))
					phrase.replace(phrase.charAt(i), "*");
				else
					continue;
			}
		}
		return(phrase);
	}

	//A class that takes in a letter from the user

	//A class that validates the input to make sure it's a letter
	public boolean letterChecker(String letter)
	{
		//turns the letter to lowercase in all instances
		letter = letter.toLowerCase();
		//checks if the letter is one of any of the letters
		return(letter.equals("a") || letter.equals("b") || letter.equals("c") || letter.equals("d") || letter.equals("e") 
		 || letter.equals("f") || letter.equals("g") || letter.equals("h") || letter.equals("i") || letter.equals("j") ||
		 letter.equals("k") || letter.equals("l") || letter.equals("m") || letter.equals("n") || letter.equals("o") ||
		 letter.equals("p") || letter.equals("q") || letter.equals("r") || letter.equals("s") || letter.equals("t") ||
		 letter.equals("u") || letter.equals("v") || letter.equals("w") || letter.equals("x") || letter.equals("y") ||
		 letter.equals("z"));

	}

	//A class that keeps track of what letters have been guessed already
	//public void lettersGuessed() 
	//{
		//
		//
		//
		//
		//
		//
	//}

	//A class that indicates if the letter is a correct guess
	public boolean guessCorrect(String phrase, String letter)
	{
		for (int i = 0; i < phrase.length(); i++)
		{
			if (phrase.charAt(i).equals(letter))
				break;
		}
		if (i < phrase.length())
			return true;
		else
			return false;
	}

	//A class that goes through the phrase and "unblocks" any letter in the blocked
	//version that is the letter inputted
	public void unblock(String blockedPhrase, String phrase, String letter) 
	{
		for (int i = 0; i < phrase.length(); i++)
		{
			if (phrase.charAt(i).equals(letter))
				blockedPhrase.replace("*", phrase.charAt(i));
			else
				continue;
		}
	}

	//A class that picks up when an incorrect guess is being guessed again

	//A class that when getting a "TRUE" from the previous class, prevents another miss point and displays,
	//"Hey, you already inputted this and it didn't work. Please try another letter."

	

	//A class that adds up misses and when 8 misses happen, triggers the loss
	//public 

	//A class that notifies when a miss has taken place and informs the user
	//how many misses are left.

	//A class that indicates the game is lost

	//A class that indicates the game is won

	//Prompts the user if they would like to try another game, regardless of win or loss

}
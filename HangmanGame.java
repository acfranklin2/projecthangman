import java.util.Scanner;

public class HangmanGame
{
	public static void main(String[] args)
	{

		String[] phraseList = {"We are in the endgame now", "A plus B equals C", "The hardest word to guess is jazz", 
		"", "", "", "", "", "", "", "", ""}
		Hangman game = new Hangman();
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a simple phrase - No symbols or numbers, just letters and spaces: ");
		String phraseInput = input.next();
		System.out.println("Your blocked-out phrase is: " + game.blockedPhrase(phraseInput));
		



	}
}
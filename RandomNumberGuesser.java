

import java.util.Scanner; // Utility class for reading user input
import java.util.Random; // Utility class for a random number

public class RandomNumberGuesser {

	public static void main(String[] args) {
		// Driver Method - Method main()

		
		// Display Application Title "Random Number Guesser"
		System.out.println("*******************************");
		System.out.println("**** Random Number Guesser ****");
		System.out.println("*******************************");

		 // Variables
		int play = 1;
		int playAgain;
		int randNum;
		
		//RNG.resetCount();
		randNum = RNG.rand();
	
		
		while(play==1) {
			RNG.resetCount();
			
		// Variables
			int initialGuess, nextGuess;
			int highGuess = 100;
			int lowGuess = 0;
			
		// Initial guess
		nextGuess = 0;
		System.out.println("Enter your first guess between 0-100:");
		Scanner userInput = new Scanner(System.in);
		initialGuess = userInput.nextInt();
		 
		if(RNG.inputValidation(initialGuess, lowGuess, highGuess))
         {
             if(initialGuess<=randNum && (randNum-initialGuess)<(randNum-lowGuess))
             {
                 lowGuess=initialGuess;
             }
             if(initialGuess>=randNum && (initialGuess-randNum)<(highGuess-randNum))
             {
                 highGuess=initialGuess;
             }
         }
		System.out.println("Number of guesses is " + RNG.getCount());
		// Transfer value of initialGuess to next Guess
		initialGuess = nextGuess;
		
		
		// Start of 2nd guess
		do
	       {
			// if(nextGuess )
	           System.out.println("Enter your next guess between " + lowGuess + " and " + highGuess);
	           nextGuess=userInput.nextInt();
	           if(RNG.inputValidation(nextGuess, lowGuess, highGuess))
	           {
	               if(nextGuess<=randNum && (randNum-nextGuess)<(randNum-lowGuess))
	               {
	                   lowGuess=nextGuess;
	               }
	               if(nextGuess>=randNum && (nextGuess-randNum)<(highGuess-randNum))
	               {
	                   highGuess=nextGuess;
	               }
	               System.out.println("Number of guesses is " + RNG.getCount());
	           }
	       }
		while(nextGuess!=randNum);
		System.out.println("Congratulations, you guessed correctly!");
		System.out.println("Would you like to play again? (1 = yes or 0 = no)");
		playAgain=userInput.nextInt();
		if(playAgain == 0)
		{
			play = 0;
		}
		}
		System.out.println("Thanks for playing...");
		System.out.println("PROGRAMMER NAME: ALBERT B CABOTAJE");
		System.out.println("ASSIGNMENT 2");
		System.out.println("DUE DATE: 02/21/2022");
		

	}
	           
}

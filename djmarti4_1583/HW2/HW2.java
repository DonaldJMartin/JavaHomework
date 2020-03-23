import java.util.Scanner;


public class HW2
{
	
	public static void main(String [] args)
	{
		//import a scanner for user imput.
		Scanner input = new Scanner(System.in);
 
 	// Create a variable that represents the lowest possible number.
		int low = 0;

	// Create a variable that represents the highest possible number.
		int high = 100;

		// Initialize a variable in which to store the number of guesses to 0.
		int counter = 0;

		// Prompt user to pick a number from 1-100.
		System.out.print("Pick any number from 1-100: ");


		//take the imported scanner and utilize it so the user can enter their random number.
		int user = input.nextInt();
		
		//Create a while loop. If the user selects a number less than 1, or more than 100,  ask the user to select a number 1-100 until the input a correct number. Once the user inputs a valid number the while loop will end.

		while (user <1 || user >100) {
			System.out.println("You entered the wrong number! Try Again.");

			System.out.print("Pick any number from 1-100: ");
			user = input.nextInt();

		} //end while loop

		// Create a Boolean variable that represents if we’ve achieved the correct guess to false.
		boolean correctGuess = false;

		while (correctGuess == false) {

			counter++;

			// Declare a variable in which to store an initial guess
			int guess = ((low + high) / 2);
			System.out.printf("%d Is this your number? Is it higher or lower?\n", guess);
			System.out.println("1.yes");
			System.out.println("2.low");
			System.out.println("3.high");
			


			int choice = input.nextInt();

			if (choice == 1) {
				correctGuess = true;
			} //end if loop
			
			else if (choice == 2) {
				low = guess;
			} //end else if


			else if (choice == 3) {
				high = guess;
			} //end else if

			else {
			System.out.println("This is not an option! Try Again.");			
			} //end else

		} //end while loop
			System.out.printf("number of guesses: %d %n", counter);




	} //End public static void main
} //End public class
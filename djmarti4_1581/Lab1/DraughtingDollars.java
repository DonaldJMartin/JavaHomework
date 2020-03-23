import java.util.Scanner;

public class DraughtingDollars {
	
	public static void main(String[] args) {
		
		//setup scanner for input
		Scanner input = new Scanner(System.in);

		//setup attributes (variables) for program
		double remainingBeer = input.nextDouble();
		double pricePerBeer = input.nextDouble();
		double fullKeg = 15.5;
		double ozPerGallon = 128;
		double servingSize = 16;

		//design the logic for the program
		//How much beer do we have in gallons?
		remainingBeer = remainingBeer * fullKeg;

		//convert gallons into oz
		remainingBeer = remainingBeer * ozPerGallon;

		//find how many servings we have.
		remainingBeer = remainingBeer / servingSize;

		//how much $$ is it worth?
		pricePerBeer = remainingBeer * pricePerBeer;

		//output the answer
		System.out.printf("There is $%.2f of beer left in keg\n", pricePerBeer);

	}

}
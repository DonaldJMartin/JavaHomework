/*
* Lab 2
* Problem 4:Min/Max Search By Value
*/

import java.util.Scanner;

public class MinMaxSearchByValue {

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);

		int cases = scanner.nextInt();
		scanner.nextLine();

		int min;
		int max;

		for (int i = 0; i < cases; i++) {
			
			String givenListOfNumbers = scanner.nextLine();
			Scanner stringScanner = new Scanner(givenListOfNumbers);

			min = stringScanner.nextInt();
			max = min;

			while (stringScanner.hasNextInt()) {
				int nextValue = stringScanner.nextInt();

				if (nextValue < min) {
					min = nextValue;
				}

				else if (nextValue > max) {
					max = nextValue;
				}

			}

			System.out.printf("%s%n%d%n%d%n%n", givenListOfNumbers, min, max);
		}
	} //End main method
} //End class
/*
Lab 3
Problem 7: Simple Calculator
September 24, 2018
*/

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String [] args) {

		Scanner input = new Scanner(System.in);

		int cases = input.nextInt();

		int num1;//assigned to temp && answer vairable
		int num2;
		String operator;
		int answer = 1;
		int temp;

		for (int i = 0; i < cases; i++) {
			num1 = input.nextInt();
			operator = input.next();
			num2 = input.nextInt();

			switch(operator) {
				case "+": {answer = num1 + num2;} break;
				case "-": {answer = num1 - num2;} break;
				case "*": {answer = num1 * num2;} break;
				case "/": {answer = num1 / num2;} break;
				case "%": {answer = num1 % num2;} break; //modulous
				case "**":  //exponents

				answer = 1; 
			temp = num1; //ifif exponent is 1

			if (num2 > 1) { //if exponent is greater than 1

				for (int j = 0; j < num2; j++) {
					answer = answer * temp;
				}
			}

			if (num2 == 0) { //if exponent is 0

				answer = 1;
				
			}
			break;

			}//end switch
			System.out.println(answer);
		}//end for loop
	}
}
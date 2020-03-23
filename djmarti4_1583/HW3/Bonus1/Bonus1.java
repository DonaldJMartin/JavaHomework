public class Bonus1 {

	public static void main(String [] args) {

		// Generate all possible UNIQUE combinations of the integers 1 – 100 inclusive, and count them.
		// initialize a counter to 0;
		int counter = 0;

		
		for (int personOne = 1; personOne <= 100 - 4; personOne++) {
			for (int personTwo = personOne + 1; personTwo <= 100 - 3; personTwo++) {
				for (int personThree = personTwo + 1; personThree <= 100 - 2; personThree++) {
					for (int personFour = personThree + 1; personFour <= 100 - 1; personFour++) {
						for(int personFive = personFour + 1; personFive <= 100; personFive++) {
							counter++;
							//System.out.println(personOne + "," + personTwo + "," + personThree + "," + personFour + "," + personFive);
						}
					}
				}
			}
		}
					System.out.println("counter: " + counter);
		// output the result;

		
	}

}
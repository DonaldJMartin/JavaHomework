import java.util.Scanner;
//import java.util.Math;

public class PointOfSaleSystem {

	public static void main(String [] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("************************************************************************");
		System.out.println("                          McDowell's Restaurant                                             ");
		System.out.println("************************************************************************");

		System.out.println("Make your selection from the menu below: ");
		System.out.println("1. Regular Hamburger $1.50");
		System.out.println("2. Regular Cheeseburger $1.75");
		System.out.println("3. Fish Sandwich $2.50");
		System.out.println("4. Half-pounder with cheese $2.75");
		System.out.println("5. French Fries $0.99");
		System.out.println("6. Large Soft Drink $1.25");

		System.out.println("************************************************************************");
		System.out.println("Select 1, 2, 3, 4, 5, or 6 ----->");

		double one = 1.50;
		double two = 1.75;
		double three = 2.50;
		double four = 2.75;
		double five = 0.99;
		double six = 1.25;

		double total = 0;

		int choice = input.nextInt();

		for (int i = 0; i < choice; i++) {
			int selection = input.nextInt();

			if (selection == 1) {
				total = one + total;
			}

			else if (selection == 2) {
				total = two + total;
			}

			else if (selection == 3) {
				total = three + total;
			} 

			else if (selection == 4) {
				total = four + total;
			}

			else if (selection == 5) {
				total = five + total;
			}
			
			else if (selection == 6) {
				total = six + total;
			}

		}

			double x = ((total * .065) + total);

			double price = Math.round((x * 100.0)) / 100.0;
			
			System.out.println("Please pay $" + price);
			System.out.println("Thank you for eating at McDowell's!");
	


	}

}
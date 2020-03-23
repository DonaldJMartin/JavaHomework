import java.util.Scanner;

	public class PapersPlease {

		public static void main(String[] args) {

			boolean passport = false;
			boolean driversLicense = false;
			boolean birthCert = false;

			Scanner input = new Scanner(System.in);

			// System.out.println(" ");
			
			passport = input.nextBoolean();
			driversLicense = input.nextBoolean();
			birthCert = input.nextBoolean();
			

			if (passport == true) {
				System.out.println("true");
			}


			else if (driversLicense == true) {
			
				if (birthCert == true) {
					System.out.println("true");
				}
				else {
					System.out.println("false");
				}
			}
			else {
				System.out.println("false");
			}

	}
}


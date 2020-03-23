import java.util.Scanner;

public class HW4 {
	private static final int LOW_STAT_THRESHOLD = 20;
	private static final int MED_STAT_THRESHOLD =  50;
	private static final int HIGH_STAT_THRESHOLD = 80;
	private static final int RUNAWAY_STAT_THRESHOLD = 90;
	
	private static int age;
	private	static int currentHunger;
	private	static int currentBoredom;
	private	static int currentDirtiness;
	
	private static int hungerRate;
	private static int boredomRate;
	private static int dirtinessRate;

	private static String petName;
	
	//METHOD 1
	public static void createPet() {

		Scanner input = new Scanner(System.in);

		age = 0;

		//Create a pet to give to the player
		System.out.println("Congratulations! You are the proud new owner of a virtual pet.");
		System.out.println("What will you name it?");
		petName = input.nextLine();

		currentHunger = 0;
		currentBoredom = 0;
		currentDirtiness = 0;

		hungerRate = 1;
		boredomRate = 1;
		dirtinessRate = 1;

	}

	//METHOD 2
	public static void increaseAge(){

		age++;
		System.out.println("Your pet is now " + age + " years old!!");

		if (age % 2 == 0) {
			hungerRate++;
			System.out.println("Your pet's hunger rate has increased!");
		}

		if (age % 3 == 0) {
			dirtinessRate++;
			System.out.println("Your pet's dirtiness rate has increased!");
		}

		if (age % 5 == 0) {
			boredomRate++;
			System.out.println("Your pet's boredom rate has increased!");
		}		
	
	}

		// SUBMETHOD 1
		public static void feedPet() {
			currentHunger = currentHunger - hungerRate;
			currentDirtiness = currentDirtiness + dirtinessRate;

			System.out.println("Hunger has decreases and Dirtiness has increased!");
		}

		// SUBMETHOD 2
		public static void cleanPet() {
			currentDirtiness = currentDirtiness - dirtinessRate;
			currentBoredom = currentBoredom + boredomRate;

			System.out.println("Dirtiness has decreased and boredom has increased!");
		}

		// SUBMETHOD 3
		public static void playPet() {
			currentBoredom = currentBoredom - boredomRate;
			currentHunger = currentHunger + hungerRate;

			System.out.println("Boredom has decreased and hunger has increased!");
		}

		// METHOD 3
		public static void petInteraction() {
			
			Scanner input = new Scanner(System.in);

			System.out.println("1. feed");
			System.out.println("2. clean");
			System.out.println("3. play");

			int choice = input.nextInt();

			if (choice == 1) {
				feedPet();
			}

			if (choice == 2){
				cleanPet();
			}

			if (choice == 3) {
				playPet();
			}
		}

		//Submethod 2-1
		public static String attributeStatus(int attribute) {

			String indication;

			if (attribute < LOW_STAT_THRESHOLD) {
				indication = "Very Good!";
			}

			else if (attribute < MED_STAT_THRESHOLD) {
				indication = "OK";
			}

			else if ( attribute < HIGH_STAT_THRESHOLD) {
				indication = "Urgent!";
			}

			else {
				indication = "DANGER!";
			}

			return(indication);
		}

		//METHOD 4
		public static void currentStatus(){

			String hungerDescription = "Hunger Level: ";
				System.out.println(hungerDescription + attributeStatus(currentHunger));

			String cleanlinessLevel = "Cleanliness Level: ";
				System.out.println(cleanlinessLevel + attributeStatus(currentDirtiness));

			String boredomLevel = "Boredom Level: ";
				System.out.println(boredomLevel + attributeStatus(currentBoredom));

		}
		
		// METHOD 5
		public static boolean runAway() {

			if (currentHunger > RUNAWAY_STAT_THRESHOLD) {
				System.out.println("Your pet has run away because it was too hungry.");
				return true;
			}

			if (currentDirtiness > RUNAWAY_STAT_THRESHOLD) {
				System.out.println("Your pet has run away because it was too dirty.");
				return true;
			}

			if (currentBoredom > RUNAWAY_STAT_THRESHOLD) {
				System.out.println("Your pet has run away because it was too bored.");
				return true;
			}
			 
			 return false;

		}

		// METHOD 6
		public static void timeSpent() {

			if (age < 5) {
				System.out.println("Do better next time.");
			}

			if (age >= 6 && age <= 15) {
				System.out.println("Congratulations, you spent " + age + " days with your pet.");
			}

			if (age >= 16 && age <= 25) {
				System.out.println("You took great care of " + petName + " for" + age + " days.");
			}

			if (age > 25) {
				System.out.println("You are ready to own a real pet!");
			}

		}


	public static void main(String [] args) {
		createPet();
		boolean runAwayTest = false;

		while(runAwayTest == false) {
			increaseAge();
			petInteraction();
			currentStatus();
			runAwayTest = runAway();
		}

		timeSpent();
	}

}
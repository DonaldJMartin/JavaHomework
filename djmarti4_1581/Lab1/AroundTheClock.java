import java.util.Scanner;

public class AroundTheClock {
	
	public static void main(String [] args) {

		Scanner input = new Scanner(System.in);

		int time = input.nextInt();
		int travel = input.nextInt();
		int eta = (time + travel);

		while (eta >= 12) {
			eta = eta - 12;
		}

		System.out.println(eta);

	}
}
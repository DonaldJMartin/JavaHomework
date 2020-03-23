import java.util.Scanner;

public class Factorials {
	
	public static void main(String [] args) {

		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();

		for (int i = 0; i < cases; i++) {
			int multiple = input.nextInt();
			int answer = multiple;

			if (multiple > 20) {
				multiple = input.nextInt();
			}
			
			
			while (multiple > 1) {
				 multiple--;
				 answer = answer * multiple;
				 //System.out.println(multiple);
			}

			if (multiple == 0) {
				answer = 1;
			}

			System.out.println(answer);

		} //end for
	}
}
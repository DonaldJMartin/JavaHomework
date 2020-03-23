import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();

		for (int i = 0; i < cases; i++) {
			int n = input.nextInt();
			//int answer = n;
			int n1 = 0;
			int n2 = 1;
			int n3 = 1;
			
			for (int j = 0; j < n - 1; j++){
				n3 = n1 + n2;
				n1 = n2;
				n2 = n3;
			}

			System.out.println("" + n3);

		} //end for
	}
}
import java.util.Scanner;
import java.lang.Math;

public class LogIt
{
	public static void main(String [] args)
	{
		//Create Scanner
		Scanner input = new Scanner(System.in);
		
		//Take # of cases into a variable
		int cases = input.nextInt();
		
		//For each case
		for (int i = 0; i < cases; i++) {

			//intmaxNum = input.nextInt();
			int x = input.nextInt();

			//calculateLog2(maxNum)
			calculateLog2(x);

		}
	}

	public static void calculateLog2(int maxNum)
	{
		double maxGuesses = Math.log(maxNum) / Math.log(2);
		System.out.println((int) Math.ceil(maxGuesses));
	}
}
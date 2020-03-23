//import scanner
import java.util.Scanner;

public class StudentGrader {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		//create int to hold student grades
		float testAvg = input.nextFloat();
		float hwAvg = input.nextFloat();
		float labAvg = input.nextFloat();


		//create three floats to hold the student's average
		double avg = ((testAvg * 0.4) + (hwAvg * 0.5) + (labAvg * 0.1));
				
		System.out.println(avg);
		
	}

}
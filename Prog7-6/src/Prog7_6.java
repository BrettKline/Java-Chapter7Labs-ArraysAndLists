import java.util.Scanner;
public class Prog7_6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean debugMode = true; //shows answers
		DriverExam myDriverExam = new DriverExam();
		String inputString;
		System.out.println("Time for your driver's test! Input A, B, C, or D for your answer. ");
		for (int counter = 0; counter < DriverExam.answers.length; counter++) {
			System.out.printf("Question %d. %s\r\n", counter+1, debugMode ? "Answer is " + DriverExam.answers[counter] : "");
			do {
				inputString = input.nextLine().toUpperCase();
				if (!(inputString.equals("A") || inputString.equals("B") || inputString.equals("C") || inputString.equals("D"))) {
					System.out.println("Try again, your input wasn't understood. Try A, B, C, or D.");
				}
			}
			while (!(inputString.equals("A") || inputString.equals("B") || inputString.equals("C") || inputString.equals("D")));
			myDriverExam.setAnswersGiven(counter, inputString.charAt(0));
		}
		System.out.println("It's over! Here's how you did:");
		System.out.println(myDriverExam);
		
		input.close();
	}

}

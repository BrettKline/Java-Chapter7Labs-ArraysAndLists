import java.util.Scanner;
public class Prog7_4 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] sampleArray = {-69, -37, -23, -11, 0, 11, 23, 37, 69, 111, 123, 137, 169 };
		double n = 0;
		System.out.println("Input any double.");
		n = input.nextDouble();
		for (int counter = 0; counter < sampleArray.length; counter++) {
			if (n > sampleArray[counter]) {
				System.out.println(sampleArray[counter]);
			}
		}
		input.close();
	}

}

import java.util.Scanner;
public class Prog7_1 {

	public static void main(String[] args) {
		System.out.println("Enter twelve months worth of rainfall.");
		Scanner input = new Scanner(System.in);
		Rainfall myRainfall = new Rainfall();
		for (int counter = 0; counter < 12; counter++) {
			myRainfall.setRainfall(counter, input.nextDouble());
		}
		System.out.println("Total rainfall: " + myRainfall.getTotalRainfall());
		System.out.println("Average rainfall: " + myRainfall.getAverageRainfall());
		System.out.println("Most rainfall: " + myRainfall.getMostRainfall());
		System.out.println("Least rainfall: " + myRainfall.getLeastRainfall());
		input.close();
	}

}

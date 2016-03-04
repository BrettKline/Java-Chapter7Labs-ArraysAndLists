import java.util.Scanner;
public class Prog7_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Payroll myPayroll = new Payroll();
		System.out.println("Enter a number of hours and a payrate for a custom employee; the other 6 will use default data.");
		myPayroll.setHours(0, input.nextInt());
		myPayroll.setPayRate(0, input.nextDouble());
		for (int counter = 0; counter < 7; counter++) {
			System.out.println(myPayroll.searchId(myPayroll.getEmployeeId(counter)) + "'s wage is $" + myPayroll.getWages(counter));
		}
		input.close();
	}

}

import java.util.Scanner;
public class Prog7_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input an account number and we will see if it exists in our system or not.");
		ChargeAccount myChargeAccount = new ChargeAccount(input.nextInt());
		myChargeAccount.isValid();
		input.close();
	}

}

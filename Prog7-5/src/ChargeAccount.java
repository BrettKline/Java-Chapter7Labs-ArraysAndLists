import java.io.*;
import java.util.Scanner;

public class ChargeAccount {
	private int accountNumber;
	private int[] validAccountNumbers = new int[18];
	private boolean isValidAccount;
	private final String FILENAME = "accountNumbers.txt";
	
	public ChargeAccount(int accountNumber) throws IOException {
		this.accountNumber = accountNumber;
		isValidAccount = false;
		//populate array
		File myFile = new File(FILENAME);
		if (!myFile.exists()) {
			System.out.println("Everything is terrible, the account file is gone.");
			System.exit(0);
		}
		Scanner input = new Scanner(myFile);
		
		for (int counter = 0; input.hasNext(); counter++) {
			validAccountNumbers[counter] = input.nextInt();
		}
		
		input.close();
		
		//determine if our account exists
		for (int counter = 0; counter < validAccountNumbers.length; counter++) {
			if (validAccountNumbers[counter] == accountNumber) {
				isValidAccount = true;
			}
		}
	}
	public void isValid() {
		if (this.isValidAccount) {
			System.out.println("The account number " + this.accountNumber + " was found in our system.");
		}
		else {
			System.out.println("The account number " + this.accountNumber + " was NOT found in our system.");
		}
	}
}

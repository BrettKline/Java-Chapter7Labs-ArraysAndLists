
public class ChargeAccount {
	private int accountNumber;
	final static private int[] validAccountNumbers = { 5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 8080152, 4562555, 5552012, 5050552, 7825877, 1250255, 1005231, 6545231, 3852085, 7576651, 7881200, 4581002 };
	private boolean isValidAccount;
	
	public ChargeAccount(int accountNumber) {
		this.accountNumber = accountNumber;
		isValidAccount = false;
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


public class Payroll {
	private final int[] employeeId = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489 };
	private int[] hours = {0, 23, 40, 40, 23, 10, 35 };
	private double[] payRate = {0.0, 7.64, 11.10, 12.20, 8.25, 8.45, 10.90};
	private double[] wages = new double[7];
	
	public Payroll() {
		//Default data
		
		for (int counter = 0; counter < wages.length; counter++) {
			wages[counter] = hours[counter] * payRate[counter];
		}
	}

	public void setHours(int index, int hours) {
		if (this.hours[index] < 0) {
			this.hours[index] = 0;
		}
		else {
			this.hours[index] = hours;
		}
		setWages(index);
	}

	public void setPayRate(int index, double payRate) {
		if (payRate < 6.0) {
			this.payRate[index] = 6.0;
		}
		else {
			this.payRate[index] = payRate;
		}
		setWages(index);
	}
	
	public void setWages(int index) {
		wages[index] = (hours[index] * payRate[index]);
	}
	
	public int searchId(int id) {
		for (int counter = 0; counter < employeeId.length; counter++) {
			if (employeeId[counter] == id) {
				return employeeId[counter];
			}
		}
		
		return -1;
	}

	public int getEmployeeId(int index) {
		return employeeId[index];
	}

	public double getWages(int index) {
		return wages[index];
	}
}

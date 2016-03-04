
public class Rainfall {
	private double[] rainfall;

	public Rainfall() {
		this.rainfall = new double[12];
	}

	public double getRainfallValue(int counter) {
		return rainfall[counter];
	}
	public double[] getRainfall() {
		return rainfall;
	}

	public void setRainfall(int counter, double value) {
		this.rainfall[counter] = value;
	}

	public double getTotalRainfall() {
		double result = 0;
		for (int counter = 0; counter < 12; counter++) {
			result += rainfall[counter];
		}
		return result;
	}
	public double getAverageRainfall() {
		double result = 0;
		for (int counter = 0; counter < 12; counter++) {
			result += rainfall[counter];
		}
		return result / rainfall.length;
	}
	public double getMostRainfall() {
		double result = rainfall[0];
		for (int counter = 0; counter < 12; counter++) {
			if (rainfall[counter] > result) {
				result = rainfall[counter];
			}
		}
		return result;
	}
	public double getLeastRainfall() {
		double result = rainfall[0];
		for (int counter = 0; counter < 12; counter++) {
			if (rainfall[counter] < result) {
				result = rainfall[counter];
			}
		}
		return result;
	}
}

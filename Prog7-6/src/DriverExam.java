
public class DriverExam {
	public final static char[] answers = {'B', 'D', 'A', 'A', 'C', 'A', 'B', 'A', 'C', 'D', 'B', 'C', 'D', 'A', 'D', 'C', 'C', 'B', 'D', 'A' };
	private boolean[] questionsMissed;
	private char[] answersGiven;
	private boolean passed;
	private int totalCorrect;
	private int totalIncorrect;
	
	DriverExam() {
		questionsMissed = new boolean[answers.length];
		answersGiven = new char[answers.length];
		passed = false;
		totalCorrect = 0;
		totalIncorrect = answers.length;
	}
	public void setAnswersGiven(int index, char answer) {
		answersGiven[index] = answer;
		if (answer == answers[index]) {
			questionsMissed[index] = true;
		}
		else {
			questionsMissed[index] = false;
		}
	}
	public boolean passed() {
		totalCorrect = 0;
		totalIncorrect = answers.length;
		for(int counter = 0; counter < answers.length; counter++) {
			if (questionsMissed[counter]) {
				totalCorrect++;
				totalIncorrect--;
			}
		}
		if (totalCorrect >= 15) {
			passed = true;
			return passed;
		}
		else {
			passed = false;
			return passed;
		}
	}
	@Override
	public String toString() {
		return "You " + (passed() ? "passed. " : "didn't pass. ") + "You got " + getTotalCorrect()
				+ " right and " + getTotalIncorrect() + " wrong.";
	}
	public int getTotalCorrect() {
		return totalCorrect;
	}
	public int getTotalIncorrect() {
		return totalIncorrect;
	}
	
	
}

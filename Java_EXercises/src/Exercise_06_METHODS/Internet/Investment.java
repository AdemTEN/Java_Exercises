package Exercise_06_METHODS.Internet;

public class Investment {

	public static void main(String[] args) {
		
		for (int i = 1; i<=5; i++ ) {
			System.out.print(i + ".Year : "+ futureInvestment(1000, (0.1 /12), i)+ "\n");
		}
		
	}

	public static double futureInvestment(double investmentAmount, double monthlyInterestRate, int year) {
		
		return investmentAmount * Math.pow(1 + monthlyInterestRate, year * 12);
	}
}

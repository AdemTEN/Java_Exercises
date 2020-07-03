package Exercise_06_METHODS.Internet;

public class SumOfDigits {

	public static void main(String[] args) {

		int n = 365;
		System.out.println(sumOfDigit(n));
	}
	
	public static int sumOfDigit(int n) {
		int r = 0;
		int sum = 0;
		while(n > 0) {
			r = n % 10;
			sum += r;
			n = n / 10;
			
		}
		return sum;
	}

}

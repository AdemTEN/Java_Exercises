package Exercise_06_METHODS;

public class Q_10_PrimeNumber {

	public static void main(String[] args) {
		int number = 33;
		System.out.println(isPrime(number));
		
	}
	public static boolean isPrime(int number) {
		boolean flag = true;
		if(number == 0 || number ==1) {
			flag = false;
		
		}else {
			for (int i = 2; i < number ; i++) {
				if(number % i == 0) {
					flag = false;
					break;
				}
			}
		}
		return flag;
	}

}

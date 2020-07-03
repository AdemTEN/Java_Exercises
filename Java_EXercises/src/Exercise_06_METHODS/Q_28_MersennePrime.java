package Exercise_06_METHODS;

public class Q_28_MersennePrime {

	public static void main(String[] args) {

	
		int num = 0;
	
		for(int count = 0; count<31;) {
			
			if(isPrime(num)) {
			count++	;
			System.out.println(num + "=    "+ (Math.pow(2, num)- 1));
			}
			num++;
		}
	
			
			
			
			
			
		
	}
	public static boolean isPrime(int n) {
		boolean flag = true;
		if( n== 0 || n == 1 ) {
			flag = false;
		}else {
			for (int i = 2; i<n; i ++) {
				if (n % i == 0) {
					flag = false;
				}
			}
		}
		return flag;
	}

}

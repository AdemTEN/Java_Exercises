package Exercise_06_METHODS;

public class Q26_PALINDROM_PRIME$$$$ {

	public static void main(String[] args) {
		int i = 2;
		int line = 0;
		int count = 0;
		while(count <=100) {
			
			if(isPalindrom(i) == true && isPrime(i)== true) {
				line++;
				count++;
				if(line % 10 == 0) {
					System.out.print(i + "   \n");
				}else {
					System.out.print(i + "   " );
				}
				
			}
			i++;
		}
		
	}
	
	public static boolean isPrime(int n) {
		boolean flag = true; 
		if(n == 0 || n ==1) {
			flag = false;
		}else {
			for (int i = 2; i<n; i++) {
				if(n % i == 0) {
				flag = false;
				break;
				}
			}
		}
		return flag;
	}
	public static boolean isPalindrom(int n) {
		
		int r = 0, temp = 0, sum = 0;
		temp = n;
		while(n>0) {
			r = n%10;
			sum = sum*10 +r;
			n = n / 10; 
		}
		if(sum==temp) {
			return true;
			
		}else {
			return false;
		}
		
		
	
		
	}

}

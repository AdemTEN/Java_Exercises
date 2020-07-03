package Exercise_06_METHODS;

public class Q_27_LASANumber {

	public static void main(String[] args) {

		int r = 0;
		int sum = 0;
				
		int num = 0;
		int count = 0;
		while(count <100) {
			if (isPrime(num)&& (!isPalindrom(num))) {
				while(num>0) {
			r = num%10;
			sum = sum * 10 + r;
			num = num / 10;
			}
			
			for(int i= 2; i<sum ; i++) {
				if(sum % i != 0) {
				  count++;
				}
			}
			 System.out.println(sum);
			 
		}
			num++;		
		}
		
		

	}

	public static boolean isPrime(int num) {
		boolean flag = true;
		if(num == 0 || num == 1) {
			flag  = false;
		}else {
			for(int i = 2 ; i <num ; i++) {
				if(num % i == 0) {
					flag = false;
					break;
				}
			}
			
		}
		
		return flag;
		
		
	}	
	public static boolean isPalindrom(int num) {
	
		int r = 0, sum = 0, temp = 0;
		temp = num;
		while(num>0) {
			
		r = num % 10;
		sum = sum * 10 + r;
		num = num / 10;	
			
		}
		if (sum == temp) {
			return true;
		}else {
			return false;
		}
	}

	}



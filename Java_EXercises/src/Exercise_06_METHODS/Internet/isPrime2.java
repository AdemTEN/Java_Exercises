/*Write a Java method to find all twin prime numbers less than 100. 

Expected Output:

(3, 5)                                                   
(5, 7)                                                   
(11, 13)                                                 
(17, 19)                                                 
(29, 31)                                                 
(41, 43)                                                 
(59, 61)                                                 
(71, 73) 
*/
package Exercise_06_METHODS.Internet;

public class isPrime2 {

	public static void main(String[] args) {
		for (int num = 2; num < 100; num++)
			if(isPrime(num) && (isPrime(num +2 ))) {
				System.out.println(num + ", " + (num+2) );
			}
	}

	public static boolean isPrime(int num) {
		boolean flag = true;
		if (num < 2) {
			flag = false;
		} else {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					flag = false;
				}
			}
		}
		return flag;
	}

}

/*
(Display an integer reversed) Write a method with the following header to display
an integer in reverse order:
public static void reverse(int number)
For example, reverse(3456) displays 6543. Write a test program that prompts
the user to enter an integer and displays its reversal.
*/

package Exercise_06_METHODS;

public class Q_04_IntegerReversed {

	public static void main(String[] args) {
        int number = 158972258;
		reverse(number);
		
	}
	public static void reverse(int number) {
	
		int r = 0, sum = 0;
		
		while(number > 0) {
			
		r = number % 10;
		sum = sum * 10 + r;
		number = number / 10;	
			
		
//		while (number > 0) {
//			System.out.print((number % 10));
//			number /= 10;
//		}
//		System.out.println();	
//			
			
		}
		System.out.println("Revers of the is: " + sum);
}
}

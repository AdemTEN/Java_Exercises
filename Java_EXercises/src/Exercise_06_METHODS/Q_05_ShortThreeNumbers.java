/*
(Sort three numbers) Write a method with the following header to display three
numbers in increasing order:
public static void displaySortedNumbers(double num1, double num2, double num3)

Write a test program that prompts the user to enter three numbers and invokes the
method to display them in increasing order.
*/
package Exercise_06_METHODS;

public class Q_05_ShortThreeNumbers {

	public static void main(String[] args) {
		
		displaySortedNumber(4, 3 , 5);
		
	}
	
	public static void displaySortedNumber(double num1, double num2, double num3) {
		
		if(num1<num2 && num1<num3) {
			if (num2<num3) {
				System.out.println(num1 + " " + num2 + " " + num3 );
			}else {
				System.out.println(num1 + " " + num3 + " " + num2 );
			}
		}else if(num2<num1 && num2<num3) {
			if(num1<num3) {
				System.out.println(num2+ " " + num1 + " " + num3 );
			}else {
				System.out.println(num2+ " " + num3 + " " + num1 );
			}
		}else if(num3<num1 && num3<num2 ) {
			if(num1<num2) {
				System.out.println(num3+ " " + num1 + " " + num2 );
			}else {
				System.out.println(num3+ " " + num2 + " " + num1 );
			}
		}
	}
	

}

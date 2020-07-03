//Write a Java method to find the smallest number among three numbers
 
package Exercise_06_METHODS.Internet;

import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {
		
		System.out.println("The smallest value is: " + smallestNumber());

		
		
	}
	public static int smallestNumber() {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the first number: ");
		int firstNumber = scan.nextInt();
		System.out.println("Enter the second number: ");
		int secondNumber = scan.nextInt();
		int smallest;
		if (firstNumber<secondNumber) {
			smallest = firstNumber;
		}else {
			smallest = secondNumber;
		}
		int yesOrNo;
		do {
			System.out.println("Do you want to continue: ");
			yesOrNo = scan.nextInt();
			if (yesOrNo == 0) {
				break;
			}
			System.out.println("Enter the next number:");
			int lastNumber = scan.nextInt();
			if (lastNumber<smallest) {
				smallest = lastNumber;
			}
			
			
		} while (yesOrNo == 1);
	
		return smallest;
		
}
}
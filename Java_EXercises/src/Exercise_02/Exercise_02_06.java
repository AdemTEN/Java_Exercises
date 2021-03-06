/*
(Sum the digits in an integer) Write a program that reads an integer between 0 and
1000 and adds all the digits in the integer. For example, if an integer is 932, the
sum of all its digits is 14.
Hint: Use the % operator to extract digits, and use the / operator to remove the
extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.
*/
package Exercise_02;

import java.util.Scanner;

public class Exercise_02_06 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a integer number value between 0 and 1000: ");
		int number = input.nextInt();
		
		int lessthan10 = number % 10;
		int remainNumber = number / 10;
		int tens = remainNumber % 10;
		int hundreds = remainNumber / 10;
		int sumOfDigits = lessthan10 + tens + hundreds;
				
		System.out.println("Sum of the digits is: " + sumOfDigits);
		
	
	
	
	}

}

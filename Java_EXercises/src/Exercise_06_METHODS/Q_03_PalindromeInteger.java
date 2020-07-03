/*
(Palindrome integer) Write the methods with the following headers
// Return the reversal of an integer, i.e., reverse(456) returns 654
public static int reverse(int number)

// Return true if number is a palindrome
public static boolean isPalindrome(int number)

Use the reverse method to implement isPalindrome. A number is a palindrome
if its reversal is the same as itself. Write a test program that prompts the
user to enter an integer and reports whether the integer is a palindrome.
*/
package Exercise_06_METHODS;

import java.util.Scanner;

public class Q_03_PalindromeInteger {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number :");
		int number = scan.nextInt();
		System.out.println("Is " + number + " palindrom? " + isPalindrom(number));
		scan.close();
	}

	public static boolean isPalindrom(int number) {
		boolean flag  = true;
		int r = 0;
		int temp = 0;
		int sum = 0;
		temp = number;

		while (number > 0) {
			r = number % 10;
			sum = sum * 10 + r;
			number /= 10;

		}
		
		if (temp == sum) {
			flag = true;
		} else {
			flag =  false;
		}
		return flag;
	}
}
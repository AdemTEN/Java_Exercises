/*
(Palindrome number) Write a program that prompts the user to enter a three-digit
integer and determines whether it is a palindrome number. A number is palindrome
if it reads the same from right to left and from left to right.
*/


package Exercise_03;

import java.util.Scanner;

public class Exercise_03_13palindrom {

	public static void main(String[] args) {

		Scanner scanner =  new Scanner (System.in);
		System.out.println("Enter thre digit number:");
		int number = scanner.nextInt();
		int d1 = number / 100;
		int d2 = (number % 100) / 10;
		int d3 = (number % 100) % 10;
		
		
//		if (d1 == d3) {
//		System.out.println(number +" number is a palindrom number"  );
//		}else {
//			System.out.println(number + " number is not a palindrom number");
//		}
		
	    System.out.println( number + ((d1 == d3) ? " number is " : " number is not a ") + " palindrom");
		
		
		
		
		
		
		
	}

}

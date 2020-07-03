/*
(Business: check ISBN-10) An ISBN-10 (International Standard Book Number)
consists of 10 digits: d1d2d3d4d5d6d7d8d9d10. The last digit, d10, is a checksum,
which is calculated from the other nine digits using the following formula:
(d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 +
d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11
If the checksum is 10, the last digit is denoted as X according to the ISBN-10
convention. Write a program that prompts the user to enter the first 9 digits and
displays the 10-digit ISBN (including leading zeros). Your program should read
the input as an integer. Here are sample runs:
*/
package Exercise_03;

import java.util.Scanner;

public class Exercise_03_09 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter 9 digit integer numbers: ");
		int d1 = scanner.nextInt();
		int d2 = scanner.nextInt();
		int d3 = scanner.nextInt();
		int d4 = scanner.nextInt();
		int d5 = scanner.nextInt();
		int d6 = scanner.nextInt();
		int d7 = scanner.nextInt();
		int d8 = scanner.nextInt();
		int d9 = scanner.nextInt();
		
		int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 +
				d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
		
		if(d10 == 10) {
			System.out.println("" + d1  + d2 +  d3 +  d4 + d5 +  d6 + d7+  d8 + d9 + "X");
		}else {
			System.out.println(d1+  d2 +  d3 +  d4 
		+ d5 + d6 + d7 + d8 + d9 + d10);
		}
		
		
		
		
		
	}

}

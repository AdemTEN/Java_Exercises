/*
(Use the &&, || and ^ operators) Write a program that prompts the user to enter
an integer and determines whether it is divisible by 5 and 6, whether it is divisible
by 5 or 6, and whether it is divisible by 5 or 6, but not both. Here is a sample run
of this program:
*/
package Exercise_03;

import java.util.Scanner;

public class Exercise_03_26 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter an integer number: ");
		int number = scan.nextInt();
		
		if((number % 5 == 0) && (number % 6 == 0) ) {
			System.out.println(number + " is divisible by 5 and 6");
		}
		if (number % 5 == 0 || number % 6 == 0) {
			System.out.println(number + " is divisible by 5 or 6");
		}
		if ((number % 5 == 0 || number % 6 == 0)){
			if (number % 5 != 0 && number % 6 != 0){
				System.out.println(number + " is divisible by 5 or 6, but not both");
			}
		}
		
		
		
		
		
		
		
		
		
		
	}

}

/*
(Financial application: monetary units) Rewrite Listing 2.10, ComputeChange
.java, to fix the possible loss of accuracy when converting a double value to an
int value. Enter the input as an integer whose last two digits represent the cents.
For example, the input 1156 represents 11 dollars and 56 cents.
*/
package Exercise_02;

import java.util.Scanner;

public class Exercise_02_22 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
	    System.out.println("Enter an integer value: ");
		int value = input.nextInt();
		
		int dollars = value / 100;
		int currentcent = value % 100;
		int quarter = currentcent / 25;
		currentcent = currentcent % 25;
		int dimes = currentcent /10;
		currentcent = currentcent % 10;
		int nickels = currentcent / 5;
		int cent = currentcent % 5;
		System.out.println(value +" cent= " + dollars  +" dollars, " + quarter + " quarter, " + dimes + " dimes, " 
		+ nickels +  " nickels, " + cent +  " cent");
		
		
		
		
		
		
		
		
		

		
	}

}

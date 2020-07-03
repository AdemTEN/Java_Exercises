/*
(Financial application: monetary units) Modify Listing 2.10, ComputeChange
.java, to display the nonzero denominations only, using singular words for single
units such as 1 dollar and 1 penny, and plural words for more than one unit such
as 2 dollars and 3 pennies./
*/
package Exercise_03;

import java.util.Scanner;

public class Exercise_03_07 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the total of cents:");
		int totalCent = scanner.nextInt();
		
		int dollar = totalCent / 100;
		int quarter = (totalCent % 100) /25;
		int dime = ((totalCent % 100) % 25)/10;
		int nickels = (((totalCent %100)%25)%10)/5;
		int pennies = (((totalCent %100)%25)%10)%5;
		System.out.println(totalCent + " Cents:");
		
		if (dollar > 1) {
			System.out.println(dollar + " dollars");
		}else {
			System.out.println(dollar + " dollar");
		}
		if (quarter > 1) {
			System.out.println(quarter +" quarters");
		}else {
			System.out.println(quarter + " quarter");
		}
		if (dime > 1) {
			System.out.println(dime + " dimes");
		}else {
			System.out.println(dime + " dime");
		}
		if (nickels > 1) {
			System.out.println(nickels + " nickels");
		}else {
			System.out.println(nickels + " nickel") ;
		}
		if (pennies > 1) {
			System.out.println(pennies + " pennies");
		}else {
			System.out.println(pennies + " pennie");
		}
		
		
		
		
		
		
		
		
	}

}

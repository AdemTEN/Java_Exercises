/*
(Population projection) Rewrite Programming Exercise 1.11 to prompt the user
to enter the number of years and displays the population after the number of years.
Use the hint in Programming Exercise 1.11 for this program. The population
should be cast into an integer. Here is a sample run of the program:
*/

package Exercise_02;

import java.util.Scanner;

public class Exercise_02_11 {
	
	public static void main (String []args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of year: ");
		int year = input.nextInt();
		
        double secondOfPerYear = 365 * 24 * 60 *60; 
        double currentPopulation = 312_032_486;
		double birthRate = secondOfPerYear / 7.0;
		double dieRate = secondOfPerYear / 13.0;
		double migrantRate = secondOfPerYear / 45.0;
		double oneYearOfNewPoulation = (birthRate + migrantRate) - dieRate;
		
		double totalPoulation = currentPopulation + (oneYearOfNewPoulation * year);
		
		System.out.println("Total population after " + year + " is: "  + (int)(totalPoulation));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

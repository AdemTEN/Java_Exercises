/*
(Financial application: calculate future investment value) Write a program that
reads in investment amount, annual interest rate, and number of years, and displays
the future investment value using the following formula:
							futureInvestmentValue =
		investmentAmount * (1 + monthlyInterestRate)^numberOfYears*12
For example, if you enter amount 1000, annual interest rate 3.25%, and number
of years 1, the future investment value is 1032.98.
*/
package Exercise_02;

import java.util.Scanner;

public class Exercise_02_21 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		System.out.println("Enter investmen amount:");
		double investmentAmount = input.nextDouble();
		System.out.println("Enter annual interest rate:");
		double annualRate = input.nextDouble();
		double monthlyRate = annualRate / 1200;
		System.out.println("Enter number of year:");
		int year = input.nextInt();
		
		double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyRate), (year * 12)) ;
		
		System.out.println("The furture investment Value is:" + futureInvestmentValue);
		
		
		
		
		
		
		
		
	}

}

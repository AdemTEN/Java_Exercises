/*
(Financial application: compute the future investment value) Write a method that
computes future investment value at a given interest rate for a specified number
of years. The future investment is determined using the formula in Programming
Exercise 2.21.
Use the following method header:
//public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years)
For example, futureInvestmentValue(10000, 0.05/12, 5) returns
12833.59.
Write a test program that prompts the user to enter the investment amount (e.g.,
1000) and the interest rate (e.g., 9%) and prints a table that displays future value
for the years from 1 to 30,
*/
package Exercise_06_METHODS;

import java.util.Scanner;

public class Q_07_FinancialAplication {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter investmen amount:");
		double investmentAmount = input.nextDouble();
		System.out.println("Enter annual interest rate:");
		double annualRate = input.nextDouble();
		double monthlyRate = annualRate / 1200;
		for (int year= 1; year<=30 ; year++) {
		
			System.out.println(year +".year= " + futureInvestmentValue(investmentAmount, monthlyRate, year));
		}
		
		
	}

	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){
		
		return investmentAmount * Math.pow((1 + monthlyInterestRate), (years * 12));
			
		
	}
}

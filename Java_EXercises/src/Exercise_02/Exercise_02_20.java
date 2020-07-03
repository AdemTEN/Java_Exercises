/*
(Financial application: calculate interest) If you know the balance and the annual
percentage interest rate, you can compute the interest on the next monthly payment
using the following formula:
interest = balance * (annualInterestRate/1200)
Write a program that reads the balance and the annual percentage interest rate and
displays the interest for the next month.
*/

package Exercise_02;

import java.util.Scanner;

public class Exercise_02_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the balance:");
		double balance = input.nextDouble();
		System.out.println("Enter the annual interest rate:");
		double annulaInterestRate = input.nextDouble();
		double interest = balance * (annulaInterestRate / 1200);
		System.out.println("Interes for the next month: " + interest );
		
	}

}

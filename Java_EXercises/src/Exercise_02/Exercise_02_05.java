/*
(Financial application: calculate tips) Write a program that reads the subtotal
and the gratuity rate, then computes the gratuity and total. For example, if the
user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
as gratuity and $11.5 as total.
*/

package Exercise_02;

import java.util.Scanner;

public class Exercise_02_05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the rate: ");
		double gratuityRate = input.nextDouble();
		System.out.println("Enter the subtotal:");
		double subtotal = input.nextDouble();
		
		double gratuity = subtotal * (gratuityRate / 100);
		double total = subtotal +  gratuity;
		
		System.out.println("The gratuity is : $" + gratuity);
		System.out.println("The total is: $" + total);
		
		
		
		
		
		
		
		
		
		

	}

}

/*
(Financials: currency exchange) Write a program that prompts the user to enter
the exchange rate from currency in U.S. dollars to Chinese RMB. Prompt the user
to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to convert from
Chinese RMB and U.S. dollars. Prompt the user to enter the amount in U.S. dollars
or Chinese RMB to convert it to Chinese RMB or U.S. dollars, respectively.
*/

package Exercise_03;

import java.util.Scanner;

public class Exercise_03_31currecyExchange {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		System.out.print("Enter the exchange rate from dollars to RMB: ");
		double exchngeRate  = scan.nextDouble();
		System.out.print("Enter 0 to conver from US dollars to Chinese RMB and 1  vice versa: ");
		int number = scan.nextInt();
		
		if(number == 0){
			System.out.print("Enter the dollar amount: ");
			double dollarAmount = scan.nextDouble();
			System.out.println(dollarAmount +"$ is " +  (dollarAmount * exchngeRate) + "RMB");
			
		} else if(number == 1 ){
			System.out.print("Enter the RMB amount: ");
			double rmbAmount = scan.nextDouble();
			System.out.println(rmbAmount +"RMB is " +  (rmbAmount /  exchngeRate) + "$");
			
		}else {
			System.out.println("Invalid value. Please entr 0 or 1");
		}
		
	}

}

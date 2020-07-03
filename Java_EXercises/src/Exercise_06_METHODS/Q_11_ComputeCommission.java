/*
(Financial application: compute commissions) Write a method that computes the
commission, using the scheme in Programming Exercise 5.39. The header of the
method is as follows:
public static double computeCommission(double salesAmount)
Write a test program that displays the following table:
               Sales Amount        Commission
               --------------------------------
               10000                 900.0
               15000                1500.0
               ...
               95000               11100.0
               100000              11700.0
*/
package Exercise_06_METHODS;

public class Q_11_ComputeCommission {

	public static void main(String[] args) {
		System.out.println("Sales Amount\tCommission\n"
				+ "--------------------------");
		for (int salesAmount = 10000; salesAmount<=100000; salesAmount +=5000) {
			System.out.print(salesAmount+ "\t\t");
			System.out.print( computeCommission(salesAmount));
			System.out.println();
		}
		
		
	}
	public static double computeCommission(double salesAmount) {
		double commission = 0;
		
		double rate = 0.10;
		for (double i = salesAmount; i<=salesAmount; i++) {
			commission = commission + (salesAmount * rate);	
		}
		
		return commission;
	}

}

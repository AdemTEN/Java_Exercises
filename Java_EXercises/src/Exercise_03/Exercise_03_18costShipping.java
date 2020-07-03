/*
(Cost of shipping) A shipping company uses the following function to calculate
the cost (in dollars) of shipping based on the weight of the package (in
pounds).
							
							 3.5, if 0 < w < = 1
			     c(w) =  5.5, if 1 < w < = 3
							 8.5, if 3 < w < = 10
							 10.5, if 10 < w < = 20
Write a program that prompts the user to enter the weight of the package and
display the shipping cost. If the weight is greater than 50, display a message “the
package cannot be shipped.”
*/
package Exercise_03;

import java.util.Scanner;

public class Exercise_03_18costShipping {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter weight of packege: ");
		double weight = scan.nextDouble();
		
		double cost = 0;
		if (weight <= 1) {
			cost = 3.5;
		}else if (weight <= 3){
			cost = 5.5;
	
		}else if(weight <= 10 ) {
			cost = 8.5;
		}else if (cost <=20) {
			cost = 10.5;
		}else if(weight > 50) {
			System.out.println("the package cannot be shipped");
		}
		
		System.out.println("The cost is: " + cost);
	}

}

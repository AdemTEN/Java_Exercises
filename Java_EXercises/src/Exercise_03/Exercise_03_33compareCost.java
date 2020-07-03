/*
(Financial: compare costs) Suppose you shop for rice in two different packages.
You would like to write a program to compare the cost. The program prompts the
user to enter the weight and price of the each package and displays the one with
the better price.
*/
package Exercise_03;

import java.util.Scanner;

public class Exercise_03_33compareCost {

	public static void main(String[] args) {

		Scanner scan =new Scanner (System.in);
		System.out.print("Enter weight and price for packege 1: ");
		double weight1 = scan.nextDouble();
		double cost1 = scan.nextDouble();
		System.out.print("Enter weight and price for packege 2: ");
		double weight2 =scan.nextDouble();
		double cost2 = scan.nextDouble();
		
		double packege1priceInOneKilo =  cost1 / weight1;
		double packege2priceInOneKilo = cost2 / weight2;
		
		if (packege1priceInOneKilo > packege2priceInOneKilo) {
			System.out.println("Packege 2 is besser");
		}else if (packege1priceInOneKilo == packege2priceInOneKilo){
			System.out.println("Two packege is same ");
		}else {
			System.out.println("packege 1 is besser");
		}
		
		
		
	}

}

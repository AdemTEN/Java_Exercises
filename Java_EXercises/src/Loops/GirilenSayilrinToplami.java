package Loops;

import java.util.Scanner;

public class GirilenSayilrinToplami {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter what you add to sum (If you enter 0 system will be out): ");
		int data = scan.nextInt();

		int sum = 0;

		int counter =0;
		while (data != 0 && counter < 5) {
			System.out.print(sum + "+" + data + "=");
			sum += data;
			
			System.out.println(sum);
			
			System.out.print("Enter what you add to sum: ");
			data = scan.nextInt();
			counter++;
			
			

		}
		if (sum + data == sum) {
			System.out.println("you entr 0 and system out");
			System.out.println("0 has no Effect in Addition sum is same: " + sum );
		}else {
			System.out.println("Yoo have made 5 example.");
			System.out.println("the last result is: " + sum);
		}
		
		
		

	}
}

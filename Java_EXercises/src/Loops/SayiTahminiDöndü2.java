package Loops;

import java.util.Scanner;

public class SayiTahminiD�nd�2 {

	public static void main(String[] args) {

		int computer = (int) (Math.random() * 101);
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("Guess a number between 0 and 100: ");
			int user = scan.nextInt();

			if (computer == user) {
				System.out.println("Bildiniz. the number is :" + computer);
				System.exit(0);
			} else if (computer < user) {
				System.out.println("B�y�k bir sayi girdiniz: ");
			} else {
				System.out.println("K�c�k bir sayi girsiniz:");
			}
		}

	}
}

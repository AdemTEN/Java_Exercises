package Loops;

import java.util.Scanner;

public class SayiTahmini_WhileDöngüsü {

	public static void main(String[] args) {
		
		int computer = (int)(Math.random() * 101);

		Scanner scan = new Scanner(System.in);
		System.out.print("Guess a number between 0 and 100: ");
		
		int user = scan.nextInt();
		
		System.out.println("Computer number is: " + computer);
		int count = 0;
		while(computer != user && count < 5) {
			count++;
			System.out.println("Try one more time:");
			user = scan.nextInt();
			
		}
		
		System.out.println("Congrat you win");
	}

}

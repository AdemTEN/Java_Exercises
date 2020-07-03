package UserInput;

import java.util.Scanner;

public class Task_73 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		int secretNumber = (int)(Math.random() * 20) + 1;
		int guess;
		int count = 0;
		do {
			
			System.out.println("Enter your guess number :");
			
			guess = scan.nextInt();
			if (guess<secretNumber) {
				System.out.println("Your number is too small");
				count++;
			}else if(guess>secretNumber) {
				System.out.println("Your guess is too large");
				count++;
			}else {
				System.out.println("Congrat, you get it.");
			}
			if (count == 5) {
			System.out.println("Sorry you enter 5 times:");
				break;
			
			}
			
		}while(guess != secretNumber);
		
		System.out.println("Secret number is:" + secretNumber);
		System.out.println("Your guess is: " + guess);
	}

}

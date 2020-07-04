package String.stringw3resource;

import java.util.Random;
import java.util.Scanner;

public class CoinToss {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random random = new Random();

		String yesOrNO;
		int userCoin;
		int computerCoin;

		do {
			System.out.println("Head or Tails?");
			computerCoin = random.nextInt(2);
			System.out.print("Enter your guess,(Head = 0, Tail=1): ");
			userCoin = scan.nextInt();
			System.out.println();

			if (userCoin == computerCoin) {

				System.out.println("Congrat, You got it.");
				System.out.println("Computer is :" + computerCoin);
				System.out.println("Your guess is:" + userCoin);
				break;

			} else {

				System.out.println("Your guess is wrong");
				System.out.println("Computer is :" + computerCoin);
				System.out.println("Your guess is:" + userCoin);

				System.out.print("Do you want to continue:(y = YES, n= NO)");
			}
			yesOrNO = scan.next();

		} while (yesOrNO.equalsIgnoreCase("y"));

		System.out.println("GAME OVER");

	}

}

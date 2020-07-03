package CLASSES;

import java.util.Scanner;

public class CoinToss {

	public static void main(String[] args) {

		Coin toss = new Coin();
		Scanner scan = new Scanner (System.in);
		System.out.println("How many times do you want to toss the coin: ");
		int times = scan.nextInt();
		int head = 0;
		int tail = 0;
		for (int i = 1; i<= times; i++) {
			String x = toss.getSideUp();
			if (x== "Head") {
				head++;
			}else {
				tail++;
			}
			
			
		}
		System.out.println("Head is:" + head);
		System.out.println("Tail is:" +tail);
	}

}

class Coin {

	String sideUp;

	String getSideUp() {
		int side = (int) (Math.random() * 2);
		if (side == 1) {
			return "Head";
		} else {
			return "Tail";
		}
	}

}

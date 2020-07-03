package Loops;

import java.util.Scanner;

public class additionalQuit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		System.out.println(number1 + "+" + number2 + "=?" );
		
		int toplam = scan.nextInt();
		int wrongcount = 0;
		while(number1 + number2 != toplam && wrongcount < 3) {//if we give three times wrong answer.system put us out.5
			wrongcount++;
			System.out.println(number1 + "+" + number2 + "=?" );
			 toplam = scan.nextInt();
		}
		
		if (number1 + number2 == toplam) {
			System.out.println("congrat! you haave know");
		}else {
			System.out.println("study a little bit more");
		}
		
		
		
//		System.out.println("Tebrikler dogru cevap"); wrongCount olmazsa yazilabilir.
		
		
		
		
		
		
		
		
		
	}
}

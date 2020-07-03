package Loops;

import java.util.Scanner;

public class SayiTahminTekSans_IfStatement {

	public static void main(String[] args) {
		
		int computer = (int)(Math.random() * 101);

		Scanner scan = new Scanner(System.in);
		System.out.print("Guess a number between 0 and 100: ");
		
		int user = scan.nextInt();
		
		while(computer != user) {
			if (computer < user){
				System.out.println("büyük bir sayi girdiniz:");
			}else {
				System.out.println("Kücük bir sayi girdiniz:");
			}
			System.out.print("Guess a number between 0 and 100: ");
			user = scan.nextInt();
		}
		System.out.println("Tebrikler bilsiniz");
		

	}

}

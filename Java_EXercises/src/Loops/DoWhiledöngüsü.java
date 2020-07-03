package Loops;

import java.util.Scanner;

public class DoWhiledöngüsü {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		
		int number;
		int sum = 0;
		
		do {
			System.out.println("Enter a value;");
			number = scan.nextInt();
			sum += number;
		}
		while (number != 0);
			System.out.println(sum);
			
			
			
			
		}
		
		
		
		
		
		
		
	}



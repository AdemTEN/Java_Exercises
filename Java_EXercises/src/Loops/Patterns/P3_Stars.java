package Loops.Patterns;

import java.util.Scanner;

public class P3_Stars {

	public static void main(String[] args) {

		
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter rows numbers: ");
		int rows = scan.nextInt();
		
		for (int i = 1 ; i <= rows ; i++ ) {
			
			for ( int j = 1; j <= i;j++) {
				System.out.print("* ");
				
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
	}

}

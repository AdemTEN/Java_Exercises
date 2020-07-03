package Exercise_06_METHODS;

import java.util.Scanner;

public class Q_17_Matrix {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter the value of n: ");
		int n = scan.nextInt();
		printMatrix(n);
	}

	public static void printMatrix(int n) {
		int number = 0;
		for (int i =1; i <=n; i++) {
			for (int j = 1;j <=n ; j++) {
				number = (int)(Math.random() * 2);
				System.out.print(number+ " ");
			}
			System.out.println();
		}
	}
}

package Loops.Patterns;

public class P16 {

	public static void main(String[] args) {

		int row = 5;

		for (int i = 1; i <= row; i++) {

			for (int j = 5; j > row-i ; j--) {
				System.out.print(j + " ");
			}
			for (int k = 0; k <= row-i; k++) {
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}

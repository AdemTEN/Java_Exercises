package Loops.Patterns;

public class P15 {

	public static void main(String[] args) {

		int row = 5;

		for (int i = 0; i < row; i++) {

			for (int j = 5; j > i ; j--) {
				System.out.print(j + " ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}

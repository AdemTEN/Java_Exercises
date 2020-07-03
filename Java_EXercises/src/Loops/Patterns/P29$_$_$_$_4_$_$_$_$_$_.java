package Loops.Patterns;

public class P29$_$_$_$_4_$_$_$_$_$_ {

	public static void main(String[] args) {

		int row = 7;
		int counter = 5;
		for (int i = 0; i < row; i++) {

			for (int j = counter; j >= (1)  ; j-- ) {
				System.out.print(j + " ");
				
			}
			counter--;
			System.out.println();

		}
		row = 4;
		counter = 2;
		for (int i = 1; i <= row ;i++ ) {
			
			for (int j = counter; j >= 1 ; j--) {
				System.out.print(j+ " " );
			}
			for (int k = row-i; k >= 1; k--) {
				System.out.print(" ");
			}
			counter++;
			System.out.println();
		}

	}

}

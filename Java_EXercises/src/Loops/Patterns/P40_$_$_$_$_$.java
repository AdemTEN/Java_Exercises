//    *
//   ***
//  *****
// *******
//*********
// *******
//  *****
//   ***
//    *
package Loops.Patterns;

public class P40_$_$_$_$_$ {

	public static void main(String[] args) {

		int row = 5;

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= row - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			for (int l = i - 1; l >= 1; l--) {
				System.out.print("*");
			}
			System.out.println();
		}

		row = 4;
		int temp = 1;

		for (int i = 0; i < row; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= row - i; k++) {
				System.out.print("*");
			}
		
			for (int l = row - temp; l >= 1; l--) {
				System.out.print("*");
			
			}
			temp++;
			System.out.println();
		}

	}

}

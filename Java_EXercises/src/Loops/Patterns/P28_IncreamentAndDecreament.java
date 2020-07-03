//1 2 3 4 5 
//1 2 3 4 
//1 2 3 
//1 2 
//1 
//1 2 
//1 2 3 
//1 2 3 4 
//1 2 3 4 5 

package Loops.Patterns;

public class P28_IncreamentAndDecreament {

	public static void main(String[] args) {

		int row = 5;

		for (int i = 0; i < row; i++) {

			for (int j = 1; j <= row - i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();

		}
		row = 4;
		for (int i = 1; i <= row ;i++ ) {
			
			for (int j = 1; j <= (i+1); j++) {
				System.out.print(j+ " " );
			}
			for (int k = 1; k <= row-i; k++) {
				
			}
			System.out.println();
		}

	}

}

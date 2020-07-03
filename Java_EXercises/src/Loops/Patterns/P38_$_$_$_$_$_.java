//    1 
//   1 2 
//  1 2 3 
// 1 2 3 4 
//1 2 3 4 5 
// 1 2 3 4 
//  1 2 3 
//   1 2 
//    1 




package Loops.Patterns;

public class P38_$_$_$_$_$_ {

	public static void main(String[] args) {

		int row = 5;

		for (int i = 1; i <= row; i++) {

			for (int j = 1; j <= row - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(k + " ");

			}
			System.out.println();
		}

		row = 4;
		
		for (int i = 0; i<row   ;i++ )  {
			
			for (int j = 0 ; j <=i ; j++) {
				System.out.print(" ");
			}
			for (int k=1; k<=row -i  ;k++  ) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
	}

}

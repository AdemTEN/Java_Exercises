//1
//1 2 1
//1 2 3 2 1
//1 2 3 4 3 2 1
//1 2 3 4 5 4 3 2 1
//1 2 3 4 5 6 5 4 3 2 1
//1 2 3 4 5 6 7 6 5 4 3 2 1
package Loops.Patterns;

public class P41_$_$_$_$_$_$_$ {

	public static void main(String[] args) {
		
		int row = 7;
		
		for (int i = 1; i<= row ; i++   ) {
			
			for (int j = 1 ; j <= i ; j++    ) {
				System.out.print(j+ " ");
			}
			for (int l = i-1  ; l>=1   ;l--    ) {
				System.out.print(l+ " ");
			}
			System.out.println();
		}

		
	}

}

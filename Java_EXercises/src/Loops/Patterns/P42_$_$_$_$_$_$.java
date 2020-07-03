//1111111
//1111122
//1111333
//1114444
//1155555
//1666666
//7777777
package Loops.Patterns;

public class P42_$_$_$_$_$_$ {

	public static void main(String[] args) {

		
		int row = 7;
		
		for (int i = 1; i <= row ; i++  ) {
			
			for (int j = 1 ; j <= row-i ; j++    ) {
				System.out.print(1);
			}
			for (int k = 1; k<=i ;k++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}

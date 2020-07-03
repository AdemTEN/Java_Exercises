package Loops.Patterns;

public class P9_AlhabetPyramid {

	public static void main(String[] args) {
		int alphabet = 65;
		int row = 5;
		
		for (int i = 1;i <= row; i++) {
			
			for (int j = 1 ; j <= row-i ;j++ ) {
				System.out.print(" ");
				
			}
			for (int k=1; k <= i ; k++) {
				System.out.print((char)(alphabet + k -1)+ " ");
			}
			System.out.println();
		}
		
		
		
		
		
	}

}

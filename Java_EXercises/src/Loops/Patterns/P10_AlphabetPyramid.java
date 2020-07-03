package Loops.Patterns;

public class P10_AlphabetPyramid {

	public static void main(String[] args) {
		
		int alphabet = 65;
		int row = 5;
		
		for (int i = 0; i < row ;i++) {
			
			for(int j = 0; j <row-i ;j++  ) {
				System.out.print(" ");
			}
			for(int k = row-i; k <= row ; k++ ) {
				System.out.print((char)(alphabet + k -1 )+ " ");
			}
			System.out.println();

		}
				
	}

}

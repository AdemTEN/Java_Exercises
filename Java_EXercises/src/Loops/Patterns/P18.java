package Loops.Patterns;

public class P18 {

	public static void main(String[] args) {

		int alphabet = 65;
		int row = 5;
		
		for (int i = 1;  i <= row ; i++) {
			
			for (int j = 0 ; j <= row-i ; j++) {
				System.out.print((char)(alphabet + j)+ " " );
			}
//			for (int k = 0 ; k <= i ; k++) {
				
			
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}

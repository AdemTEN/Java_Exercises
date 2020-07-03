package Loops.Patterns;

public class P19 {

	public static void main(String[] args) {

		int alphabet = 65;
		
		int row = 5;
		
		for(int i = 0; i <row; i++) {
		
			for (int j = 1; j <= row-i; j++  ) {
				System.out.print((char)(alphabet + row -j) +" " );
				
				
			}
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}

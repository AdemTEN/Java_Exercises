package Loops.Patterns;

public class P5_Alphabet {

	public static void main(String[] args) {
		int alphabet = 65;
		int rows = 6;
		
			for(int i = 1 ; i <= rows ;i++ ){
			
				for (int j = 1; j <=i ;j++) {
					
					System.out.print((char)(alphabet + i-1) + " ");
					
				}
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}

//1010101
//0101010
//1010101
//0101010
//1010101
//0101010
//1010101

package Loops.Patterns;

public class P44_$_$_$_$_$_$$$$__$$$__ {

	public static void main(String[] args) {

		int row = 7;
		
		for (int i = 1; i <= row; i++) {
			
			for(int j = 1; j<= row; j++) {
				
				if (i%2 != 0) {
					if (j%2 != 0) {
						System.out.print(1);
					}else {
						System.out.print(0);
					}
				}else if(i%2 == 0) {
					if (j%2 != 0) {
						System.out.print(0);
					}else {
						System.out.print(1);
					}
				}
			}
			
			System.out.println();
			

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

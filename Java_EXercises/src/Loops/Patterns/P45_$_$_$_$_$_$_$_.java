//1 
//2 6 
//3 7 10 
//4 8 11 13 
//5 9 12 14 15 
package Loops.Patterns;

public class P45_$_$_$_$_$_$_$_ {

	public static void main(String[] args) {

		int row = 5;
		
		for (int i = 1; i <= row; i++   ) {
			
			int number = i;
			for (int j = 1 ; j <=i ; j++   ) {
				
				System.out.print(number + " ");
				number = number + row - j;
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}

}

//        * 
//      * * 
//    * * * 
//  * * * * 
//* * * * * 
//  * * * * 
//    * * * 
//      * * 
//        * 


package Loops.Patterns;

public class P27_IncreamentAndDecreament {
	
	public static void main(String[] args) {
		
		int row = 5;
	
		for(int i = 1; i <=row; i++) {
			
			for(int j=1; j<=row-i; j++) {
				System.out.print("  ");
				
			}
			for(int k=1 ;k <=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		row = 4;
		for (int i = 1; i<=4 ;i++) {
			
			for(int j= 1; j<=i; j++) {
				System.out.print("  ");
			}
			for(int k= 0;k<=row-i ;k++ ) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}

}

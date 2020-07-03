//      1
//     212
//    32123
//   4321234
//  543212345
// 65432123456
//7654321234567
// 65432123456
//  543212345
//   4321234
//    32123
//     212
//      1

package Loops.Patterns;

public class P47_EnisinSorusu {

	public static void main(String[] args) {

		int row = 50;
		for (int i = 1; i<=50  ;i++) {
			
			for (int j = 1;j <= row-i; j++) {
				System.out.print("   ");
			}
			for (int k = i; k >= 1; k--) {
				System.out.printf("%3d",k  );
			}
			for ( int l = 2; l <= i ;l++) {
				System.out.printf("%3d", l);
			}
			
			System.out.println();
		}
		
			row = row -1;
		for (int i = 0; i <row;i++) {
			
			for (int j = 0 ; j <= i ; j++) {
				System.out.print("   ");
			}
			for (int k = row -i ;k >=1 ;k--) {
				System.out.printf("%3d", k);
			}
			for(int l = 2 ;l <=row-i; l++) {
				System.out.printf("%3d", l);
			}
			System.out.println();
			
				
		}
		
		
		
	}

}

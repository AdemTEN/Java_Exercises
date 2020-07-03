/*
(Algebra: solve 2 * 2 linear equations) You can use Cramer’s rule to solve the following
2 * 2 system of linear equation:

		ax + by = e         x = (ed - bf) / (ad - bc)           y = (af - ec) / (ad - bc)
		cx + dy = f       	                                            

Write a program that solves the following equation and displays the value for x and y:
					
					3.4x + 50.2y = 44.5
					2.1x + .55y = 5.9
*/


package Exercise_01;

public class Exercise_01_13 {

	public static void main(String[] args) {
		
		System.out.println("ax + by = e");
		System.out.println("cx + dy = f");
		System.out.println("x = (ed - bf) / (ad - bc)");
		System.out.println("y = (af - ec) / (ad - bc)");
		System.out.println("3.4x + 50.2y = 44.5");
		System.out.println("2.1x + .55y = 5.9");
		
		double x = (44.5 * 0.55 - 50.2 * 5.9) / (3.4 * 0.55 - 50.2 * 2.1);
		
		double y = (3.4 * 5.9 - 44.5 * 2.1) / (3.4 * 0.55 - 50.2 * 2.1);
		
		
		System.out.println("X = " + x);
		System.out.println("Y = " + y);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}

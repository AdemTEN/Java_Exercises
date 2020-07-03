/*
(Average speed in kilometers) Assume a runner runs 24 miles in 1 hour, 40 minutes,
and 35 seconds. Write a program that displays the average speed in kilometers per
hour. (Note that 1 mile is 1.6 kilometers.)
*/

package Exercise_01;

public class Exercise_01_12 {

	public static void main(String[] args) {
		
		double kmOfRunner = 24 * 1.6;
		
		double secondOfRunner = (100 * 60) + 35;
		double averageRunner = (kmOfRunner * 3600.0) / secondOfRunner;
		
		System.out.println("The average of Runner is: " + averageRunner);
 		

		
	}

}

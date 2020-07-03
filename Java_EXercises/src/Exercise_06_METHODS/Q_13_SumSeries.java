/*
(Sum series) Write a method to compute the following series:
	m(i) = 1 / 2 + 2 / 3 + ... + i / (i + 1)
Write a test program that displays the following table:
i       m(i)
--------------
1        0.5000
2        1.1667
...
19       16.4023
20       17.3546
*/
package Exercise_06_METHODS;

public class Q_13_SumSeries {

	public static void main(String[] args) {
		
		System.out.println("i       m(i)\n"
				+ "----------------");
		for (int i = 1; i <= 20; i++) {
			System.out.print(i+"       ");
			System.out.println(sumSeries(i));
		}
	}
	public static double sumSeries(double i) {
		double m = 0;
		for (double j = 1 ; j <= i; j++ ) {
			m = m + (j / (j + 1));
		}
		return m;
	}
}

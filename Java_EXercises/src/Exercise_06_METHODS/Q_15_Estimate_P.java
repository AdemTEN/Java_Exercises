package Exercise_06_METHODS;

public class Q_15_Estimate_P {

	public static void main(String[] args) {

		System.out.println("i             m(i)\n"
				+ "--------------------");
		for (int i = 1; i <=901; i+=100) {
			System.out.print(i+ "          ");
			System.out.print(estimatePI(i));
			System.out.println();
		}
		
		
	}
	
	public static double estimatePI(double n) {
		double m = 0;
		for (double j = 1; j<=n; j++ ) {
			m = m + ((Math.pow(-1, (j+1))) / ((2 * j) - 1));
		}
		m *= 4;
		return m;
	}

}

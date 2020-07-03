package Exercise_06_METHODS;

public class Q_09_MetersToFeet {

	public static void main(String[] args) {

		System.out.println("Feet\tMeters\t|\tMeters\tFeet\n"
				+ "-------------------------------------");
		for(double feet = 1.0, meters = 20.0; feet<=10.0; feet++, meters += 5.0  ) {
			System.out.print(feet+ "  ");
			System.out.print(footToMeter(feet)+ " ");
			System.out.print("\t|\t");
			System.out.print(meters+ "  ");
			System.out.println(meterToFeet(meters));
		}
		
		
		
		
	}
	public static double meterToFeet(double meter) {
		
		return 3.279 * meter;
	}
	public static double footToMeter(double foot) {
		
		return 0.305 * foot;
	}

}

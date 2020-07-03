
package Exercise_01;

public class Exercise_01_11 {

	public static void main(String[] args) {

		double secondOfPerYear = 365 * 24 * 60 *60; 
		
		double birthRate = secondOfPerYear / 7.0;
		double dieRate = secondOfPerYear / 13.0;
		double migrantRate = secondOfPerYear / 45.0;
		double oneYearOfNewPoulation = (birthRate + migrantRate) - dieRate; 
	
		double currentPopulation = 312_032_486;
		
		double firstYearOfPupulation = currentPopulation + oneYearOfNewPoulation;
		double secondYearOfPoupulation = firstYearOfPupulation + oneYearOfNewPoulation;
		double thirdYearOfPopulation = secondYearOfPoupulation + oneYearOfNewPoulation;
		double fourthYearOfPopulation = thirdYearOfPopulation + oneYearOfNewPoulation;
		double fifthYearOfPopulation = fourthYearOfPopulation + oneYearOfNewPoulation;
		
		System.out.println("1. year of population: " + firstYearOfPupulation);
		System.out.println("2. year of Population: " + secondYearOfPoupulation);		
		System.out.println("3. year of population: " + thirdYearOfPopulation );
		System.out.println("4. year of population: " + fourthYearOfPopulation);
		System.out.println("5. year of Population: " + fifthYearOfPopulation );
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

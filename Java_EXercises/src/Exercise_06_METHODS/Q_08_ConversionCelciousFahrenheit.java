//
//	(Conversions between Celsius and Fahrenheit) Write a class that contains the following
//	two methods:
//	
//	/** Convert from Celsius to Fahrenheit */
//	public static double celsiusToFahrenheit(double celsius)
//	/** Convert from Fahrenheit to Celsius */
//	public static double fahrenheitToCelsius(double fahrenheit)

//	The formula for the conversion is:
//	fahrenheit = (9.0 / 5) * celsius + 32
//	celsius = (5.0 / 9) * (fahrenheit – 32)
package Exercise_06_METHODS;

public class Q_08_ConversionCelciousFahrenheit {

	public static void main(String[] args) {

		double celcious = 65;
		double fahenheit = 75;
		
		System.out.println(celcious + " celcious = " + celciousToFahrenheit(celcious) + " fahrenheit");
		System.out.println(fahenheit + " fahrenheit = " + celciousToFahrenheit(fahenheit) + "celcious");
	}
   public static double celciousToFahrenheit (double celcious) {
	   return (9.0/ 5) * celcious + 32;
   }
   
   public static double fahrenheitToCelcious(double fahrenheit) {
	  
	   return (5.0 / 9) * (fahrenheit - 32);
   }
}

package Exercise_06_METHODS.Internet;

public class LeapYear {

	public static void main(String[] args) {
		boolean lepYear = leapYear(1900);
		System.out.println(lepYear);

	}
	
	public static boolean leapYear (int year) {
		return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ;
	}

}

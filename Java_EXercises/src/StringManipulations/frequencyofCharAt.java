package StringManipulations;

public class frequencyofCharAt {

	public static void main(String[] args) {

		String str = "Welcome to Java Portal";
		String vorname = "Welcomr to here";
		System.out.println(str.compareTo(vorname));
		int count = 0 ;
		for (int i = 1; i<=str.length()-1; i++) {
			if (str.charAt(i) == 't') {
				count++;
			}
			
			
		}
		System.out.println("The frequency of t is: " + count );
	}

}

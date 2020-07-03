package StringManipulations;

public class CharAtOddNumbers {

	public static void main(String[] args) {

		String str = "Welcome to Java portal";
		for ( int i = 1; i<=str.length(); i++) {
			if (i % 2 != 0) {
				System.out.println("Char at " + i + " place " + str.charAt(i)+ "\n");
			}
		}
	}

}

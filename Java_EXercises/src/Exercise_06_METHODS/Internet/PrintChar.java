package Exercise_06_METHODS.Internet;

public class PrintChar {

	public static void main(String[] args) {

		printCharacter();
	}

	public static void printCharacter() {
		char ch1;
		
		for ( ch1 = 'z'; ch1>='A'; ch1-- ) {
			System.out.print(ch1 +" ");
		}

	}
}

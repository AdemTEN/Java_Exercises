/*
(Display characters) Write a method that prints characters using the following
header:
public static void printChars(char ch1, char ch2, int numberPerLine)

This method prints the characters between ch1 and ch2 with the specified numbers
per line. Write a test program that prints ten characters per line from 1 to Z.
Characters are separated by exactly one space.
*/

package Exercise_06_METHODS;

public class Q_12_DisplayCharacters {

	public static void main(String[] args) {

		printChars('1', 'Z', 1);
		
	}
	
	public static void printChars(char ch1, char ch2, int numberPerLine) {
		
		
		for (char c = ch1; c <= ch2; c++) {
			numberPerLine++;
			if (numberPerLine % 10 == 0) {
			
				System.out.print(c+ "\n");
			}else {
				System.out.print(c+ " ");
			}
			
		}
	}

}

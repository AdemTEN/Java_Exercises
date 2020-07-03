/*
(Math: pentagonal numbers) A pentagonal number is defined as n(3n–1)/2 for
n = 1, 2, . . ., and so on. Therefore, the first few numbers are 1, 5, 12, 22, . . . .
Write a method with the following header that returns a pentagonal number:

public static int getPentagonalNumber(int n)

Write a test program that uses this method to display the first 100 pentagonal
numbers with 10 numbers on each line.
*/


package Exercise_06_METHODS;

public class Q_01_pentagonalNumbers {

	public static void main(String[] args) {
		final int NUMBER_OF_LINE = 10;
		for (int i = 1;i <= 100; i++ ) {
			if (i % NUMBER_OF_LINE == 0) {
				System.out.printf("%6d\n" , getPentagonalNumbers(i));
				
			}else {
				System.out.printf("%6d" , getPentagonalNumbers(i));
			}
		}
		
	}

	public static int getPentagonalNumbers(int n) {
		
		return (n * (3 * n -1)) / 2;  
	
	}
	
	}


/*
(Display patterns) Write a method to display a pattern as follows:
                  1
                2 1
              3 2 1
    ...
    n n-1 ... 3 2 1
The method header is
public static void displayPattern(int n)
*/

package Exercise_06_METHODS;

import java.util.Scanner;

public class Q_06_DisplayPattern {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter row numbers of the pattern: ");
		int numberOfRows = input.nextInt();
		displayPattern(numberOfRows);
	}
	
	public static void displayPattern(int n) {
		
		for (int i = 1; i<=n;i++) {
			
			for (int j= i; j<=n-1; j++ ) {
				System.out.print("  ");
			}
			for(int k = i; k>=1;k--) {
				System.out.print(k+ " ");
			}
			System.out.println();
		}
		
		
		
		
	}

}

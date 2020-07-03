package Exercise_06_METHODS.Internet;

public class Pentagon {
	
	public static void main(String[] args) {
		
		final int LINE = 10;
		int n ;
		for (n = 1; n<= 50; n++ ) {
			System.out.printf("%-6d", pentagonalNumber(n));
			if (n % LINE == 0) {
				
				System.out.println();
			}
			
		}

	}
	
	public static int pentagonalNumber( int n) {
		
		return (n * (3 * n - 1)) / 2; 
		
		}
		
	}



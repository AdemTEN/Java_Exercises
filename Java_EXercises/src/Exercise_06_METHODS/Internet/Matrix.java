package Exercise_06_METHODS.Internet;

public class Matrix {

	public static void main(String[] args) {

		Matrix(10);
		
	}
	public static void Matrix (int row) {
		
		for (int i = 1; i <=row;i++) {
			for (int j = 1;j <=row ; j++) {
				System.out.print((int)(Math.random() * 2) + " ");
			}
			System.out.println();
		}
	}

}

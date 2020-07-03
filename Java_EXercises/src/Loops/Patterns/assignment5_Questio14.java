package Loops.Patterns;

public class assignment5_Questio14 {

	public static void main(String[] args) {



		for (int i = 1; i <= 8; i++) {

			for (int j = 1; j <= 9; j++) {

				if (j == 1 || j == (i + 1)) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
	}

}
}
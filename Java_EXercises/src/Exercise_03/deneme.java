package Exercise_03;

import java.util.Scanner;

public class deneme {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
	    System.out.println("Enter your number:");
	    int num = s.nextInt();
			System.out.println(num/10000);
				System.out.println(num/1000%10);
				System.out.println(num/100%10);
				System.out.println(num/10%10);
				System.out.println(num%10);
	}

}


/*
(Print a table) Write a program that displays the following table. Cast floatingpoint
numbers into integers.
a 		b 		pow(a, b)
1 		2 		1
2 		3 		8
3 		4 		81
4 		5 		1024
5 		6 		15625
*/
package Exercise_02;

public class Exercise_02_18 {

	public static void main(String[] args) {
		
		int a; 
		int b;
		System.out.println("a     b     pow(a, b)");
		a = 1;b = 2;
		int x = (int)Math.pow(a, b);
		System.out.println(a + "     " +b+ "    " +x    );
		
		a++;
		b++;
		x = (int)Math.pow(a, b);
		System.out.println(a + "     " +b+ "    " +x    );
		
		a++;
		b++;
		x = (int)Math.pow(a, b);
		System.out.println(a + "     " +b+ "    " +x    );
		
		a++;
		b++;
		x = (int)Math.pow(a, b);
		System.out.println(a + "     " +b+ "    " +x    );
		
		a++;
		b++;
		x = (int)Math.pow(a, b);
		System.out.println(a + "     " +b+ "    " +x    );
		
		
	}

}

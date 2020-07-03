package Exercise_03;

import java.util.Scanner;

public class Exercise_03_08 {

	public static void main(String[] args) {

	 Scanner scanner = new Scanner (System.in);
	 System.out.println("Enter three digit number:");
	 
	 int a = scanner.nextInt();
	 int b = scanner.nextInt();
	 int c = scanner.nextInt();
	 
	 if (a>b && a>c) {
		 if (b>c) {
			 System.out.println(a + " " + b +" "+ c);
		 }else {
			 System.out.println(a + " "+ c + " " +b);
		 }
		 
	 }else if (b>a && b>c) {
		 if (a>c) {
			 System.out.println(b + " " + a + " " + c );
		 }else {
			 System.out.println(b + " " + c + " " + a);
		 }
	 }else if (c>a && c>b) {
		 if (b>a) {
			 System.out.println(c + " " + b + " " + a);
		 }else {
			 System.out.println(c + " " + a + " " + b);
	 }
		 
		 
		 
		 
		 
	 
		
		 
		 
	 
	 // OR
//	 else if(b>a) {
//		 System.out.println(c + " " + b + " " + a);
//	 }else {
//		 System.out.println(c + " " + a + " " + b);
//	 }
	
	
	
	
	
	
	
	
	
	
	
	}

}
}
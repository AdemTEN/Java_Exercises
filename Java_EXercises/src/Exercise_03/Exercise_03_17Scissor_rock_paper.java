package Exercise_03;

import java.util.Scanner;

public class Exercise_03_17Scissor_rock_paper {

	public static void main(String[] args) {

		int program = (int)(Math.random() * 3);
		
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter your number:");
		int myNumber = scan.nextInt();
		
		System.out.print("The computer is: ");
		switch(program){
			case 0: System.out.println("scissor");break;
			case 1: System.out.println("rock");break;
			case 2: System.out.println("paper ");break;
		}	
		System.out.print("You are :");
			
		switch (myNumber) {
		case 0: System.out.println("scissor");break;
		case 1: System.out.println("rock");break;
		case 2: System.out.println("paper ");break;
	
		}
			
		if(program == myNumber) {
			System.out.println("It is a draw");
			
		}else {
			boolean win = (myNumber == 0 && program == 2 )
					|| (myNumber == 1 && program == 0)
					|| (myNumber == 2 && program == 1);
		   if (win) {
			System.out.println("you won");
		
		  }else {
			System.out.println("You lose");  
		  }
		}
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}



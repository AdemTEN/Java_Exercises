/*
(Game: pick a card) Write a program that simulates picking a card from a deck
of 52 cards. Your program should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10,
Jack, Queen, King) and suit (Clubs, Diamonds, Hearts, Spades) of the card.
Here is a sample run of the program:
*/
package Exercise_03;

public class Exercise_03_24pickACard {

	public static void main(String[] args) {

	
		int rank = (int)(Math.random() * 13) + 1;
		int suit = (int)(Math.random() * 4) + 1;
		
		System.out.println("Your rank is: ");
		switch(rank) {
		case 1: System.out.println("Ace");break;
		case 2: System.out.println(rank);break;
		case 3: System.out.println(rank);break;
		case 4: System.out.println(rank);break;
		case 5: System.out.println(rank);break;
		case 6: System.out.println(rank);break;
		case 7: System.out.println(rank);break;
		case 8: System.out.println(rank);break;
		case 9: System.out.println(rank);break;
		case 10:System.out.println(rank);break;
		case 11:System.out.println("Jack");break;
		case 12:System.out.println("Queen");break;
		case 13:System.out.println("King");break;
		
		}
		System.out.println("of");
		switch(suit) {
		case 1: System.out.println("Clubs");break;
		case 2: System.out.println("Diamond");break;
		case 3: System.out.println("Hearts");break;
		case 4: System.out.println("Spades");break;
		}
		
		}

}

package CLASSES;

import java.util.Scanner;

public class TestScoreObjects {

	public static void main(String[] args) {

		TestScore adem = new TestScore();
		TestScore sinem = new TestScore();
		TestScore saim = new TestScore();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter three test score of Sinem: ");
		sinem.score1 = scan.nextDouble();
		sinem.score2 = scan.nextDouble();
		sinem.score3 = scan.nextDouble();
		System.out.println("Results of the Tests Sinem: " + sinem.avereage());
		
		
	}

}

class TestScore {
	
	double score1;
	double score2;
	double score3;
	
	double avereage() {
		return (score1 + score2 + score3) / 3;
  	}
	
	
	
}
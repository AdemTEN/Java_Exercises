package StringReplQuestions;

import java.util.Scanner;

public class repl_78_Benim {

	public static void main(String[] args) {

		double premium = 0;
		int accidentsAmount = 0;
		int daysDrivenToWorkOrSchool = 0;
		int milesToWorkOrSchool = 0;
		String vehicleOwnership = "";
		String vehicleUsage = "";
		String continuousInsurance = "";
		String education = "";
		String name = "";
		String referenceNumber = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the CountyFarm car insurance!");
		System.out.println("Enter your name");
		name = scan.nextLine();
		System.out.println("Do you have a US driver license?");
		String answer = scan.nextLine();
		if (answer.equals("No")) {
			System.out.println("Invalid data!");
			System.exit(0);
		}
		System.out.println("Enter your zip code");
		String zipCode = scan.nextLine();
		if (zipCode.equals("20910") || zipCode.equals("20740")) {
			premium += 60;
		} else {
			if (zipCode.equals("22102") || zipCode.equals("22103")) {
				premium += 30;
			} else {
				premium += 50;
			}
		}
		System.out.println("Is this vehicle Owned, Financed, or Leased?");
		vehicleOwnership = scan.nextLine();
		if (vehicleOwnership.equals("Owned")) {
			premium += 10;
		} else {
			premium += 20;
		}
		System.out.println("How is this vehicle primarily used?");
		vehicleUsage = scan.nextLine();
		if (vehicleUsage.equals("Business")) {
			premium += 50;
		} else if (vehicleUsage.equals("Pleasure")) {
			premium += 10;
		} else if (vehicleUsage.equals("Commute")) {
			premium += 20;

			System.out.println("Days Driven To Work And/Or School");
			daysDrivenToWorkOrSchool = scan.nextInt();
			premium += (daysDrivenToWorkOrSchool * 5);

			System.out.println("Miles Driven To Work And/Or School");
			milesToWorkOrSchool = scan.nextInt();
			premium += (milesToWorkOrSchool * 1);
			scan.nextLine();
			
		}
		System.out.println("How old are you?");
		int age = scan.nextInt();
		if (age < 16) {
			System.out.println("Invalid data!");
			System.exit(0);
		} else if (16 <= age && age < 18) {
			premium *= 20;
		} else if (18 <= age && age <= 21) {
			premium *= 6;
		} else if (21 < age && age < 25) {
			premium *= 2;
		}
		System.out.println("How many years you've been driving?");
		int experience = scan.nextInt();
		if (experience > 0 && (age - experience) >= 16) {
			premium = premium - (experience * 5);
		} else {
			System.out.println("Invalid data!");
			System.exit(0);
		}
		scan.nextLine();
		System.out.println("Have you had any accidents in the last 5 years?");
		answer = scan.nextLine();
		if (answer.equalsIgnoreCase("Yes")) {
			System.out.println("How many?");
			accidentsAmount = scan.nextInt();
			premium += accidentsAmount * premium * 20 / 100;
		}
		System.out.println("Have you had continuous insurance for the past 12 months?");
		continuousInsurance = scan.nextLine();
		if (continuousInsurance.equalsIgnoreCase("No")) {
			premium *=  2;
		}
		System.out.println("What is the highest level of education you have completed?");
		education = scan.nextLine();

		if (education.equals("PhD") || education.equals("Bachelors") || education.equals("Masters")) {
			premium = premium - (premium * 5) / 100;
		} else if (education.equals("Doctors")) {
			premium = premium - (premium * 10) / 100;
		} else if (education.equals("Less than High School")) {

			premium = premium + (premium * 5) / 100;
		}

		System.out.println(name + ", here's your quote!");
		System.out.println("Start Your Policy Today For: $" + premium);
		referenceNumber = name.substring(0, 2) + age + name.substring(name.length() - 2) + zipCode
				+ education.replace(" ", "");
		referenceNumber = referenceNumber.toUpperCase();
		System.out.print("Reference number: " + referenceNumber);

	}

}

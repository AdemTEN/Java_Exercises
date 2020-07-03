package CLASSES;

public class Youtube_Java {

	public static void main(String[] args) {
		
		aircraft cessna172 =new aircraft();   // Create object
		aircraft piperSaratoga = new aircraft();// Crate object
		
		cessna172.passenger = 4; //like variable 
		cessna172.speed = 140;
		cessna172.fuelCapacity = 56.5;
		cessna172.fuelBurnRate = 9.5;
//		cessna172.fuelBurnRate = 23;//new value of fuelBurnRate
		cessna172.endurance  = cessna172.fuelCapacity  / cessna172.fuelBurnRate;
		
		System.out.println("Cessna 172 passenger: " + cessna172.passenger + " person");
		System.out.println("Cessna 172 speed: " + cessna172.speed + " mph" );
		System.out.println("Cessna 172 Fuel Capacity: " + cessna172.fuelCapacity + " galloons");
		System.out.println("Cessna 172 Fuel Burn Rate: " + cessna172.fuelBurnRate + " gph");
		System.out.println("Cessna 172 can stay air " + cessna172.endurance + " hours.\n");
		System.out.println("Cessna 172: ");
		cessna172.calculateEndurance();
		
		piperSaratoga.passenger = 6;
		piperSaratoga.fuelCapacity = 102.5;
		piperSaratoga.speed = 201 ;
		piperSaratoga.fuelBurnRate = 20.5;
		piperSaratoga.endurance = piperSaratoga.fuelCapacity / piperSaratoga.fuelBurnRate;
		
		System.out.println("\nPipersaratoga Passenger: " + piperSaratoga.passenger + " person");
		System.out.println("Pipersaratoga  Fuel Capacity " + piperSaratoga.fuelCapacity + " galloons");
		System.out.println("Pipersaratoga Speed: " + piperSaratoga.speed  +  " mph");
		System.out.println("Pipersaratoga  Fuel Burn Rate: " + piperSaratoga.fuelBurnRate + " gph");
		System.out.println("A poper can stay air " + piperSaratoga.endurance + " hours.\n" );
		System.out.println("Cessna PiperSaratogo: ");
		piperSaratoga.calculateEndurance();
		
	}

}

class aircraft{//Defining the class name
	int passenger;//Defining the class variables
	int speed;
	double fuelCapacity;
	double fuelBurnRate;
	double endurance;
	
	//Create a method in class
	void calculateEndurance() {
		
		double endurance;
		endurance = fuelCapacity / fuelBurnRate;
		System.out.println("The endurance is: " + endurance);
		
		
		
	}
	
}
package CLASSES;

import java.util.Scanner;

public class FreezingAndBoilingPoint {

	public static void main(String[] args) {

		FreezingAndBoiling temp = new FreezingAndBoiling();
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter temperature: ");
		temp.temperature = scan.nextDouble();
		
		if (temp.isEthylFreezing()) {
			System.out.println("Ethy alcohol will freeze");
		}
		if (temp.isEthylBoiling()) {
			System.out.println("Ethy alcohol will boil");
		}
		if (temp.isOxygenFreezing()) {
			System.out.println("Oxygen will freeze");
		}
		if (temp.isOxygenBoiling()) {
			System.out.println("Oxygen will boil ");

		}
		if (temp.isWaterFreezing()) {
			System.out.println("Water alcohol will freeze");
		}
		if (temp.isWaterBoiling()) {
			System.out.println("Water will boil");
		}
	}

}

class FreezingAndBoiling {

	double temperature;

	boolean isEthylFreezing() {
		if (temperature <= (-173)) {
			return true;
		} else {
			return false;
		}
	}

	boolean isEthylBoiling() {
		if (temperature >= 172) {
			return true;
		} else {
			return false;
		}
	}

	boolean isOxygenFreezing() {
		if (temperature <= (-362)) {
			return true;
		} else {
			return false;
		}
	}

	boolean isOxygenBoiling() {
		if (temperature >= (-306)) {
			return true;
		} else {
			return false;
		}
	}

	boolean isWaterFreezing() {
		if (temperature <= (32)) {
			return true;
		} else {
			return false;
		}
	}

	boolean isWaterBoiling() {
		if (temperature >= (212)) {
			return true;
		} else {
			return false;
		}
	}
}

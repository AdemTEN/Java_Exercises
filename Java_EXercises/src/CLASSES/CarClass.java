package CLASSES;

public class CarClass {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		car.yearModel = 2020;
		car.make = "Honda";
		car.speed = 120;
		int x = car.accelerate();
		System.out.println(x);
		x = car.accelerate();
		System.out.println(x);
		x = car.accelerate();
		System.out.println(x);
		System.out.println(car.accelerate());
		System.out.println(car.accelerate());
		System.out.println(car.brake());
		System.out.println(car.brake());
		System.out.println(car.brake());
		System.out.println(car.brake());
		System.out.println(car.brake());
	}

}

class Car{
	
	int yearModel;
	String make;
	int speed;
	
	
	int accelerate() {
		speed += 5;
		return speed;
	}
	int brake() {
		speed -= 5;
		return speed;
	}
}
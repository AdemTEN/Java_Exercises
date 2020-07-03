package CLASSES;

public class PersonalInformationClass {

	public static void main(String[] args) {

		PersonalInformation person1 = new PersonalInformation();
		PersonalInformation person2 = new PersonalInformation();
		PersonalInformation person3 = new PersonalInformation();
		
		person1.name = "Adem";
		person1.age = 38;
		person1.phoneNumber = "0177 46002";
		
		person2.name = "Oguz";
		person2.age = 36;
		person2.phoneNumber = "032232";
		
		person3.name = "Serkan";
		person3.age = 34;
		person3.phoneNumber = "03453";
		
		
		
		
		
	}

}

class PersonalInformation{
	
	String name;
	int age ;
	String phoneNumber;
}
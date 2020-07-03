package CLASSES;

public class EmployeeObjects {

	public static void main(String[] args) {

		Employee person1 = new Employee();
		Employee person2 = new Employee();
		Employee person3 = new Employee();
		
		person1.name = "Susan Meyer";
		person1.idNummer = 47899;
		person1.department = "Accounting";
		person1.position = "Vice President";
		
		person2.name = "Mark Jones";
		person2.idNummer = 39119;
		person2.department = "IT";
		person2.position = "Programmer";
		
		person3.name = "Joy Roger";
		person3.idNummer = 81774;
		person3.department = "Manufacturing";
		person3.position = "Engineer";
		
		System.out.println("Name\t\tIDNummer\tDepartment\t\tPosition"
				+ "\n____________________________________________________________________________");
		
		System.out.print(person1.name + "\t" + person1.idNummer + "\t\t" + person1.department + "\t\t" + person1.position+"\n" );
		System.out.print(person2.name + "\t" + person2.idNummer + "\t\t" + person2.department + "\t\t\t" + person2.position+"\n" );
		System.out.print(person3.name + "\t" + person3.idNummer + "\t\t" + person3.department + "\t\t" + person3.position );
		
		
		
		
		
		
		
		
	}

}

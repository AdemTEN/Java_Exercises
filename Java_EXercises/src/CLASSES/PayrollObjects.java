package CLASSES;

public class PayrollObjects {

	public static void main(String[] args) {

		Payroll worker1 = new Payroll();
		
		worker1.name = "Adem";
		worker1.idNumber = 2252;
		worker1.hourlyPayRate = 10.0;
		worker1.totalHours = 40;
		System.out.println("Total of " + worker1.name + " gross pay:  $" + worker1.empoyersGrossPay());
		
	}

}

class Payroll{
	
	String name;
	int idNumber;
	double hourlyPayRate;
	double totalHours;

	double empoyersGrossPay() {
		return hourlyPayRate * totalHours;
	}
}

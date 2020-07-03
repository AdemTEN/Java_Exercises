package CLASSES;

public class RetilItemObjects {

	public static void main(String[] args) {

		RetailItem item1= new RetailItem();
		
		item1.description = "Jacket";
		item1.unitOnHand = 12;
		item1.price = 59.95;
		
		System.out.println("Item # 1     " + item1.description + "        " + item1.unitOnHand + "        " + item1.price);
	}

}

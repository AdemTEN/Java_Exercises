package String.stringw3resource;

public class isBeginsColor {

	public static void main(String[] args) {
		
		System.out.println(isBeginsColor("blacksea"));

	}
	
	public static String isBeginsColor(String str) {
		
		if(str.indexOf("black")==0) {
			
			System.out.print("The string begins with the color: ");
			
			return str.substring(0, 5);
			
		}else if(str.indexOf("red")== 0) {
			
			System.out.print("The string begins with the color: ");
			
			return str.substring(0, 3);
			
		}else {
			
			return "";
		}
		
	}

}

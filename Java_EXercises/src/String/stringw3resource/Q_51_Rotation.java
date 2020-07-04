package String.stringw3resource;

public class Q_51_Rotation {

	public static void main(String[] args) {
		

		String str1 = "ABACD";
		String str2 = "CDABA";
		
		str1 = str1.concat(str1);
		if(str1.contains(str2)) {
			System.out.println("Strings are rotation of each other ");
			
		}else {
			System.out.println("Strings are not rotation of each other ");
		}
	}
		
}

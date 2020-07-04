package String.stringw3resource;

public class string_1 {

	public static void main(String[] args) {
		
		String str = "PHP Exercise and Pyhton Exercise";
		System.out.println(str.contains("and"));
		
		String str1 = "and and";
		String str2 = "and ve";
		System.out.println(str1.equals(str2));
		
		str = "Exercise";
		System.out.println(str.substring(str.length()-2).equalsIgnoreCase("se"));
		
		str1= "Exercise";
		str2= "   Exercise   ";
		System.out.println(str1.substring(0).equalsIgnoreCase(str2.substring(0)));
		str2 = str2.trim();
		System.out.println(str2);
		
				
				
				
				
	}

}
